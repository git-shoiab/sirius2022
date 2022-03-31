package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.UserService;
import service.UserServiceImpl;

public class LoginAction extends Action{
	public LoginAction() {
		// TODO Auto-generated constructor stub
	}
@Override
public String execute(HttpServletRequest request, HttpServletResponse response) {
	String uname=request.getParameter("uname");
	String upass=request.getParameter("upass");
	HttpSession session=request.getSession();
	
	UserService userService=UserServiceImpl.getUserServiceImpl();
	boolean validUser=userService.checkUser(uname, upass);
	if(validUser) {
		if(userService.readFlag(uname)==0) {
			session.setAttribute("uname",uname);
			userService.updateFlag(uname, 1);
			return "login.success";
		}
		else {
			return "login.already";
		}
	}
	else {
		return "login.failure";
	}

}
}
