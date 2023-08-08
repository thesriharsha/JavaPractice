package basics;
import java.util.Objects;

import javax.persistence.*;


@Table(name="publishers")
@Entity(name="Publisher")
public class Publisher {
	
	@Id
	@Column(name="pub_id")
	private int id;
	
	@Column(name="pub_name")
	private String name;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name="country")
	private String country;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public int hashCode() {
		return this.id;
	}

	@Override
	public boolean equals(Object obj) {
		
		Publisher p = (Publisher) obj;
		return this.id==p.id;
	}

	@Override
	public String toString() {
		return "Publisher [id=" + id + ", name=" + name + ", city=" + city + ", state=" + state + ", country=" + country
				+ "]";
	}
	
	
}
