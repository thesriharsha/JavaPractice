package oops;

public class Account {
	
	private int acno;
	private String ahname;
	private double balance;
	
	public Account(String name, int acno)
	{
		this.ahname = name;
		this.acno = acno;
	}
	
	void deposit(double amount)
	{
		this.balance += amount;
	}
	void withdraw(double amount)
	{
		this.balance -=amount;
	}
	double getBalance()
	{
		return balance;
	}
	
}
