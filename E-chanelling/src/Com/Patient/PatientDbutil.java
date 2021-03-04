package Com.Patient;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import order.Order;



public class PatientDbutil {
	
	
		private static String url = "jdbc:mysql://localhost:3306/echanlling";
		private static String user = "root";
		private static String pass = "Ramesh98";
		
		private static boolean issucess;
	
	//Add patient function
	public static boolean addPatient(String Fname,String Lname, String Email,String Phone, String Uname,String Password) {
		boolean result = false;
		//Create database connection

		

		try {
			
			System.out.println(Lname);
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection(url,user,pass); 
			Statement stm = connect.createStatement();
			
			
			System.out.println(Uname);
			//add Patients' details to the database
			String sql = "insert into patient values(0,'"+Fname+"', '"+Lname+"' , '"+Email+"' ,'"+Phone+"', '"+Uname+"', '"+Password+"')";
			int Result = stm.executeUpdate(sql);
			
			if(Result>0){
				System.out.println("Patientdbutil3");
				result = true;
			}else {
				System.out.println("Patientdbutil4");
				result = false;
			}
			
		}catch(Exception e) {
			e.getMessage();
		}

		//Return add or not statement
		return result;
	}
	
	//Patient login function
	public static String Validate(String uname,String password) {
		 String result1="false";
		 

		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connect = DriverManager.getConnection(url,user,pass); 
			Statement stm = connect.createStatement();
			
			//Validate user name and password with database user name and password
			String sql = "select username,password from patient where uname = '"+uname+"' and Password = '"+password+"'";
			int Result = stm.executeUpdate(sql);
			
			if(Result>0) {
				result1=uname;
			}
			else {
				result1="false";
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result1;
		
		
	}
	
	//Order medicine function
	public static boolean addmedicine(String Uname,String ID,String Address,String Mobile, String Medicine) {
		boolean result = false;
		//Create database connection

			
		

		try {
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection(url,user,pass); 
			Statement stm = connect.createStatement();
			
			System.out.println(Medicine);
			System.out.println(Mobile);
			System.out.println(Address);
			System.out.println(ID);
			System.out.println(Uname);
			
			
			//add Patients' details to the database
			String sql = "insert into details values(0,'"+Uname+"', '"+ID+"' , '"+Address+"', '"+Mobile+"' + '"+Medicine+"')";
			System.out.println(Uname);
			int Result = stm.executeUpdate(sql);
			System.out.println(ID);
			
			if(Result>0){
				System.out.println(result);	
				result = true;
			}else {
				System.out.println("try");
				result = false;
			}
			
		}catch(Exception e) {
			e.getMessage();
		}

		//Return add or not statement
		System.out.println(result);
		return result;
	}
	
	//View Order status function
	
	public static boolean status(String Uname,String ID) {
		
		
		System.out.println(Uname+ID);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection(url,user,pass); 
			Statement stm = connect.createStatement();
			
			 String sql="Select * From order Where uname='"+Uname+"' AND id='"+ID+"'";
			 ResultSet rs = stm.executeQuery(sql);
			 
			 if(rs.next()) {
				 issucess = true;
			 }else {
				 issucess=false;
			 }
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return issucess;
	}
	
	
	public static  List<Order> getdetails(String Uname){
		
		ArrayList<Order> order = new ArrayList<>();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection(url,user,pass); 
			Statement stm = connect.createStatement();
			 
			 String sql = "Select * From order Where uname='"+Uname+"'";
			 ResultSet rs = stm.executeQuery(sql);
			  
			  while(rs.next()) {
				  int id = rs.getInt(1);
				  String un = rs.getString(2);
				  String Id = rs.getString(3);
				  String Add = rs.getString(4);
				  String Mobile=rs.getString(5);
				  String Details = rs.getString(6);
				  
				  Order ord = new Order(id,un,Id,Add,Mobile,Details);
				  order.add(ord);
				  
			  }
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return order;
	}
	
	public static boolean updateOrder(String Oid,String Uname,String Id, String Add, String Mob, String Det) {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection(url,user,pass); 
			Statement stm = connect.createStatement();
			 
			 String sql = "update order set uname='"+Uname+"', id = '"+Id+"', add = '"+Add+"', mobile = '"+Mob+"', details = '"+Det+"' Where oid='"+Oid+"'";
			 
			 int res = stm.executeUpdate(sql);
			 
			 if(res>0) {
				 issucess = true;
			 }else {
				 issucess = false;
			 }
			 
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return issucess;
	}
	
	public static List<Order> getOrderdetails(String OID){
		
		ArrayList<Order> Ord = new ArrayList<>();
		int convert = Integer.parseInt(OID);
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection(url,user,pass); 
			Statement stm = connect.createStatement();
			 
			 String sql = "Select * from order where oid='"+convert+"' ";
			 
			 ResultSet rs = stm.executeQuery(sql);
			 
			 while(rs.next()) {
				 int oid = rs.getInt(1);
				 String uname = rs.getString(2);
				 String nid = rs.getString(3);
				 String add = rs.getString(4);
				 String mobile = rs.getString(5);
				 String det = rs.getString(6);
				 
				 
				 Order o = new Order(oid,uname,nid,add,mobile,det);
				 
				 Ord.add(o);
			 }
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return Ord;
	}
	
	
	//CanCel order function
	public static boolean canselOrder(String ID) {
		
		int convert = Integer.parseInt(ID);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection(url,user,pass); 
			Statement stm = connect.createStatement();
			 
			 String sql = "delete from order where oid='"+convert+"'";
			 
			 int r = stm.executeUpdate(sql);
			 
			 if(r>0) {
				 issucess = true;
			 }else {
				 issucess = false;
			 }
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return issucess;
	}
	

} 
