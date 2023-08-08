package static_and_final_exercises;

public class Counter {

	private  int counter;
	
	private static int objects;
	
	public Counter(int counter) {
		this.counter = counter;
		Counter.objects++;
	}

	public  void increment()
	{
		counter++;
	}
	
	public  void decrement()
	{
		counter--;
	}
	public  int getValue()
	{
		return counter;
	}
	
	public static int getObjects()
	{
		return Counter.objects;
	}
}

