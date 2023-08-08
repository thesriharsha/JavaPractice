package oops;

public class TestAccount {

	public static void main(String[] args)
	{
		Account a = new Account("Riyuzaki",123);
		Account b = new Account("Pavan", 132);
		
		a.deposit(500000);
		b.deposit(2000000);
		a.withdraw(500);
		b.withdraw(3000);
		System.out.println(a.getBalance());
		System.out.println(b.getBalance());
	}
}
