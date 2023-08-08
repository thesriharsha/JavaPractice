package day4;

public class OverseasEmp extends SalariedEmp{
	private int allowances;
	
	public OverseasEmp(String name, String job, int salary, int allowances)
	{
		super(name,job,salary);
		this.allowances = allowances;
	}
	@Override
	public void print()
	{
		super.print();
		System.out.println(this.allowances);
	}
	
	int getAllowances()
	{
		return this.allowances;
	}
	void setAllowances(int allowances) {
		this.allowances = allowances;
	}
}
