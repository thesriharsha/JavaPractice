package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SaleDetails {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String url = "jdbc:sqlserver://localhost:1433;user=sa;password=<YourStrong@Passw0rd>;database=msdb;encrypt=true;trustServerCertificate=true";
		Connection c = DriverManager.getConnection(url);
		System.out.println("Enter the CatCode you want the details for ");
		Scanner sc = new Scanner(System.in);
		String catcode = sc.next();
		PreparedStatement ps = c.prepareStatement("SELECT Invno, prodname, Qty, Amount, Transdate from sales s join products p ON(s.ProdId = p.ProdId) where p.CatCode = ? ;");
		ps.setString(1, catcode);
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			System.out.printf("%-2d %-10s %4d %2f %s \n",rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDouble(4),rs.getDate(5));
		}
	}

}
