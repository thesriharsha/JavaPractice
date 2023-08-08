package shapes;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name="shapes.square")
@Table(name="squares")
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
