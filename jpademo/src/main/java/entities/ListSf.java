//package entities;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//
//public class ListSf {
//public static void main(String[] args) {
//	EntityManagerFactory emf = Persistence.createEntityManagerFactory("flightsystem");
//	EntityManager em = emf.createEntityManager();
//	
//	var sfs = em.createQuery("from entities.ScheduledFlight", ScheduledFlight.class).getResultList();
//	
//	for(var sf: sfs)
//	{
//		System.out.println(sf.getFlight_no());
//	}
//}
//}
