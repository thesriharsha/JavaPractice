package jpaAm;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb_1");
		EntityManager em = emf.createEntityManager();
		
		List<Student> students = em.createQuery("from jpaAm.student",Student.class).getResultList();
		
		for(var student: students)
		{
			System.out.printf("%s %d\n",student.getName(),student.getPayment().getAmount() );
		}
		
		emf.close();
	}
		
		
	}

