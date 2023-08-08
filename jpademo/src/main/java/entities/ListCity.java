package entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListCity {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("flightsystem");
		EntityManager em = emf.createEntityManager();
		
		var cities = em.createQuery("from entities.City", City.class).getResultList();
		for(City city: cities)
		{
			System.out.println("---------------"+city.getName()+"-----------------");
			for(Flight flight: city.getFrom_cities()) {
//				total+=emp.getSalary();
				System.out.print(flight.getFcity());
			}
		emf.close();
	}
}}
