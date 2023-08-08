package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Transaction {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		String url = "jdbc:sqlserver://localhost:1433;user=sa;password=<YourStrong@Passw0rd>;database=msdb;encrypt=true;trustServerCertificate=true";
		Connection c = DriverManager.getConnection(url);
		System.out.println("Enter the prodid ");
		c.setAutoCommit(false);
		int status;
		Scanner sc= new Scanner(System.in);
		try
		{
		PreparedStatement ps = c.prepareStatement("Update products set price= price*1.1 where prodid=?");
		System.out.println("Enter the product id 1");
		ps.setInt(1, sc.nextInt());
		status = ps.executeUpdate();
		if(status==0)
			throw new Exception();
		//System.out.println("Product id 1 updated Successfully");
		ps = c.prepareStatement("Update products set price= price*1.1 where prodid=?");
		System.out.println("Enter the product id 2");
		ps.setInt(1, sc.nextInt());
		status = ps.executeUpdate();
		if(status==0)
			throw new Exception();
		//System.out.println("Product id 2 updated Successfully");
		ps = c.prepareStatement("Update products set price= price*1.1 where prodid=?");
		System.out.println("Enter the product id 3");
		ps.setInt(1, sc.nextInt());
		status = ps.executeUpdate();
		if(status==0)
			throw new Exception();
		//System.out.println("Product id 3 updated Successfully");
		c.commit();
		System.out.println("All Changes Committed!");
	}
	catch(Exception e)
		{
			System.out.println("Process failed");
			c.rollback();
		}
		
		

}
	}
