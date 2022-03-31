package control;

import java.io.FileInputStream;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;

public class RequestProcessor {
	public void process(HttpServletRequest request,HttpServletResponse response) {
		try {
		String formid=request.getParameter("formid");
		
		ServletContext application=request.getServletContext();
		
		String path=application.getRealPath("/WEB-INF/config.properties");
		
		Properties prop=new Properties();
		prop.load(new FileInputStream(path));
		
		String actionclass=prop.getProperty(formid);
		
		Action action=(Action)Class.forName(actionclass).getConstructor().newInstance();
		
		String result=action.execute(request, response);
		
		String nextPage=prop.getProperty(result);
		
		RequestDispatcher rd=request.getRequestDispatcher(nextPage);
				
		rd.forward(request, response);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
