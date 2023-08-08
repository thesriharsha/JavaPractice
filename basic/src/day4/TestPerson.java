package day4;

class Person{
	protected String name,email;
	
	public Person(String name, String email)
	{
		this.name = name;
		this.email = email;
	}
	public void print()
	{
		System.out.println(this.name);
		System.out.println(this.email);
	}
	void setEmail(String email)
	{
		this.email = email;
	}
	
}

class Teacher extends Person{
	private String subject;
	
	public Teacher(String name, String email, String subject)
	{
		super(name, email);
		this.subject =subject;
	}
	void setSubject(String subject)
	{
		this.subject = subject;
	}
	@Override
	public void print()
	{
		super.print();
		System.out.println(subject);
	}
}

class Student extends Person{
	
	private String course;
	public Student(String name, String email, String course)
	{
		super(name,email);
		this.course = course;
	}
	void setCourse(String course)
	{
		this.course = course;
	}
	public void print()
	{
		super.print();
		System.out.println(course);
	}
}

public class TestPerson {
	
	public static void main(String[] args)
	{
		
		
		
	}
	
}
