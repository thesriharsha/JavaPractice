package interfaces;

public interface AccountOperation {
	void deposit(int cash) throws NegativeValueException;
	double getBalance();
}
class InsufficientBalanceException extends Exception{
	public int amount;
	
}
class NegativeValueException extends Exception{
	
}

class Account implements AccountOperation{
	
	private int accountNumber;
	private String ahName;
	private double balance;
	public static int minBal = 1000;
	
	public Account(int accountNumber, String ahName,double balance) {
		super();
		this.accountNumber = accountNumber;
		this.ahName = ahName;
		this.balance = balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAhName() {
		return ahName;
	}
	public void setAhName(String ahName) {
		this.ahName = ahName;
	}
	
	public static int getMinBal()
	{
		return Account.minBal;
	}
	@Override
	public void deposit(int cash) throws NegativeValueException {
		if(cash>0)
			this.balance += cash;
		else
			throw new NegativeValueException();
		
	}
	public void withdraw(int amount) throws InsufficientBalanceException
	{
		if(minBal+amount <=this.balance)
		{
			this.balance-=amount;
			System.out.println("Withdraw Successfull");
		}
		else {
			throw new InsufficientBalanceException();
		}
	}
	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}
	
	
	
	public boolean equals(Object o)
	{
		Account ac = (Account)o;
		return this.accountNumber == ac.accountNumber;
	}
	public String toString()
	{
		return this.ahName;
	}
	public int hashcode()
	{
		return this.accountNumber;
	}
	
	
}



