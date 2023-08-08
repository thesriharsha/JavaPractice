package day2;

import javax.persistence.*;
import java.util.*;


@Table(name="car1")
@Entity
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int number;
	
	@Column(name="make",length=30)
	private String brand;
	
	@Column(name="type",length=20)
	private String model;
	
	@ElementCollection
	@CollectionTable(name="Car_Accessories",
			joinColumns = @JoinColumn(name="car_num"))
	private Set<String> accessories = new HashSet<String>();

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Set<String> getAccessories() {
		return accessories;
	}

	public void setAccessories(Set<String> accessories) {
		this.accessories = accessories;
	}
	
	
	
	
}
