package prescription;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class prescriptiondbutil {
	
	

	private static boolean re;

public static boolean addmedicine(String Uname,String ID,String Address,String Mobile, String Medicine) {
	
	//Create database connection


	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ash", "root", "");
		Statement stmt = connection.createStatement();

		//add Patients' details to the database
		
		String query = "insert into details values(0,'" + Uname + "','" + ID + "','" + Address + "','" + Mobile + "','" + Medicine +  "')";
	
		int Result = stmt.executeUpdate(query);
		
		
		
		if(Result > 0){
			
			
			re = true;
		}else {
			
			re = false;
		}
		
	}catch(Exception e) {
		e.printStackTrace();
	}

	//Return add or not statement
	return re;
}
}
