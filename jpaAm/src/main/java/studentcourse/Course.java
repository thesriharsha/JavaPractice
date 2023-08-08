package studentcourse;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Table(name="mtm_courses")
@Entity(name="studentcourse.course")
public class Course {
	
	@Id
	private int course_id;
	private String name;
	
	@ManyToMany(mappedBy = "courses")
	Set<Student> students;

	public int getId() {
		return course_id;
	}

	public void setId(int id) {
		this.course_id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Student> getStudent() {
		return students;
	}

	public void setStudent(Set<Student> student) {
		this.students = student;
	}
	
}
