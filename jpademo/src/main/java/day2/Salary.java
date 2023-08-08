package day2;
import javax.persistence.*;

@Table(name="salary")
@Entity
public class Salary {
	
	@EmbeddedId
	private SalaryPkey salarykey;
	
	@Column(name="salary")
	private int salary;

	public SalaryPkey getSalarykey() {
		return salarykey;
	}

	public void setSalarykey(SalaryPkey salarykey) {
		this.salarykey = salarykey;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
}
