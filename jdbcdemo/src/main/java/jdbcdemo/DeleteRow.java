package jdbcdemo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class DeleteRow {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:sqlserver://localhost:1433;user=sa;password=<YourStrong@Passw0rd>;database=msdb;encrypt=true;trustServerCertificate=true";
		Connection c  = DriverManager.getConnection(url);
		System.out.println("Enter the Invoice no of the sale you want to delete");
		Scanner sc = new Scanner(System.in);
		int invno = sc.nextInt();
		PreparedStatement ps = c.prepareStatement("Delete from sales where Invno=?");
		ps.setInt(1, invno);
		int count = ps.executeUpdate();
		if(count==1)
			System.out.println("Sale deleted Sucessfully!");
		else
			System.err.println("Invoice number not found!");
		//System.out.println("Deleted selected row");
		

	}

}
