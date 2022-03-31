package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashSet;
import java.util.Set;

import service.UserServiceImpl;

public class UserDAOImpl implements UserDAO,Cloneable{
	PreparedStatement ps;
	ResultSet rs;
	
	private UserDAOImpl() {
		System.out.println("cons called..");
	}
	private static UserDAOImpl userDAO;
	
	public static UserDAOImpl getUserDAOImpl() {
		if(userDAO==null) {
			userDAO=new UserDAOImpl();
			return userDAO;
		}
		else {
			return userDAO.getClone();
		}		
	}
	
	public UserDAOImpl getClone() {
		try {
			return (UserDAOImpl)super.clone();
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	@Override
	public User getUser(int uid) {
		try {
		Connection con=DBCon.getConnection();
		ps=con.prepareStatement("select * from users where uid=?");
		ps.setInt(1, uid);
		rs=ps.executeQuery();
		User user=new User();
		if(rs.next()) {
			user.setUid(uid);
			user.setUname(rs.getString(2));
			user.setUpass(rs.getString(3));
			user.setFlag(rs.getInt(4));
			return user;
		}
		else {
			return null;
		}
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			try {
				DBCon.closeConnection();
				ps.close();rs.close();
			}catch(Exception e) {e.printStackTrace();}
		}
	}

	@Override
	public void updateUser(User user) {
		try {
			Connection con=DBCon.getConnection();
			ps=con.prepareStatement("UPDATE USERS set uname=?,upass=?,flag=? where uid=?");
			ps.setString(1, user.getUname());
			ps.setString(2, user.getUpass());
			ps.setInt(3, user.getFlag());
			ps.setInt(4, user.getUid());
			ps.executeUpdate();

			}catch(Exception e) {
				e.printStackTrace();
			
			}finally {
				try {
					DBCon.closeConnection();
					ps.close();
				}catch(Exception e) {e.printStackTrace();}
			}
	}

	@Override
	public void insertUser(User user) {
		try {
			Connection con=DBCon.getConnection();
			ps=con.prepareStatement("insert into users values (?,?,?,?)");
			ps.setString(2, user.getUname());
			ps.setString(3, user.getUpass());
			ps.setInt(4, user.getFlag());
			ps.setInt(1, user.getUid());
			ps.executeUpdate();

			}catch(Exception e) {
				e.printStackTrace();
			
			}finally {
				try {
					DBCon.closeConnection();
					ps.close();
				}catch(Exception e) {e.printStackTrace();}
			}
	}

	@Override
	public void deleteUser(int uid) {
		try {
			Connection con=DBCon.getConnection();
			ps=con.prepareStatement("delete from users where uid=?");
			ps.setInt(1, uid);
			ps.executeUpdate();

			}catch(Exception e) {
				e.printStackTrace();
			
			}finally {
				try {
					DBCon.closeConnection();
					ps.close();
				}catch(Exception e) {e.printStackTrace();}
			}
		
	}

	@Override
	public User getUserByName(String uname) {
		try {
			Connection con=DBCon.getConnection();
			ps=con.prepareStatement("select * from users where uname=?");
			ps.setString(1,uname);
			rs=ps.executeQuery();
			User user=new User();
			if(rs.next()) {
				user.setUid(rs.getInt(1));
				user.setUname(rs.getString(2));
				user.setUpass(rs.getString(3));
				user.setFlag(rs.getInt(4));
				return user;
			}
			else {
				return null;
			}
			}catch(Exception e) {
				e.printStackTrace();
				return null;
			}finally {
				try {
					DBCon.closeConnection();
					ps.close();rs.close();
				}catch(Exception e) {e.printStackTrace();}
			}
	}

	@Override
	public void deleteUserByName(String uname) {
		try {
			Connection con=DBCon.getConnection();
			ps=con.prepareStatement("delete from users where uname=?");
			ps.setString(1, uname);
			ps.executeUpdate();

			}catch(Exception e) {
				e.printStackTrace();
			
			}finally {
				try {
					DBCon.closeConnection();
					ps.close();
				}catch(Exception e) {e.printStackTrace();}
			}
	}

	@Override
	public Set<User> getAllUsers() {
		Set<User> users=new HashSet<>();
		try {
			Connection con=DBCon.getConnection();
			ps=con.prepareStatement("select * from users");
			rs=ps.executeQuery();
			
			while(rs.next()) {
				User user=new User();
				user.setUid(rs.getInt(1));
				user.setUname(rs.getString(2));
				user.setUpass(rs.getString(3));
				user.setFlag(rs.getInt(4));
				users.add(user);
			}
			}catch(Exception e) {
				e.printStackTrace();
				return null;
			}finally {
				try {
					DBCon.closeConnection();
					ps.close();rs.close();
				}catch(Exception e) {e.printStackTrace();}
			}
		return users;
	}

	public static void main(String[] args) {
		UserDAOImpl us1=UserDAOImpl.getUserDAOImpl();
		System.out.println(us1);
		
		UserDAOImpl us2=UserDAOImpl.getUserDAOImpl();
		System.out.println(us2);
		
		us1.deleteUser(1);
		System.out.println(us1.getAllUsers());
		
		System.out.println(us1.getUserByName("rahim"));
		System.out.println(us1.getUser(2));
		
		User user=new User();
		user.setUid(1);
		user.setUname("ramu");
		user.setUpass("secret");
		user.setFlag(1);
		
		us1.insertUser(user);
		
		System.out.println(us1.getAllUsers());

		us1.updateUser(user);
		System.out.println(us1.getAllUsers());
	}
}
