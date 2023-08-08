package dateWrapperClass;

public class TestWrapper {

	public static void main(String[] args) {
	
		int a=10;
		System.out.println(a);
		Integer i =a; //BOXING
		
		int b = i; //Unboxing
		
		Object obj = a;
		Object obj2= i;
		
		int c = (Integer)obj;

	}

}
