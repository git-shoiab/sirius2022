package jdbcpack;
//https://fluvid.com/videos/detail/dagdEhdY88uABZRZw#.YkLaIevWXuY.link
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo2 {
	public static void main(String[] args) throws Exception{
		//1 - load or register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//2 - establish the connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/sirius2022","root","root");
		//3 - prepare and execute the statement
		PreparedStatement stmt=con.prepareStatement("select * from users where uid=?");
		stmt.setInt(1, 2);
		ResultSet rs=stmt.executeQuery();
		//4 - process the result
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getInt(4));
		}
		
	}
}
