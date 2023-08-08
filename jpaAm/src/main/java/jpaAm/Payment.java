package jpaAm;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name="ono_payments")
@Entity(name="jpaAm.payment")
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int trans_id;
	
	private int amount;
	@Column(name="date_of_payment")
	private LocalDate date;
	
	
	
	@OneToOne(cascade = CascadeType.ALL, fetch= FetchType.LAZY)
	@JoinColumn(name="student_id",referencedColumnName = "student_id")
	private Student student;
	
	public int getId() {
		return trans_id;
	}

	public void setId(int id) {
		this.trans_id = id;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public LocalDate getDate_of_payment() {
		return date;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public void setDate_of_payment(String date) {
		this.date = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd-MM-uuuu"));
	}
	
}
