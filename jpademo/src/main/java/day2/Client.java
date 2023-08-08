package day2;

import javax.persistence.*;

@Embeddable
public class Client {
	
	@Column(length = 20)
	private String name;
	
	@Column(length=30)
	private String location;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
}
