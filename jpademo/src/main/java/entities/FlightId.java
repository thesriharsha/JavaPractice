package entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class FlightId implements Serializable{

	@Column
	private String flight_no;
	@Column
	private LocalDate departure_date;
	public FlightId()
	{
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(departure_date, flight_no);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FlightId other = (FlightId) obj;
		return Objects.equals(departure_date, other.departure_date) && Objects.equals(flight_no, other.flight_no);
	}
	
	
}
