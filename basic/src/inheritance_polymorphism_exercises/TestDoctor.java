package inheritance_polymorphism_exercises;

abstract class Doctor {
	protected String name;
	protected String specialisation;

	public Doctor(String name, String specialisation) {
		this.name = name;
		this.specialisation = specialisation;
	}

	void print() {
		System.out.println(this.name);
		System.out.println(this.specialisation);
	}

	String getSpecialisation() {
		return this.specialisation;
	}

	String getName() {
		return this.name;
	}

	void setSpecialisation(String specialisation) {
		this.specialisation = specialisation;
	}

	abstract int getPay();

}

class ResidentDoctor extends Doctor {
	private int salary;

	public ResidentDoctor(String name, String specialisation, int salary) {
		super(name, specialisation);
		this.salary = salary;
	}

	@Override
	void print() {
		super.print();
		System.out.println(this.salary);
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	int getPay() {
		// TODO Auto-generated method stub
		return this.salary;
	}
	@Override
	public boolean equals(Object obj)
	{
		ResidentDoctor res = (ResidentDoctor)obj;
		return this.specialisation.equals(res.specialisation) ;
	}

}

class ConsultantDoctor extends Doctor {
	private int visits;
	private int ratePerVisit;

	public int getVisits() {
		return visits;
	}

	public void setVisits(int visits) {
		this.visits = visits;
	}

	public int getRatePerVisit() {
		return ratePerVisit;
	}

	public void setRatePerVisit(int ratePerVisit) {
		this.ratePerVisit = ratePerVisit;
	}

	public ConsultantDoctor(String name, String specialisation, int visits, int ratePerVisit) {
		super(name, specialisation);
		this.visits = visits;
		this.ratePerVisit = ratePerVisit;
	}

	@Override
	void print() {
		super.print();
		System.out.println(this.visits);
		System.out.println(this.ratePerVisit);
	}

	@Override
	int getPay() {
		// TODO Auto-generated method stub
		return visits * ratePerVisit;
	}

	@Override
	public String toString() {
		return this.name+" " + this.specialisation;
	}

}

public class TestDoctor {
	public static void main(String[] args) {

		ResidentDoctor cd1 = new ResidentDoctor("Sh", "Medical", 5);
		System.out.println(cd1);
		ResidentDoctor cd2 = new ResidentDoctor("Sh", "Medical", 5);
		System.out.println(cd2.equals(cd1));
	}

}
