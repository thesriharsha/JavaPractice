package empdept;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListDepartment {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb_1");
		EntityManager em = emf.createEntityManager();
		
		var deps = em.createQuery("from empdept.Department",Department.class).getResultList();
		int i=0;
		for(Department dep:deps) {
			double total =0;
			System.out.printf("%s \n",dep.getDeptname());
			for(Employee emp: dep.getEmployees()) {
				total+=emp.getSalary();
				System.out.printf("%-15s : %5f \n",emp.getName(),emp.getSalary());
			}
			System.out.printf("Total Salary : %5f\n",total);
		}
		
		emf.close();
		
	}
}
