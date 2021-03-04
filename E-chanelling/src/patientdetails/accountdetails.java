package patientdetails;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Com.Patient.Patient;



@WebServlet("/accountdetails")
public class accountdetails extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("HI");
	
		String Uname = request.getParameter("uname");
		String Password = request.getParameter("pass");
		
		System.out.println("password"+Password);
		System.out.println("Uname "+Uname);
		try {
		List<Patient> patientdetails=patientaccount.validate2(Uname, Password);
		
		request.setAttribute("patientdetails", patientdetails);
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
		
		RequestDispatcher dis = request.getRequestDispatcher("prescription.jsp");
		dis.forward(request, response);
	}

}
