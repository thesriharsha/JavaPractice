package jpaAm;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AddStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb_1");
		EntityManager em = emf.createEntityManager();
		
		Student s = new Student();
		s.setName("Sri Harsha");
		
		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();
		emf.close();
	}

}
