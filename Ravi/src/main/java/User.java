import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class User extends HttpServlet {
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		String firstname=arg0.getParameter("fn");
		String midealname=arg0.getParameter("pw"); 
		PrintWriter out1=arg1.getWriter();
        out1.println("<html>"
				  + "<body bgcolor='red'><br><br><br><br><br>"
				  +   "<center><h1>welcome to techno elevate :-</h1><center>"
				  +   "</body>"
				  +   "</html>");
		
		 PrintWriter out=arg1.getWriter();
	        out.println("<html>"
					  + "<body bgcolor='red'><br><br><br><br><br>"
					  +   "<center><h1>user:= "+firstname+" and password is:= "+midealname+"</h1><center>"
					  +   "</body>"
					  +   "</html>");
		
		
	}

}
