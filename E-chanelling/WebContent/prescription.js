
	function validate(){
	var un=document.getElementById('UN');
	var id=document.getElementById('ID');
	var add=document.getElementById('ADD');
	var mob=document.getElementById('MOB');
	var det=document.getElementById('DET');
	
	
	if(un.value == ""||id.value==""||add.value==""||mob.value==""|| det.value==""){
		alert("All fields are requried");
		return false
	}else{
		return true;
	}
	
	

	
}