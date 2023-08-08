package day2;

import javax.persistence.*;


@Table(name="salary")
@Entity
@IdClass(SalaryPkey.class)
public class Salary2 {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Id
	@Column(name="month")
	private int month;	
	
	@Column(name="salary")
	private int salary;

	
	
	public Salary2(int id, int month, int salary) {
		super();
		this.id = id;
		this.month = month;
		this.salary = salary;
	}


	
}
