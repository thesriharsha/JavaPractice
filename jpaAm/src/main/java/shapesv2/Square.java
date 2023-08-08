package shapesv2;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name="shapesv2.square")
@Table(name="squaresv2")
@DiscriminatorValue("Square")
public class Square extends Shape{

	private int side;
	
	
	public int getSide() {
		return side;
	}


	public void setSide(int side) {
		this.side = side;
	}


	public int getArea()
	{
		return side*side;
	}
}
