package Com.Patient;

public class Patient {
	private int pId;
	private String Fname;
	private String Lname;
	private String e_mail;
	private String mobile;
	private String Uname;
	private String password;
	
	public Patient(int pId, String fname, String lname, String e_mail, String mobile, String uname, String password) {
		
		this.pId = pId;
		Fname = fname;
		Lname = lname;
		this.e_mail = e_mail;
		this.mobile = mobile;
		Uname = uname;
		this.password = password;
	}

	public int getpId() {
		return pId;
	}


	public String getFname() {
		return Fname;
	}



	public String getLname() {
		return Lname;
	}


	public String getE_mail() {
		return e_mail;
	}


	public String getMobile() {
		return mobile;
	}



	public String getUname() {
		return Uname;
	}



	public String getPassword() {
		return password;
	}


	
	
}
