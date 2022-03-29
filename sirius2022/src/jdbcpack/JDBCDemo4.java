package jdbcpack;
import java.sql.CallableStatement;
//https://fluvid.com/videos/detail/dagdEhdY88uABZRZw#.YkLaIevWXuY.link
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
//https://fluvid.com/videos/detail/8EL-9T3mAgcdvYYE9#.YkLrHAeExoE.link
public class JDBCDemo4 {
	public static void main(String[] args) throws Exception{
		//1 - load or register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//2 - establish the connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/sirius2022","root","root");
		//3 - prepare and execute the statement
		PreparedStatement stmt=con.prepareStatement("update users set flag=? where uname=?");
		stmt.setInt(1, 0);
		stmt.setString(2,"ramu");
		
		int no=stmt.executeUpdate();
		
		System.out.println("Numbers of rows updated...:"+no);
		
	}
}
