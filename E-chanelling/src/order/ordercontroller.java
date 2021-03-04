package order;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Com.Patient.PatientDbutil;



@WebServlet("/ordercontroller")
public class ordercontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ordercontroller() {
        super();

    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String uname = request.getParameter("un");
		String id = request.getParameter("nid");
		boolean new1;
		
		System.out.println(uname+id);
		
		 new1 = PatientDbutil.status(uname, id);
		 
		 if(new1 == true) {
			 List<Order> ord = PatientDbutil.getdetails(uname);
			 request.setAttribute("ord", ord);
			 
			 RequestDispatcher dis = request.getRequestDispatcher("Account.jsp");
			 dis.forward(request, response);
		 }else {
			 System.out.println("Not sucess");
			 out.println("<script type='text/javascript>'");
			 out.println("alert('Your User name or ID incorrect');");
			 out.println("location='orderstatus.jsp'");
			 out.print("</script>");
		 }
		
		
	}
	

}
