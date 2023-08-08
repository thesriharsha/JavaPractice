package day2;
import javax.persistence.*;


public class AddCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb_1");
		EntityManager em = emf.createEntityManager();
		
		Car c = new Car();
	
		c.setBrand("Kia");
		c.setModel("Celtos");
		c.getAccessories().add("Steering wheel");
		c.getAccessories().add("Speakers");
		c.getAccessories().add("Rear Cam");
		
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		
		emf.close();
	}

}
