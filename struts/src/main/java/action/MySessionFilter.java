package action;
//https://fluvid.com/videos/detail/8EL-9T-ZR4idv2Yvz#.Ykq5ui7lgI8.link
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("*.do")
public class MySessionFilter extends HttpFilter implements Filter {
       
    
	public void destroy() {
		System.out.println("filter destroy called..");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest hrequest=(HttpServletRequest)request;
		HttpServletResponse hresponse=(HttpServletResponse)response;
		
		String formid=hrequest.getParameter("formid");
		if(formid.equals("login")) {
			chain.doFilter(request, response);
		}
		else {
			HttpSession session=hrequest.getSession();
			if(session.isNew()) {
				hresponse.sendRedirect("expire.jsp");
			}
			else {
				chain.doFilter(request, response);
			}
		}
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("filter init called...");
	}

}
