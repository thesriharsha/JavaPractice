package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class TotalSales {

	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:sqlserver://localhost:1433;user=sa;password=<YourStrong@Passw0rd>;database=msdb;encrypt=true;trustServerCertificate=true";
		Connection c = DriverManager.getConnection(url);
		System.out.println("Enter the Prodid you want the sales for ");
		Scanner sc = new Scanner(System.in);
		int prodid= sc.nextInt();
		PreparedStatement ps = c.prepareStatement("SELECT prodid, sum(Amount) as Total from sales where ProdId=? group by ProdId");
		ps.setInt(1, prodid);
		ResultSet rs = ps.executeQuery();	
		if(rs.next())
		{
			System.out.printf("%-5d %5s\n",rs.getInt("prodid"),rs.getInt("Total"));
		}
		else {
			System.out.printf("%-5d %5d\n",prodid,0);
		}
	}
}
