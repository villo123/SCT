//General
	function abrirformulario() {
		abrir = open("formulario.jsp");
	}
	
	function cancelar(){
		volver = open("login.jsp");
	}
	
	function seacker(){
		buscar = open("busqueda.jsp");
	}
	
//Login Script
	function carga(){
		document.getElementById("usuario").focus();
	}
	function valideDatos(){
		var usuario = document.getElementById("usuario");
		var password = document.getElementById("password");	
		if((usuario.value == "" || usuario.value == '' || usuario.value == null) && (password.value == "" || password.value == '' || password.value == null)){
			alert("Ingresa tu usuario y tu password");
			usuario.focus();
			return false;
		}else if(usuario.value == "" || usuario.value == '' || usuario.value == null){
			alert("Ingresa tu usuario");
			usuario.focus();
			return false;
		}else if(password.value == "" || password.value == '' || password.value == null){
			alert("Ingresa tu contrase�a");
			password.focus();
			return false;
		}else{
		   	return true;
		}
	}
function habilitaratutic(value){
	document.getElementsByName("idatendio").disabled = false;
	document.getElementsByName("nameatendio").disabled = false;
	document.getElementsByName("apellidopatatendio").disabled = false;
	document.getElementsByName("apellidomatatendio").disabled = false;
	document.getElementsByName("deptoatendio").disabled = false;
}
function deshabilitaratutic(){
	document.getElementsByName("idatendio").disabled = true;
	document.getElementsByName("nameatendio").disabled = true;
	document.getElementsByName("apellidopatatendio").disabled = true;
	document.getElementsByName("apellidomatatendio").disabled = true;
	document.getElementsByName("deptoatendio").disabled = true;
}