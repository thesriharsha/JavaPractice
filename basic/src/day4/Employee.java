package day4;

public class Employee {

	protected String name,job;
	
	public Employee(String name, String job)
	{
		this.name = name;
		this.job = job;
	}
	
	public void print()
	{
		System.out.println(this.name);
		System.out.println(this.job);
	}
}
