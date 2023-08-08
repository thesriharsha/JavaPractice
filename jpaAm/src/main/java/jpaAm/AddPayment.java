package jpaAm;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AddPayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb_1");
		EntityManager em = emf.createEntityManager();
		
		Payment p = new Payment();
		p.setAmount(10000);
		p.setDate_of_payment("04-07-2021");
		
		Student s = new Student();
		s.setName("Sri Harsha");
		
		p.setStudent(s);
		
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		
		emf.close();
	}

}
