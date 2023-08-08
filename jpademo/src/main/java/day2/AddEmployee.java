package day2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import basics.Customer;

public class AddEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb");
		EntityManager em = emf.createEntityManager(); // To interact with persistence context

		Employee e = new Employee();
		e.setName("Harsha");
		// Transaction started
		em.getTransaction().begin();
		em.persist(e); // instance managed and persisted
		em.getTransaction().commit(); // Transaction committed
		em.close();
		emf.close();
	}

}
