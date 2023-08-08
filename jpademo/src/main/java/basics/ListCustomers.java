package basics;

import javax.persistence.*;

public class ListCustomers {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb"); //To interact with persistence specific persistence unit
		EntityManager em = emf.createEntityManager(); // To interact with persistence context
		var query = em.createQuery("from Customers", Customer.class); //Takes JPQL and returns query list
		var customers = query.getResultList(); //to get the query results
		for(var c: customers)
			System.out.println(c);
	}

}
