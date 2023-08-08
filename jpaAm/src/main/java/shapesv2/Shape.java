package shapesv2;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity(name="shapesv2.shape")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name="shapesv2")
@DiscriminatorColumn(name="shape_type",
				discriminatorType = DiscriminatorType.STRING
		)

public class Shape {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int xcord;
	private int ycord;
	public int getId() {
		return id;
	}
	
	public int getXcord() {
		return xcord;
	}
	public void setXcord(int xcord) {
		this.xcord = xcord;
	}
	public int getYcord() {
		return ycord;
	}
	public void setYcord(int ycord) {
		this.ycord = ycord;
	}
	
	
}
