package pubs;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListPublisher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_pubs");
		EntityManager em = emf.createEntityManager();
		
		var pubs = em.createQuery("from pubs.publishers", Publisher.class).getResultList();
		for( Publisher pub: pubs)
		{	int i=0;
			System.out.println(pub.getPub_name());
			for(var title: pub.getTitles())
			{
				System.out.println((++i)+ " : "+title.getTitle());
			}
			System.out.println("==========This publisher published "+i+" books=========");
		}
		
	}

}
