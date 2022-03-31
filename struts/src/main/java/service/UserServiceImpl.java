package service;

import dao.User;
import dao.UserDAOImpl;

public class UserServiceImpl implements UserService, Cloneable{

	private UserServiceImpl() {
		
	}
	private static UserServiceImpl userService;
	
	public static UserServiceImpl getUserServiceImpl() {
		if(userService==null) {
			userService=new UserServiceImpl();
			return userService;
		}
		else {
			return userService.getClone();
		}		
	}
	public UserServiceImpl getClone() {
		try {
			return (UserServiceImpl)super.clone();
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	@Override
	public boolean checkUser(String uname, String upass) {
		UserDAOImpl userDAO=UserDAOImpl.getUserDAOImpl();
		User user=userDAO.getUserByName(uname);
		if(user!=null) {
			if(upass.equals(user.getUpass())) {
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}

	@Override
	public void updateFlag(String uname, int flag) {
		UserDAOImpl userDAO=UserDAOImpl.getUserDAOImpl();
		User user=userDAO.getUserByName(uname);
		user.setFlag(flag);
		userDAO.updateUser(user);
	}

	@Override
	public int readFlag(String uname) {
		UserDAOImpl userDAO=UserDAOImpl.getUserDAOImpl();
		User user=userDAO.getUserByName(uname);
		return user.getFlag();
	}

}
