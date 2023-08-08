package jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class NamedQuery {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb");
		EntityManager em = emf.createEntityManager();
		
		
		var query =   em.createNamedQuery("ProductDetails");
		 List obj = query.getResultList();
		
		for(Object o:obj)
			if (o instanceof Object[] arr) {
				for (var s : arr) {
					System.out.println(s.toString());
				}
			}
			else
			System.out.println(o.toString());
		em.close();
		emf.close();

	}

}