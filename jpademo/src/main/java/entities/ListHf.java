//package entities;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//
//public class ListHf {
//	public static void main(String[] args) {
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("flightsystem");
//		EntityManager em = emf.createEntityManager();
//		
//		var hfs = em.createQuery("from entities.FlightHistory", FlightHistory.class).getResultList();
//		
//		for(var hf: hfs)
//		{
//			System.out.println(hf.getAircraft());
//		}
//	}
//}
