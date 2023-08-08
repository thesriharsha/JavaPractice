package empdept;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListEmployee {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb_1");
		EntityManager em = emf.createEntityManager();
		
		var emps = em.createQuery("from empdept.Employee",Employee.class).getResultList();
		
		for(Employee emp:emps) {
			System.out.printf("%d %s %f %s \n",emp.getEmpid(), emp.getName(),emp.getSalary(),emp.getDepartment().getDeptname());
		}
		
		emf.close();
		
	}
}
