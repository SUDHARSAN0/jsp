package telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class sq extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
//		int k=(int)req.getAttribute("k");
	//int k=Integer.parseInt(req.getParameter("k"));
	//int k=i+j;
	
		
		//access session
		//HttpSession session=req.getSession();
		//int k=(int) session.getAttribute("k");
		
		int k = 0;
		Cookie cookie[]=req.getCookies();
		for(Cookie c:cookie)
		{
			if(c.getName().equals("k"))
			{
				k=Integer.parseInt(c.getValue());
			}
		}
		
		
		//servlet context
//		ServletContext ct=getServletContext();
//		String name=ct.getInitParameter("name");
		
		
		//servlet config
		//ServletConfig cg=getServletConfig();
		//String name=cg.getInitParameter("name");
	PrintWriter out=res.getWriter();
	out.println("result is"+k);
	//out.println(name);
	
	
	
	}
}
