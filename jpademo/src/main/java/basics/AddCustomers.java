package basics;

import javax.persistence.*;

public class AddCustomers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// To interact with emf by persistence unit
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb");
		EntityManager em = emf.createEntityManager(); // To interact with persistence context

		Customer c = new Customer();
		c.setName("Sri harsha");
		c.setEmail("sri235760@gmail.com");
		c.setMobile("9491265379");
		// Transaction started
		em.getTransaction().begin();
		em.persist(c); // instance managed and persisted
		em.getTransaction().commit(); // Transaction committed
		em.close();
		emf.close();
	}

}
