package day3;

public class Square {

	private int side;
	
	public Square(int side)
	{
		this.side = side;
	}
		
	int getArea()
	{
		return side*side;
	}
	int getSide()
	{
		return side;
	}
	int getCircumference()
	{
		return 4*side;
	}
	
	
	public static void main(String[] args)
	{
		Square s = new Square(10);
		
		System.out.println(s.getArea());
		
	}
}

