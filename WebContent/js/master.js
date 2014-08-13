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

	function habilitaratutic(){
		document.getElementsByName("idatendio").style.visibility="visible";
		document.getElementsByName("nameatendio").style.visibility="visible";
		document.getElementsByName("apellidopatatendio").style.visibility="visible";
		document.getElementsByName("apellidomatatendio").style.visibility="visible";
		document.getElementsByName("deptoatendio").style.visibility="visible";
	}
	
	function deshabilitarcatin(){
		document.getElementById("FolioInc").style.visibility="hidden";
		document.getElementById("TipoInc").style.visibility="hidden";
	}
	
	function habilitarcatin(){
		document.getElementById("FolioInc").style.visibility="visible";
		document.getElementById("TipoInc").style.visibility="visible";
	}
	
	function deshabilitarstatus(){
		document.getElementsByName("idatendio").style.visibility="hidden";
		document.getElementsByName("nameatendio").style.visibility="hidden";
	}
	
	function habilitarstatus(){
		document.getElementsByName("idatendio").style.visibility="visible";
		document.getElementsByName("nameatendio").style.visibility="visible";
		
	}
	
	function deshabilitarmodulo(){	
		document.getElementsByName("idmodulo").style.visibility="hidden";
		document.getElementsByName("modulo").style.visibility="hidden";
	}
	
	function habilitarmodulo(){
		document.getElementsByName("idmodulo").style.visibility="visible";
		document.getElementsByName("modulo").style.visibility="visible";
	}
	
	function deshabilitaroperutic(){
		document.getElementsByName("UsuarioOpt").style.visibility="hidden";
		document.getElementsByName("NumeroOpt").style.visibility="hidden";
		document.getElementsByName("NombreOpt").style.visibility="hidden";
		document.getElementsByName("ApellidoPatOpt").style.visibility="hidden";
		document.getElementsByName("ApellidoMatOpt").style.visibility="hidden";
		document.getElementsByName("DeptoOpt").style.visibility="hidden";
		document.getElementsByName("EmailOpt").style.visibility="hidden";
		document.getElementsByName("UnidadOpt").style.visibility="hidden";
	}
	
	function habilitaroperutic(){
		document.getElementsByName("UsuarioOpt").style.visibility="visible";
		document.getElementsByName("NumeroOpt").style.visibility="visible";
		document.getElementsByName("NombreOpt").style.visibility="visible";
		document.getElementsByName("ApellidoPatOpt").style.visibility="visible";
		document.getElementsByName("ApellidoMatOpt").style.visibility="visible";
		document.getElementsByName("DeptoOpt").style.visibility="visible";
		document.getElementsByName("EmailOpt").style.visibility="visible";
		document.getElementsByName("UnidadOpt").style.visibility="visible";
	}