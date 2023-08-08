package oop_exercises;

public class Interest {

	private int amount;
	private double interestRate;
	
	public Interest(int amount, int interestRate) {
		this.amount = amount;
		this.interestRate = interestRate;
	}
	
	public Interest(int amount) {
		this(amount,10);
	}
	
	double getRate()
	{
		return this.interestRate;
	}
	void setRate(int rate)
	{
		this.interestRate = rate;
	}
	int getAmount()
	{
		return this.amount;
	}
	void setAmount(int amount)
	{
		this.amount = amount;
	}
	
	double getInterest()
	{
		return amount*interestRate/100;
	}
	
}
