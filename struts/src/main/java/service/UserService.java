package service;

public interface UserService {
	public boolean checkUser(String uname,String upass);
	public void updateFlag(String uname, int flag);
	public int readFlag(String uname);
}
