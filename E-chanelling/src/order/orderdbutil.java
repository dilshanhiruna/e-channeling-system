package order;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class orderdbutil {
		
	public static boolean issucess;
	private static String url = "jdbc:mysql://localhost:3306/neworder";
	private static String user = "root";
	private static String pass = "Ramesh98";
	public static Statement stm=null;
	public static ResultSet rs=null;
	
	
	public static boolean status(String Uname,String ID) {
		
		
		System.out.println(Uname+ID);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection(url,user,pass); 
			 stm = connect.createStatement();
			
			 String sql="Select * From order Where uname='"+Uname+"' AND id='"+ID+"'";
			 rs = stm.executeQuery(sql);
			 
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
			 stm = connect.createStatement();
			 
			 String sql = "Select * From order Where uname='"+Uname+"'";
			  rs = stm.executeQuery(sql);
			  
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
			 stm = connect.createStatement();
			 
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
			 stm = connect.createStatement();
			 
			 String sql = "Select * from order where oid='"+convert+"' ";
			 
			 rs = stm.executeQuery(sql);
			 
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
	
	public static boolean canselOrder(String ID) {
		
		int convert = Integer.parseInt(ID);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection(url,user,pass); 
			 stm = connect.createStatement();
			 
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
