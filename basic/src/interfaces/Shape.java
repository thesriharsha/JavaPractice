package interfaces;

import java.util.Objects;

public interface Shape {
	double area();
	double circumference();
}

class Circle implements Shape{

	private int radius;
	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(radius, 2);
	}

	
	public double circumference() {
		// TODO Auto-generated method stub
		return 2*Math.PI*radius;
	}
	
	public int hashCode()
	{
		return (int)this.radius;
	}
	@Override
	public String toString()
	{
		return this.area()+"";
	}
	@Override
	public boolean equals(Object o)
	{
		Circle c = (Circle)o;
		return this.radius == c.radius;
	}

}

class Square implements Shape{
	
	private int side;
	public Square(int side) {
		super();
		this.side = side;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.pow(side,2);
	}

	@Override
	public double circumference() {
		// TODO Auto-generated method stub
		return 4*side;
	}

	@Override
	public int hashCode() {
		return (int) this.area();
	}

	@Override
	public String toString() {
		return this.area()+"";
	}

	@Override
	public boolean equals(Object obj) {
		Square other = (Square) obj;
		return this.side == other.side;
	}
	
	
	
}
