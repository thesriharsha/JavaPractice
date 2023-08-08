package dateWrapperClass;

public record Circle(int x, int y, int radius) {
	
	public double area() {
		return 3.14*radius*radius;
	}
	
}


