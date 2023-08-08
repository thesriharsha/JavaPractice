//package entities;
//
//import java.time.LocalDate;
//import java.time.LocalTime;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.IdClass;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinColumns;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//@Entity
//@Table(name= "flighthistories")	
//@IdClass(FlightId.class)
//public class FlightHistory {
//	@Id
//	private String flight_no;	
//	@Id
//	private LocalDate departure_date;
//	private LocalTime departure_time;
//	private LocalDate arrival_date;
//	private LocalTime arrival_time;
//	@Column(name="duration_in_minutes")
//	private int minutes;
//	private String aircraft;
//	private String remarks;
//	
//	@ManyToOne
//	@JoinColumns({
//		@JoinColumn(name="from_city", referencedColumnName = "code",insertable = false, updatable = false),
//		@JoinColumn(name="to_city", referencedColumnName = "code",insertable = false, updatable = false)
//	})
//	private City1 city;
//	
//	@ManyToOne
//	@JoinColumn(name="flight_no",insertable = false, updatable = false)
//	private Flight1 hflight;
//
//	public String getFlight_no() {
//		return flight_no;
//	}
//
//	public void setFlight_no(String flight_no) {
//		this.flight_no = flight_no;
//	}
//
//	public LocalDate getDeparture_date() {
//		return departure_date;
//	}
//
//	public void setDeparture_date(LocalDate departure_date) {
//		this.departure_date = departure_date;
//	}
//
//	public LocalTime getDeparture_time() {
//		return departure_time;
//	}
//
//	public void setDeparture_time(LocalTime departure_time) {
//		this.departure_time = departure_time;
//	}
//
//	public LocalDate getArrival_date() {
//		return arrival_date;
//	}
//
//	public void setArrival_date(LocalDate arrival_date) {
//		this.arrival_date = arrival_date;
//	}
//
//	public LocalTime getArrival_time() {
//		return arrival_time;
//	}
//
//	public void setArrival_time(LocalTime arrival_time) {
//		this.arrival_time = arrival_time;
//	}
//
//	public int getMinutes() {
//		return minutes;
//	}
//
//	public void setMinutes(int minutes) {
//		this.minutes = minutes;
//	}
//
//	public String getAircraft() {
//		return aircraft;
//	}
//
//	public void setAircraft(String aircraft) {
//		this.aircraft = aircraft;
//	}
//
//	public String getRemarks() {
//		return remarks;
//	}
//
//	public void setRemarks(String remarks) {
//		this.remarks = remarks;
//	}
//
//	public City1 getCity() {
//		return city;
//	}
//
//	public void setCity(City1 city) {
//		this.city = city;
//	}
//
//	public Flight1 getHflight() {
//		return hflight;
//	}
//
//	public void setHflight(Flight1 hflight) {
//		this.hflight = hflight;
//	}
//	
//	
//}
