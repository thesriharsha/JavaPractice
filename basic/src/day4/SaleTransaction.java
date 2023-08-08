package day4;

public class SaleTransaction {

	private int quantity;
	private int rate;
	// Class Variables
	private static double taxrate = 0.12;
	private static int object;
	
	public SaleTransaction(int rate,int quantity)
	{
		this.rate = rate;
		SaleTransaction.object++;
		this.quantity = quantity;
	}
	
	public SaleTransaction(int rate)
	{
		this.rate = rate;
		SaleTransaction.object++;
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
		return amount+amount*SaleTransaction.taxrate;
		
	}
	void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}
	void setRate(int rate)
	{
		this.rate = rate;
	}
	
	// Class Methods
	public static double getTaxRate()
	{
		return SaleTransaction.taxrate;
	}
	public static void setTaxRate(double rate)
	{
		SaleTransaction.taxrate = rate;
	}
	public static int objectCount()
	{
		return SaleTransaction.object;
	}
	
	//Main method
	public static void main(String[] args)
	{
		SaleTransaction s = new SaleTransaction(20,5);
		System.out.println(s.getAmount());
		SaleTransaction s1 = new SaleTransaction(20,5);
		System.out.println(objectCount());
	}
	
}
