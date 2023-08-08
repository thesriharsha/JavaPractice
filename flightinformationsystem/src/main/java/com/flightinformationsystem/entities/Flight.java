package com.flightinformationsystem.entities;


import java.time.LocalTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Table(name="flights")
@Entity
public class Flight {
	
	@Id
	@Column(name="flight_no")
	private String flightNo;
	@Column(name="duration_in_minutes")
	private int durationInMinutes;
	@Column(name="departure_time")
	private LocalTime departureTime;
	@Column(name="arrival_time")
	private LocalTime arrivalTime;
	private String aircraft;
	@Column(name="from_city")
	private String fromCity;
	@Column(name="to_city")
	private String toCity;
	
	

	@ManyToOne//(fetch = FetchType.EAGER)
	@JoinColumn(name="from_city", referencedColumnName = "code",insertable = false, updatable = false)
	@JsonIgnore
	private City fromCityfk;
	
	@ManyToOne//(fetch = FetchType.EAGER)
	@JoinColumn(name="to_city",referencedColumnName = "code",insertable = false, updatable = false)
	@JsonIgnore
	private City toCityfk;
	
	@OneToMany(mappedBy = "flights")//, fetch = FetchType.EAGER)
	@JsonIgnore
	private List<FlightHistory> flightHistories;
	

	@OneToMany(mappedBy = "flights")//, fetch = FetchType.EAGER)
	@JsonIgnore
	private List<ScheduledFlight> scheduledFlights;
	
	public Flight() {
		super();
	}

	public Flight(String flight_no, int minutes, LocalTime departure_time, LocalTime arrival_time, String aircraft,
			String fcity, String tcity) {
		super();
		this.flightNo = flight_no;
		this.durationInMinutes = minutes;
		this.departureTime = departure_time;
		this.arrivalTime = arrival_time;
		this.aircraft = aircraft;
		this.fromCity = fcity;
		this.toCity = tcity;

	}

	public String getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	public int getDurationInMinutes() {
		return durationInMinutes;
	}

	public void setDurationInMinutes(int durationInMinutes) {
		this.durationInMinutes = durationInMinutes;
	}

	public LocalTime getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(LocalTime departureTime) {
		this.departureTime = departureTime;
	}

	public LocalTime getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(LocalTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getAircraft() {
		return aircraft;
	}

	public void setAircraft(String aircraft) {
		this.aircraft = aircraft;
	}

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

	public City getFromCityfk() {
		return fromCityfk;
	}

	public void setFromCityfk(City fromCityfk) {
		this.fromCityfk = fromCityfk;
	}

	public City getToCityfk() {
		return toCityfk;
	}

	public void setToCityfk(City toCityfk) {
		this.toCityfk = toCityfk;
	}

	public List<FlightHistory> getFlightHistories() {
		return flightHistories;
	}

	public void setFlightHistories(List<FlightHistory> flightHistories) {
		this.flightHistories = flightHistories;
	}

	public List<ScheduledFlight> getScheduledFlights() {
		return scheduledFlights;
	}

	public void setScheduledFlights(List<ScheduledFlight> scheduledFlights) {
		this.scheduledFlights = scheduledFlights;
	}

	
	
	
}
