package day3;

public class Sale {

	private int quantity;
	private int rate;
	
	
	public Sale(int rate,int quantity)
	{
		this.rate = rate;
		this.quantity = quantity;
	}
	
	public Sale(int rate)
	{
		this.rate = rate;
		this.quantity = 1;
	}
	
	int getQuantity()
	{
		return quantity;
	}
	int getRate()
	{
		return rate;
	}
	double getAmount()
	{
		double amount = quantity*rate;
		return amount+amount*0.12;
		
	}
	void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}
	void setRate(int rate)
	{
		this.rate = rate;
	}
	
	public static void main(String[] args)
	{
		Sale s = new Sale(20,5);
		System.out.println(s.getAmount());
	}
	
}
