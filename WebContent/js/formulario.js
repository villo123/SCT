function validarDatos(){
	var folio = document.getElementById("foliotxt");
	var nombre = document.getElementById("nombretxt");
	var app = document.getElementById("passwdconftxt");
	var apm = document.getElementById("pnomtxt");
	var cisco = document.getElementById("snomtxt");
	var email = document.getElementById("paptxt");
	var descripcionin = document.getElementById("insidenttxt");
	var fechacat = document.getElementById("mesa");
	var horacat = document.getElementById("tptxt");
	
	if (folio.value == "" || folio.value == '' ||folio.value == null){
		alert("Campo(s) vacio(s). Verifique");
		return false;
	}else if(nombre.value == "" || nombre.value == '' || nombre.value == null){
		alert("Campo(s) vacio(s). Verifique");
		return false;
	}else if(cisco.value == "" || cisco.value == '' || cisco.value == null){
		alert("Campo(s) vacio(s). Verifique");
		return false;
	}else if(app.value == "" || app.value == '' || app.value == null){
		alert("Campo(s) vacio(s). Verifique");
		return false;
	}else if(apm.value == "" || apm.value == '' || apm.value == null){
		alert("Campo(s) vacio(s). Verifique");
		return false;
	}else if(email.value == "" || email.value == '' || email.value == null){
		alert("Campo(s) vacio(s). Verifique");
		return false;
	}else if(descripcionin.value == "" || descripcionin.value == '' || descripcionin.value == null){
		alert("Campo(s) vacio(s). Verifique");
		return false;
	}else if(fechacat.value == "" || fechacat.value == '' || fechacat.value == null){
		alert("Campo(s) vacio(s). Verifique");
		return false;
	}else if(horacat.value == "" || horacat.value == '' || horacat.value == null){
		alert("Campo(s) vacio(s). Verifique");
		return false;
	}else{
		return true;
	}
}
