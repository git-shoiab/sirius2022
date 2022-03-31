package action;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ShoppingAction extends Action{
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String shopid=request.getParameter("shopid");
		addToCart(request);
		return shopid;
	}
	
	void addToCart(HttpServletRequest request){
		HttpSession session=request.getSession();
		Enumeration<String> en= request.getParameterNames();
		while(en.hasMoreElements()) {
			String name=en.nextElement();
			String value=request.getParameter(name);
			session.setAttribute(name, value);
		}
	}
}
