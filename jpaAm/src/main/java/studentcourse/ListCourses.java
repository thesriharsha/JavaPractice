package studentcourse;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListCourses {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb_1");
		EntityManager em = emf.createEntityManager();
		
		List<Course> courses = em.createQuery("from studentcourse.Course", Course.class).getResultList();
		
		for(Course course: courses)
		{
			System.out.println(course.getName());
			for(Student student: course.getStudent())
			{
				System.out.println(student.getName().indent(5));
			}
		}
		emf.close();
		

	}

}
