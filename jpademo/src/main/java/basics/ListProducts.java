package basics;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListProducts {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb"); // To interact with
																								// persistence specific
																								// persistence unit
		EntityManager em = emf.createEntityManager(); // To interact with persistence context
		var query = em.createQuery("from Products", Products.class); // Takes JPQL and returns query list
		var products = query.getResultList(); // to get the query results
		for (var p : products)
			System.out.println(p);
	}
}
