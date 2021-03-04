package Com.Patient;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/logincontroler")
public class logincontroler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected String p1;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//Get User name and password from login form
		String username = request.getParameter("uname");
		String password = request.getParameter("pass");
		
		System.out.println(username);
		try {
		System.out.println("Validate method call");	
		p1 = PatientDbutil.Validate(username, password);
		
		}catch(Exception e) {
			e.getMessage();
		}
		
		if(p1 !="false") {
			System.out.println("sucess");
			HttpSession session = request.getSession();
			session.setAttribute("userName", p1);
			response.sendRedirect("uploadprescription.jsp");
			
		}else {
			System.out.println("unsucess");
			request.setAttribute("Message", "Something went wrong try again later!");
			request.getRequestDispatcher("Patientlogin.jsp").forward(request, response);
			
		}
	}

}
