package dao;

import java.util.Set;

public interface UserDAO {
	public User getUser(int uid);
	public void updateUser(User user);
	public void insertUser(User user);
	public void deleteUser(int uid);
	public User getUserByName(String uname);
	public void deleteUserByName(String uname);
	public Set<User> getAllUsers();
}
