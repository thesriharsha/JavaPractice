package shapes;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name="shapes.circle")
@Table(name="circles")
public class Circle extends Shape{
	
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea()
	{
		return Math.PI*radius*radius;
	}
	
}
