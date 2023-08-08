package studentcourse;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb_1");
		EntityManager em = emf.createEntityManager();
		
		List<Student> students = em.createQuery("from studentcourse.Student", Student.class).getResultList();
		
		for(Student student: students)
		{
			System.out.println(student.getName());
			for(Course course: student.getCourses())
			{
				System.out.println(course.getName().indent(5));
			}
		}
		emf.close();
	}

}
