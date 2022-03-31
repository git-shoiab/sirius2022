package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DBCon {
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	private static ThreadLocal<Connection> tLocal=new ThreadLocal<>();
	public static Connection getConnection() {
		Connection con=tLocal.get();
		if(con==null) {
			try {
			con=DriverManager.getConnection("jdbc:mysql://localhost/sirius2022","root","root");
			tLocal.set(con);
			return con;
			}catch(Exception e) {
				e.printStackTrace();
				return null;
			}
		}
		else {
			return con;
		}
	}
	
	public static void closeConnection() {
		Connection con=tLocal.get();
		if(con!=null) {
			try {
				con.close();
				tLocal.remove();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		es.execute(()->{
			System.out.println(DBCon.getConnection());
			System.out.println(DBCon.getConnection());
			DBCon.closeConnection();
			System.out.println(DBCon.getConnection());
		});
		
		es.execute(()->{
			System.out.println(DBCon.getConnection());	
			System.out.println(DBCon.getConnection());	
		});
		es.shutdown();
	}
}
