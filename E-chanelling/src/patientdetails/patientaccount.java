package patientdetails;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;


import Com.Patient.Patient;

public class patientaccount {
	
	public static List<Patient> validate2(String Uname,String password){
		
		ArrayList<Patient> patient1= new ArrayList<>();
		
		//connect database
		String url = "jdbc:mysql://localhost:3306/echanlling";
		String user = "root";
		String pass = "Ramesh98";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			Connection connect = DriverManager.getConnection(url,user,pass); 
			Statement stm = connect.createStatement();
			
			String sql = "select * from patient where uname='"+Uname+"' And password='"+password+"'";
			
			ResultSet Result = stm.executeQuery(sql);
			
			if(Result.next()){
				int id = Result.getInt(1);
				String fname = Result.getString(2);
				String lname = Result.getString(3);
				String email = Result.getString(4);
				String phone=Result.getString(5);
				String unameu=Result.getString(6);
				String passu = Result.getString(7);
				
				Patient pa1 = new Patient(id,fname,lname,email,phone,unameu,passu);
				patient1.add(pa1);
				System.out.println("Myfirst name"+fname);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		return patient1;
		
		
	}
}
