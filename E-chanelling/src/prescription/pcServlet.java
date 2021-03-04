package prescription;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Com.Patient.PatientDbutil;

/**
 * Servlet implementation class pcServlet
 */
@WebServlet("/pcServlet")
public class pcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public pcServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String Uname = request.getParameter("uname");
		String PId = request.getParameter("lid");
		String Address = request.getParameter("address");
		String Mobile = request.getParameter("mobile");
		String Medicine = request.getParameter("medicine");
		

		try {
			boolean result;
			result= prescriptiondbutil.addmedicine(Uname, PId, Address, Mobile, Medicine);
			if(result == true) {
				
				
				 RequestDispatcher rd = request.getRequestDispatcher("orderstatus.jsp");
				 rd.forward(request, response);
				 
				}else {
					
					 RequestDispatcher rd = request.getRequestDispatcher("prescription.jsp");
					 rd.forward(request, response);
					
				}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
	}

}
