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
	
	function deshabilitaratutic(){
		document.getElementsByName("idatendio").style.visibility="hidden";
		document.getElementsByName("nameatendio").style.visibility="hidden";
		document.getElementsByName("apellidopatatendio").style.visibility="hidden";
		document.getElementsByName("apellidomatatendio").style.visibility="hidden";
		document.getElementsByName("deptoatendio").style.visibility="hidden";
	}

	function deshabilitaratutic(){
		document.getElementsByName("idatendio").style.visibility="visible";
		document.getElementsByName("nameatendio").style.visibility="visible";
		document.getElementsByName("apellidopatatendio").style.visibility="visible";
		document.getElementsByName("apellidomatatendio").style.visibility="visible";
		document.getElementsByName("deptoatendio").style.visibility="visible";
	}