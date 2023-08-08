package com.flightinformationsystem.entities;
import java.time.LocalDate;
import java.time.LocalTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity
@Table(name= "flighthistories")	

public class FlightHistory {
	//@Column(name="departuretime")
	private LocalTime departureTime;
//	@Column(name="arrivaldate")
	private LocalDate arrivalDate;
	//@Column(name="arrivaltime")
	private LocalTime arrivalTime;
	//@Column(name="durationinminutes")
	
	
	private int durationInMinutes;
	private String aircraft;
	private String remarks;
	@Column(name="from_city")
	private String fromCity;
	@Column(name="to_city")
	private String toCity;
	
	
	@EmbeddedId
	private FlightId flightPk;
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name="from_city",referencedColumnName = "code", insertable = false, updatable = false)
	private City fromCityfk;
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name="from_city",referencedColumnName = "code",insertable = false, updatable = false)
	private City toCityfk;
	
	@ManyToOne
	//@MapsId("flightNo")
	@JsonIgnore
	@JoinColumn(name="flightNo",insertable = false, updatable = false)
	private Flight flights;
	
	

	public String getFromCity() {
		return fromCity;
	}

	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}

	public String getToCity() {
		return toCity;
	}

	public void setToCity(String toCity) {
		this.toCity = toCity;
	}

	public LocalTime getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(LocalTime departuretime) {
		this.departureTime = departuretime;
	}

	public LocalDate getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(LocalDate arrivaldate) {
		this.arrivalDate = arrivaldate;
	}

	public LocalTime getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(LocalTime arrivaltime) {
		this.arrivalTime = arrivaltime;
	}

	public Flight getFlights() {
		return flights;
	}

	public void setFlights(Flight flightno) {
		this.flights = flightno;
	}

	public int getDurationInMinutes() {
		return durationInMinutes;
	}

	public void setDurationInMinutes(int minutes) {
		this.durationInMinutes = minutes;
	}

	public String getAircraft() {
		return aircraft;
	}

	public void setAircraft(String aircraft) {
		this.aircraft = aircraft;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public City getFromCityfk() {
		return fromCityfk;
	}

	public void setFromCityfk(City fromcity) {
		this.fromCityfk = fromcity;
	}

	public City getToCityfk() {
		return toCityfk;
	}

	public void setToCityfk(City tocity) {
		this.toCityfk = tocity;
	}

	public FlightId getFlightPk() {
		return flightPk;
	}

	public void setFlightPk(FlightId flightpk) {
		this.flightPk = flightpk;
	}
	
	
}
