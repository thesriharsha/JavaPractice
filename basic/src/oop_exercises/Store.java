package oop_exercises;

public class Store {

	private String name;
	private int price;
	private int qoh;
	
	
	public Store(String name, int price, int qoh)
	{
		this.name = name;
		this.price = price;
		this.qoh = qoh;
	}
	
	void print()
	{
		System.out.println(this.price);
		System.out.println(this.name);
		System.out.println(this.qoh);
	}
	
	void setPrice(int price)
	{
		this.price = price;
	}
	int getNetPrice()
	{
		return price*qoh;
	}
	void sale(int units)
	{
		if(this.qoh>=units)
		{
			qoh-=units;
			System.out.println(units+"sold");
		}
		else {
			System.out.println("Quantity insufficient");
		}
	}
	void purchase(int units)
	{
		this.qoh+=units;
		System.out.println(units+" purchased");
	}
	
}
