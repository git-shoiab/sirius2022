package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.UserService;
import service.UserServiceImpl;

public class LogoutAction extends Action{
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		UserService userService=UserServiceImpl.getUserServiceImpl();
		Object obj=request.getSession().getAttribute("uname");
		String uname=null;
		if(obj!=null) {
			uname=obj.toString();
		}
		userService.updateFlag(uname, 0);
		
		return "logout.success";
	
	}
}
