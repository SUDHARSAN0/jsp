package telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Add extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
	int i=Integer.parseInt(req.getParameter("num1"));
	int j=Integer.parseInt(req.getParameter("num2"));
	int k=i+j;
	PrintWriter out=res.getWriter();
	out.println(k);
	
	
	//reqestdispatcher method
	//req.setAttribute("k",k);
	//RequestDispatcher rd=req.getRequestDispatcher("sq");
	//rd.forward(req,res);
	
	//sendredirect method
//	res.sendRedirect("sq?k="+k);//url rewriting
	
	//session
//	HttpSession session=req.getSession();
//	session.setAttribute("k",k);
	
	
	
	//cookie
	Cookie cookie=new Cookie("k",k + "");
	res.addCookie(cookie);
	res.sendRedirect("sq");
	}
}
