package Com.Patient;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


 
@WebServlet("/Addpatient")
public class Addpatient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public Addpatient() {
        super();
      
    }

   
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 boolean answer = false;
		System.out.println("Hiservelet");
		String Fname = request.getParameter("fname");
		String Lname = request.getParameter("lname");
		String Email = request.getParameter("email");
		String phone = request.getParameter("mobile");
		String Uname = request.getParameter("uname");
		String Password= request.getParameter("pass");
		System.out.println(Uname);
		
		
		answer = PatientDbutil.addPatient(Fname, Lname, Email, phone, Uname, Password);
		
		if(answer==true) {
			//Add user details sucesfully and redirect into login page
			System.out.println("Done");
			RequestDispatcher rd = request.getRequestDispatcher("Patientlogin.jsp");
			rd.forward(request, response);
			
		}
		
		else {
			//Display error Message and System display registration page to register again
			System.out.println("Not Done");
			request.setAttribute("Message", "Something went wrong,Try again later");
			request.getRequestDispatcher("Patientregister.jsp").forward(request, response);
		}
	}

}
