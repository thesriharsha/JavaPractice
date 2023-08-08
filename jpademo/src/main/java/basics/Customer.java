package basics;

import java.util.Objects;

import javax.persistence.*;

@Table(name = "customers") // Specifies the primary table for the annotated entity.
@Entity(name = "Customers") // Specifies that the class is an entity
public class Customer {

	@Id // Specifies Primary key entity
	@Column(name = "name") // Specifies mapped column
	private String name;

	@Column(name = "email")
	private String email;

	@Column(name = "mobile")
	private String mobile;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", mobile=" + mobile + "]";
	}

	@Override
	public int hashCode() {
		int num = Integer.parseInt(this.mobile) / 2;
		return num;
	}

	@Override
	public boolean equals(Object obj) {
		Customer other = (Customer) obj;
		return this.name == other.name;
	}
}
