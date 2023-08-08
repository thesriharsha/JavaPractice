package exercises;

public class Product {

	private String name;
	private int price;
	private int quantity;
	
	public static int count=0;
	public Product(String name, int price, int quantity)
	{
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		count++;
	}
	
	void print()
	{
		System.out.println(this.price);
		System.out.println(this.name);
		System.out.println(this.quantity);
	}
	
	void setPrice(int price)
	{
		this.price = price;
	}
	int getNetPrice()
	{
		return price*quantity;
	}
	int sale()
	{
		return count;
	}
	void purchase(int quantity)
	{
		this.quantity = quantity;
	}
	
}
