package oops;

public class Student {

	private int Admno;
	private String Name;
	private int feePaid;
	private int Course;
	
	private static int javaFee = 12000;
	private static int pythonFee= 10000;
	
	public Student(int ano, String name,int course)
	{
		this.Admno = ano;
		this.Name = name;
		this.Course = course;
	}
	public Student(int ano, String name, int fee, int course)
	{
		this.Admno = ano;
		this.Name = name;
		this.feePaid = fee;
		this.Course = course;
	}
	
	int getDue()
	{
		return feePaid;
	}
	
	int getTotalFee()
	{
		if(Course ==1)
		{
			return 12000;
		}
		else {
			return 10000;
		}
	}
	String getCourseName()
	{
		if(Course ==1)
		{
			return "Java";
		}
		else {
			return "Python";
		}
	}
	void payment(int pay)
	{
		feePaid +=pay;
	}
	
}
