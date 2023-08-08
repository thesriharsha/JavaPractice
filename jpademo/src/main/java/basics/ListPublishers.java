package basics;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListPublishers {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_pubs");// To interact with
																								// persistence specific
																								// persistence unit
		EntityManager em = emf.createEntityManager();// To interact with persistence context
		var query = em.createQuery("from Publisher", Publisher.class); // Takes JPQL and returns query list
		var publishers = query.getResultList(); // to get the query results
		for (var p : publishers)
			System.out.println(p);
	}

}
