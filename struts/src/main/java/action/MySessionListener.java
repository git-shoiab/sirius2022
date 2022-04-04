package action;
//https://fluvid.com/videos/detail/ZEn3MT1KGvu9DpMRz#.YkqVTIa5-GY.link
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import service.UserService;
import service.UserServiceImpl;

/**
 * Application Lifecycle Listener implementation class MySessionListener
 *
 */
@WebListener
public class MySessionListener implements HttpSessionListener {

   
    public void sessionCreated(HttpSessionEvent se)  { 
        HttpSession session=se.getSession();
        System.out.println("session created called...");
    }

	
    public void sessionDestroyed(HttpSessionEvent se)  { 
         System.out.println("session destroyed called...");
         HttpSession session=se.getSession();
         Object uname=session.getAttribute("uname");
         if(uname!=null) {
        	 String name=uname.toString();
        	 UserService userService=UserServiceImpl.getUserServiceImpl();
        	 userService.updateFlag(name, 0);
         }
    }
	
}
