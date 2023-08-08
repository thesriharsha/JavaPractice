package day2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AddSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb");
		EntityManager em = emf.createEntityManager();
		
		Salary2 s = new Salary2(1,3,40000);
		SalaryPkey sk = new SalaryPkey();
		
		

	
		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();
		emf.close();
		
	}

}
