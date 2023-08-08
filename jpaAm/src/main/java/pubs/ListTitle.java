package pubs;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_pubs");
		EntityManager em = emf.createEntityManager();
		
		List<Title> titles = em.createQuery("from pubs.Title",Title.class).getResultList();
		for( var title: titles)
		{
			System.out.println(title.getTitle_id()+ " "+title.getTitle()+" "+title.getPrice()+ " "+title.getPublisher().getPub_name());
		}
		
	}

}
