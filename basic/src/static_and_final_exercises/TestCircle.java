package static_and_final_exercises;

record Circle(int x, int y, int radius) {
	
	public double area() {
	
		return Math.PI * Math.pow(radius, 2);
	}
}

public class TestCircle {

	public static void main(String[] args) {
		
		var c1 = new Circle(5,4,3);
		Circle c2 = new Circle(5,4,4);
		// Getter Methods
		System.out.println(c1.x());
		System.out.println(c1.y());
		System.out.println(c2.radius());
		// AREA
		System.out.println(c2.area());
		// equals method
		System.out.println(c1.equals(c2));
		// toString
		System.out.println(c1.toString());
		System.out.println(c2);
		//hashcode
		System.out.println(c2.hashCode());
	}

}
