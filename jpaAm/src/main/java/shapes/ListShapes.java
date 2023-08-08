package shapes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb_1");
		EntityManager em = emf.createEntityManager();
		
		var shapes = em.createQuery("from shapes.Shape",Shape.class).getResultList();
		
		for(var shape: shapes)
		{
			System.out.println(shape.getId());
		}
		emf.close();
	}

}
