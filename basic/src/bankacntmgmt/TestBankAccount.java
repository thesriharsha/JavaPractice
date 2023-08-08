package bankacntmgmt;

public class TestBankAccount {

	public static void main(String[] args) throws Exception {
		
		BankAccount sh;
		sh = new BankAccount(101,"Sri Harsha",1000);
		sh.deposit(100);
		System.out.println(sh.getBalance());
		sh.withdraw(500);
		System.out.println(sh.getBalance());
		
		BankAccount bk;
		bk = new BankAccount(102, "Bharath Ram", 5000);
		
		
	}
}
