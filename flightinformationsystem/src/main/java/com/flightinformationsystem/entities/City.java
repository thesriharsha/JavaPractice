package com.flightinformationsystem.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="cities")
public class City {

	@Id
	private String code;
	private String name;
	@Column(name="minutes_from_utc")
	private int minutes;
	private String country;

	
	
	public City() {
		super();
	}

	public City(String code, String name, int minutes, String country) {
		super();
		this.code = code;
		this.name = name;
		this.minutes = minutes;
		this.country = country;
	}

	@OneToMany(mappedBy = "fromCityfk")
	@JsonIgnore
	private List<Flight> fromCities;
	
	@OneToMany(mappedBy = "toCityfk")
	@JsonIgnore
	private List<Flight> toCities;



	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public List<Flight> getFromCities() {
		return fromCities;
	}

	public void setFromCities(List<Flight> fromCities) {
		this.fromCities = fromCities;
	}

	public List<Flight> getToCities() {
		return toCities;
	}

	public void setToCities(List<Flight> toCities) {
		this.toCities = toCities;
	}
}
