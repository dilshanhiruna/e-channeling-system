package order;

public class Order {
	
	private int Oid;
	private String Uname;
	private String Id;
	private String Add;
	private String Mobile;
	private String Details;
	
	
	public Order(int oid, String uname, String id, String add, String mobile, String details) {
		
		Oid = oid;
		Uname = uname;
		Id = id;
		Add = add;
		Mobile = mobile;
		Details = details;
	}


	public int getOid() {
		return Oid;
	}





	public String getUname() {
		return Uname;
	}




	public String getId() {
		return Id;
	}




	public String getAdd() {
		return Add;
	}




	public String getMobile() {
		return Mobile;
	}




	public String getDetails() {
		return Details;
	}



	
	
	
	
	
}
