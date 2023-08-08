package shapes;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name="shapes.rectangle")
@Table(name="rectangles")
public class Rectangle extends Shape{

	private int length;
	private int breadth;
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public double getArea()
	{
		return length*breadth;
	}
}
