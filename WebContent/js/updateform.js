function validarDatosUp(){
	var fechaaten = document.getElementById("atencion");
	var horaaten = document.getElementById("atenatxt");
	var respuesta = document.getElementById("atachytxt");
	var fechaapro = document.getElementById("aprobacion");
	var fechallam = document.getElementById("fellamada");
	var horallam = document.getElementById("hllamada")
	var comllam = document.getElementById("comllamada");
	
	if((fechaaten.value == "" || fechaaten.value == '' || fechaaten.value == null) || (fechaaten.value == "yyyy-mm-dd")){
		alert("Campo(s) vacio(s) o incorrecto(s). Verifique =)");
		return false;
	}else if((horaaten.value == "" || horaaten.value == '' || horaaten.value == null) || (horaaten.value == "00:00")){
		alert("Campo(s) vacio(s) o incorrecto(s). Verifique =)");
		return false;
	}else if(respuesta.valur == "" || respuesta.value == '' || respuesta.value == null){
		alert("Campo(s) vacio(s) o incorrecto(s). Verifique =)");
		return false;
	}else if((fechaapro.value == "" || fechaapro.value == '' || fechaapro.value == null) || (fechaapro.value == "yyyy-mm-dd")){
		alert("Campo(s) vacio(s) o incorrecto(s). Verifique =)");
		return false;
	}else if((fechallam.value == "" || fechallam.value == '' || fechallam.value == null) || (fechallam.value == "yyyy-mm-dd")){
		alert("Campo(s) vacio(s) o incorrecto(s). Verifique =)");
		return false;
	}else if((horallam.value == "" || horallam.value == '' || horallam.value == null) || (horallam.value == "00:00")){
		alert("Campo(s) vacio(s) o incorrecto(s). Verifique =)");
		return false;
	}else if(comllam.value == "" || comllam.value == '' || comllam.value == null){
		alert("Campo(s) vacio(s) o incorrecto(s). Verifique =)");
		return false;
	}else{
		return true;
	}
}

function cerrarUpForm(){
	window.close();
}