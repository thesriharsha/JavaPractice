package day2;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class SalaryPkey  implements Serializable{
	
	@Column(name="id")
	private int id;
	@Column(name="month")
	private int month;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, month);
	}
	@Override
	public boolean equals(Object obj) {
		SalaryPkey other = (SalaryPkey) obj;
		return id == other.id;
	}
	@Override
	public String toString() {
		return "SalaryPkey [id=" + id + ", month=" + month + "]";
	}

}
