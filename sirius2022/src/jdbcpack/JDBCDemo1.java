package jdbcpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo1 {
	public static void main(String[] args) throws Exception{
		//1 - load or register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//2 - establish the connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/sirius2022","root","root");
		//3 - prepare and execute the statement
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from users");
		//4 - process the result
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getInt(4));
		}
		
	}
}
