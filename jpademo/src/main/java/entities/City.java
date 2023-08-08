package entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.proxy.HibernateProxy;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="cities")
public class City {

	@Id
	private String code;
	private String name;
	@Column(name="minutes_from_utc")
	private int minutes;
	private String country;

	@OneToMany(mappedBy = "fcity")
	@JsonIgnore
	private List<Flight> from_cities = new ArrayList<Flight>();
	
	@OneToMany(mappedBy = "tcity")
	@JsonIgnore
	private List<Flight> to_cities = new ArrayList<Flight>();
	
	@Transient
	@JsonIgnore
	private HibernateProxy hibernateLazyInitializer;
//	@OneToMany(mappedBy = "sfcity")
//	private List<ScheduledFlight> sfrom_cities;
//	
//	@OneToMany(mappedBy = "stcity")
//	private List<ScheduledFlight> sto_cities;
//	
//	@OneToMany(mappedBy = "hfcity")
//	private List<FlightHistory>hfrom_cities;
//	
//	@OneToMany(mappedBy = "htcity")
//	private List<FlightHistory> hto_cities;

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

	public List<Flight> getFrom_cities() {
		return from_cities;
	}

	public void setFrom_cities(List<Flight> from_cities) {
		this.from_cities = from_cities;
	}

	public List<Flight> getTo_cities() {
		return to_cities;
	}

	public void setTo_cities(List<Flight> to_cities) {
		this.to_cities = to_cities;
	}
//
//	public List<ScheduledFlight> getSfrom_cities() {
//		return sfrom_cities;
//	}
//
//	public void setSfrom_cities(List<ScheduledFlight> sfrom_cities) {
//		this.sfrom_cities = sfrom_cities;
//	}
//
//	public List<ScheduledFlight> getSto_cities() {
//		return sto_cities;
//	}
//
//	public void setSto_cities(List<ScheduledFlight> sto_cities) {
//		this.sto_cities = sto_cities;
//	}
//
//	public List<FlightHistory> getHfrom_cities() {
//		return hfrom_cities;
//	}
//
//	public void setHfrom_cities(List<FlightHistory> hfrom_cities) {
//		this.hfrom_cities = hfrom_cities;
//	}
//
//	public List<FlightHistory> getHto_cities() {
//		return hto_cities;
//	}
//
//	public void setHto_cities(List<FlightHistory> hto_cities) {
//		this.hto_cities = hto_cities;
//	}
//	
	
	
	
	
}
