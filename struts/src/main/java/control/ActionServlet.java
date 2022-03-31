package control;
//https://fluvid.com/videos/detail/w6e8gcQ2q-cnyDA27#.YkU1DNvrBUE.link
//https://fluvid.com/videos/detail/zj4k_T7g5Ycgj4mLz#.YkVLTKUVFA4.link
//https://fluvid.com/videos/detail/v_v8rS18KMF4gOGKV#.YkVcqHfLIgo.link
import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ActionServlet
 */
@WebServlet("*.do")
public class ActionServlet extends HttpServlet {
	RequestProcessor rp;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		rp=new RequestProcessor();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		rp.process(request, response);
	}

}
