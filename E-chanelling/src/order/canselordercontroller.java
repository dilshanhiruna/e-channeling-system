package order;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/canselordercontroller")
public class canselordercontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String OID = request.getParameter("oid");
	
		
		boolean new4 = orderdbutil.canselOrder(OID);
		
		if(new4 == true) {
			RequestDispatcher dis = request.getRequestDispatcher("prescription.jsp");
			dis.forward(request, response);
		}else {
			
			  RequestDispatcher dis = request.getRequestDispatcher("unsucess.jsp");
			  dis.forward(request, response);

		}
	}

}
