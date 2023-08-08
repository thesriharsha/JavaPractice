package jpaAm;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListPayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb_1");
		EntityManager em = emf.createEntityManager();
		
		List<Payment> payments = em.createQuery("from jpaAm.payment",Payment.class).getResultList();
		
		for(var pay: payments)
		{
			System.out.printf("%s %d\n",pay.getStudent().getName(), pay.getAmount());
		}
		
		emf.close();
	}

}
