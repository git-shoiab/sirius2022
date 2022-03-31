package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginAction extends Action{
	public LoginAction() {
		// TODO Auto-generated constructor stub
	}
@Override
public String execute(HttpServletRequest request, HttpServletResponse response) {
	String uname=request.getParameter("uname");
	String upass=request.getParameter("upass");
	
	if(uname.equals("ramu")) {
		return "login.success";
	}
	else {
		return "login.failure";
	}
}
}
