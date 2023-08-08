package entities;


import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Table(name="flights")
@Entity
public class Flight {
	
	@Id
	private String flight_no;
	@Column(name="duration_in_minutes")
	private int minutes;
	
	private LocalTime departure_time;
	private LocalTime arrival_time;
	private String aircraft;
	
	@ManyToOne
	@JoinColumn(name="from_city", referencedColumnName = "code",insertable = false, updatable = false)
	@JsonIgnore
	private City fcity;
	
	@ManyToOne
	@JoinColumn(name="to_city",referencedColumnName = "code",insertable = false, updatable = false)
	private City tcity;

	public String getFlight_no() {
		return flight_no;
	}

	public void setFlight_no(String flight_no) {
		this.flight_no = flight_no;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public LocalTime getDeparture_time() {
		return departure_time;
	}

	public void setDeparture_time(LocalTime departure_time) {
		this.departure_time = departure_time;
	}

	public LocalTime getArrival_time() {
		return arrival_time;
	}

	public void setArrival_time(LocalTime arrival_time) {
		this.arrival_time = arrival_time;
	}

	public String getAircraft() {
		return aircraft;
	}

	public void setAircraft(String aircraft) {
		this.aircraft = aircraft;
	}

	public City getFcity() {
		return fcity;
	}

	public void setFcity(City fcity) {
		this.fcity = fcity;
	}

	public City getTcity() {
		return tcity;
	}

	public void setTcity(City tcity) {
		this.tcity = tcity;
	}
	
//	private String from_city;
//	private String to_city;
	
	
	
}
