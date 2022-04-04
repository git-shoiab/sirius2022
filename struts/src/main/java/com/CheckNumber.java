package com;
//https://fluvid.com/videos/detail/p35djuXxp1CrnLPL7#.Ykp6JPr7IZw.link
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class CheckNumber extends TagSupport{
	String num;

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}
	
	@Override
	public int doEndTag() throws JspException {
		int n=Integer.parseInt(num);
		JspWriter out=pageContext.getOut();
		if(n%2==0) {
			try {
				out.println("<h1>Even Number...</h1>");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		else {
			try {
				out.println("<h1>Odd Number...</h1>");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return 1;
	}
}
