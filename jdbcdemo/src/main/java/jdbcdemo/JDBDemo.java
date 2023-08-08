package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBDemo {

	public static void main(String[] args) throws SQLException {
		Connection c = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;user=sa;password=<YourStrong@Passw0rd>;database=msdb;encrypt=true;trustServerCertificate=true");
		System.out.println(c.getClass());
		System.out.println("Connected To Sql Server!");
		c.close();
	}
}
