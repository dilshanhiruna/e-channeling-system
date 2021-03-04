package Com.Patient;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/patientLoginservelet")
public class patientLoginservelet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("uname");
		String password = request.getParameter("password");
		
		try {
		String paDetails= PatientDbutil.Validate(username, password);
		request.setAttribute("paDetails", paDetails);
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
		
		RequestDispatcher display = request.getRequestDispatcher("Patientdetails.jsp");
		display.forward(request,response);
	}

}
