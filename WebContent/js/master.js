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
			alert("Ingresa tu contraseña");
			password.focus();
			return false;
		}else{
		   	return true;
		}
	}
