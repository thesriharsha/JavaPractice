package day2;

import javax.persistence.*;

public class AddProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb_1");
		EntityManager em = emf.createEntityManager();
		Client c = new Client();
		c.setName("Tata");
		c.setLocation("Kolkata");
		
		Project p = new Project();
		p.setTitle("AI chatbot");
		p.setClient(c);
		
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		
		emf.close();
	}

}
