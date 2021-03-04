	

function validate(){
	if(document.getElementById("UN") == "" || document.getElementById("PW") == ""){
		alert("User name and password required");
		return false;
	}else{
		return true;
	}
	
	
}