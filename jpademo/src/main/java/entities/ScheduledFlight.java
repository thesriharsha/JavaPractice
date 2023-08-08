//package entities;
//
//import java.time.LocalDate;
//import java.time.LocalTime;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.IdClass;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinColumns;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//import javax.persistence.Transient;
//
//@Entity
//@Table(name="scheduledflights")
//@IdClass(FlightId.class)
//public class ScheduledFlight {
//
//	@Id
//	private String flight_no;	
//	@Id
//	private LocalDate departure_date;
//	private LocalTime departure_time;
//	private LocalDate arrival_date;
//	private LocalTime arrival_time;
//	@Column(name="duration_in_minutes")
//	private int minutes;
//	
//	@ManyToOne
//	@JoinColumns({
//		@JoinColumn(name="from_city", referencedColumnName = "code",insertable = false, updatable = false),
//		@JoinColumn(name="to_city", referencedColumnName = "code",insertable = false, updatable = false)
//	})
//	private City city;
//	
//	@ManyToOne
//	@JoinColumn(name="flight_no",insertable = false, updatable = false)
//	private Flight1 sflight;
//
//	public LocalDate getDeparture_date() {
//		return departure_date;
//	}
//
//	public String getFlight_no() {
//		return flight_no;
//	}
//
//	public void setFlight_no(String flight_no) {
//		this.flight_no = flight_no;
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
//	public City1 getCity() {
//		return city;
//	}
//
//	public void setCity(City1 city) {
//		this.city = city;
//	}
//
//	public Flight1 getFlight() {
//		return sflight;
//	}
//
//	public void setFlight(Flight1 flight) {
//		this.sflight = flight;
//	}
//	
//}
