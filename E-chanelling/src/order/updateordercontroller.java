package order;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/updateordercontroller")
public class updateordercontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  String OID = request.getParameter("oid");
	  String UNAME = request.getParameter("uid");
	  String ID = request.getParameter("id");
	  String ADD = request.getParameter("add");
	  String MOB = request.getParameter("mob");
	  String DET = request.getParameter("det");
	  
	  boolean new3;
	  new3 = orderdbutil.updateOrder(OID, UNAME, ID, ADD, MOB, DET);
	  
	  if(new3 == true) {
		  
		  List<Order> ord = orderdbutil.getOrderdetails(OID);
		  request.setAttribute("ord", ord);
		  
		  RequestDispatcher dis = request.getRequestDispatcher("Account.jsp");
		  dis.forward(request, response);
	  }else {
		  RequestDispatcher dis = request.getRequestDispatcher("unsucess.jsp");
		  dis.forward(request, response);
	  }
	}

}
