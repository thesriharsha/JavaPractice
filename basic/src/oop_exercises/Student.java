package oop_exercises;

public class Student {

	private int admno;
	private String name;
	private int feePaid;
	private int course;
	
	private static int javaFee = 12000;
	private static int pythonFee= 10000;
	
	public Student(int ano, String name,int course)
	{
		this.admno = ano;
		this.name = name;
		this.course = course;
	}
	public Student(int ano, String name,int course,int fee)
	{
		this(ano,name,course);
		this.feePaid = fee;
		
	}
	int getFeePaid()
	{
		return this.feePaid;
	}
	
	int getDue()
	{
		if(course ==1)
		{
			return javaFee-this.feePaid;
		}
		else {
			return pythonFee-this.feePaid;
		}
	}
	
	int getTotalFee()
	{
		if(course ==1)
		{
			return 12000;
		}
		else {
			return 10000;
		}
	}
	String getCourseName()
	{
		if(course ==1)
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

