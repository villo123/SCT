//General
	function abrirformulario() {
		abrir = open("formulario.jsp");
	}
	
	function cancelar(){
		volver = open("login.jsp");
	}
	
	function seacker(){
		buscar = open("Busqueda.jsp");
	}
	
	function atenutic(){
		abriratenutic = window.open("AtendioUTIC.jsp","Atendio Utic","width=auto,height=auto");
	} 
	
	function catinci(){
		abriratinci = window.open("CatTipoIncidencias.jsp","Tipo de Incidencias","width=auto,height=auto");
	}
	
	function estatus(){
		abrirestatus = window.open("Estatus.jsp","Estatus","width=auto,height=auto");
	}
	
	function modulo(){
		abrirmodulo = window.open("Modulo.jsp","Modulo","width=auto,height=auto");
	}
	function operutic(){
		abriroperutic = window.open("OperadorUTIC.jsp","Operador Utic","width=auto,height=auto");
	}
	function proceso(){
		abrirproceso = window.open("Proceso.jsp","Proceso","width=auto,height=auto");
	}
	function sistema(){
		abrirsistema = window.open("Sistema.jsp","Sistema","width=auto,height=auto");
	}
	function tipoprior(){
		abrirtipoprior = window.open("TipoDePrioridad.jsp","Tipo de Prioridad","width=auto,height=auto");
	}
	function tiposol(){
		abrirtiposol = open("TipoDeSolucion.jsp","Tipo de Solucion","width=auto,height=auto");
	}
	function uscat(){
		abriruscat = open("UsuarioCAT.jsp","Usuario CAT","width=auto,height=auto");
	}
	function vista(){
		abrirvista = open("vista.jsp");
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
	
	function deshabilitaratutic(){
		document.getElementById("idatendiotxt").style.visibility="hidden";
		document.getElementById("nameatendiotxt").style.visibility="hidden";
		document.getElementById("apellidopatatendiotxt").style.visibility="hidden";
		document.getElementById("apellidomatatendiotxt").style.visibility="hidden";
		document.getElementById("deptoatendiotxt").style.visibility="hidden";
		document.getElementById("idatendiolabel").style.visibility="hidden";
	    document.getElementById("nameatendiolabel").style.visibility="hidden";
		document.getElementById("apellidopatatendiolabel").style.visibility="hidden";
		document.getElementById("apellidomatatendiolabel").style.visibility="hidden";
		document.getElementById("deptoatendiolabel").style.visibility="hidden";
	}

	function habilitaratutic(){
		document.getElementById("idatendiotxt").style.visibility="visible";
		document.getElementById("nameatendiotxt").style.visibility="visible";
		document.getElementById("apellidopatatendiotxt").style.visibility="visible";
		document.getElementById("apellidomatatendiotxt").style.visibility="visible";
		document.getElementById("deptoatendiotxt").style.visibility="visible";
		document.getElementById("idatendiolabel").style.visibility="visible";
	    document.getElementById("nameatendiolabel").style.visibility="visible";
		document.getElementById("apellidopatatendiolabel").style.visibility="visible";
		document.getElementById("apellidomatatendiolabel").style.visibility="visible";
		document.getElementById("deptoatendiolabel").style.visibility="visible";
	}
	
	function deshabilitarcatin(){
		document.getElementById("FolioInc").style.visibility="hidden";
		document.getElementById("TipoInc").style.visibility="hidden";
		document.getElementById("foliolabel").style.visibility="hidden";
		document.getElementById("incidencialabel").style.visibility="hidden";
	}
	
	function habilitarcatin(){
		document.getElementById("FolioInc").style.visibility="visible";
		document.getElementById("TipoInc").style.visibility="visible";
		document.getElementById("foliolabel").style.visibility="visible";
		document.getElementById("incidencialabel").style.visibility="visible";
	}
	
	function deshabilitarstatus(){
		document.getElementById("idatendiotxt").style.visibility="hidden";
		document.getElementById("nameatendiotxt").style.visibility="hidden";
		document.getElementById("idatendiolabel").style.visibility="hidden";
		document.getElementById("nameatendiolabel").style.visibility="hidden";
		
	}
	
	function habilitarstatus(){
		document.getElementById("idatendiotxt").style.visibility="visible";
		document.getElementById("nameatendiotxt").style.visibility="visible";
		document.getElementById("idatendiolabel").style.visibility="visible";
		document.getElementById("nameatendiolabel").style.visibility="visible";
		
	}
	
	function deshabilitarmodulo(){	
		document.getElementById("idmodulolabel").style.visibility="hidden";
		document.getElementById("modulolabel").style.visibility="hidden";
		document.getElementById("idmodulotxt").style.visibility="hidden";
		document.getElementById("modulotxt").style.visibility="hidden";
	}
	
	function habilitarmodulo(){
		document.getElementById("idmodulolabel").style.visibility="visible";
		document.getElementById("modulolabel").style.visibility="visible";
		document.getElementById("idmodulotxt").style.visibility="visible";
		document.getElementById("modulotxt").style.visibility="visible";
	}
	
	function deshabilitaroperutic(){
		document.getElementById("UsuarioOpt").style.visibility="hidden";
		document.getElementById("NumeroOpt").style.visibility="hidden";
		document.getElementById("NombreOpt").style.visibility="hidden";
		document.getElementById("ApellidoPatOpt").style.visibility="hidden";
		document.getElementById("ApellidoMatOpt").style.visibility="hidden";
		document.getElementById("DeptoOpt").style.visibility="hidden";
		document.getElementById("EmailOpt").style.visibility="hidden";
		document.getElementById("UnidadOpt").style.visibility="hidden";
		document.getElementById("UsuarioOptlabel").style.visibility="hidden";
		document.getElementById("NumeroOptlabel").style.visibility="hidden";
		document.getElementById("NombreOptlabel").style.visibility="hidden";
		document.getElementById("ApellidoPatOptlabel").style.visibility="hidden";
		document.getElementById("ApellidoMatOptlabel").style.visibility="hidden";
		document.getElementById("DeptoOptlabel").style.visibility="hidden";
		document.getElementById("EmailOptlabel").style.visibility="hidden";
		document.getElementById("UnidadOptlabel").style.visibility="hidden";
	}
	
	function habilitaroperutic(){
		document.getElementById("UsuarioOpt").style.visibility="visible";
		document.getElementById("NumeroOpt").style.visibility="visible";
		document.getElementById("NombreOpt").style.visibility="visible";
		document.getElementById("ApellidoPatOpt").style.visibility="visible";
		document.getElementById("ApellidoMatOpt").style.visibility="visible";
		document.getElementById("DeptoOpt").style.visibility="visible";
		document.getElementById("EmailOpt").style.visibility="visible";
		document.getElementById("UnidadOpt").style.visibility="visible";
		document.getElementById("UsuarioOptlabel").style.visibility="visible";
		document.getElementById("NumeroOptlabel").style.visibility="visible";
		document.getElementById("NombreOptlabel").style.visibility="visible";
		document.getElementById("ApellidoPatOptlabel").style.visibility="visible";
		document.getElementById("ApellidoMatOptlabel").style.visibility="visible";
		document.getElementById("DeptoOptlabel").style.visibility="visible";
		document.getElementById("EmailOptlabel").style.visibility="visible";
		document.getElementById("UnidadOptlabel").style.visibility="visible";
	}
	
	function deshabilitarproceso(){
		document.getElementById("idprocesotxt").style.visibility="hidden";
		document.getElementById("procesotxt").style.visibility="hidden";
		document.getElementById("idprocesolabel").style.visibility="hidden";
		document.getElementById("procesolabel").style.visibility="hidden";
	}
	
	function habilitarproceso(){
		document.getElementById("idprocesotxt").style.visibility="visible";
		document.getElementById("procesotxt").style.visibility="visible";
		document.getElementById("idprocesolabel").style.visibility="visible";
		document.getElementById("procesolabel").style.visibility="visible";
	}
	
	function deshabilitarsistema(){
		document.getElementById("idsistematxt").style.visibility="hidden";
		document.getElementById("sistematxt").style.visibility="hidden";
		document.getElementById("idsistemalabel").style.visibility="hidden";
		document.getElementById("sistemalabel").style.visibility="hidden";
	}
	
	function habilitarsistema(){
		document.getElementById("idsistematxt").style.visibility="visible";
		document.getElementById("sistematxt").style.visibility="visible";
		document.getElementById("idsistemalabel").style.visibility="visible";
		document.getElementById("sistemalabel").style.visibility="visible";
	}
	
	function deshabilitartipoprio(){
		document.getElementById("idtipodeprioridadlabel").style.visibility="hidden";
		document.getElementById("tipodeprioridadlabel").style.visibility="hidden";
		document.getElementById("idtipodeprioridadtxt").style.visibility="hidden";
		document.getElementById("tipodeprioridadtxt").style.visibility="hidden";
	}
	
	function habilitartipoprio(){
		document.getElementById("idtipodeprioridadlabel").style.visibility="visible";
		document.getElementById("tipodeprioridadlabel").style.visibility="visible";
		document.getElementById("idtipodeprioridadtxt").style.visibility="visible";
		document.getElementById("tipodeprioridadtxt").style.visibility="visible";
		
	}
	function deshabilitartiposol(){
		document.getElementById("idtipodesolucionlabel").style.visibility="hidden";
	    document.getElementById("tipodesolucionlabel").style.visibility="hidden";
		document.getElementById("idtipodesoluciontxt").style.visibility="hidden";
	    document.getElementById("tipodesoluciontxt").style.visibility="hidden";
	}
	
	function habilitartiposol(){
		document.getElementById("idtipodesolucionlabel").style.visibility="visible";
	    document.getElementById("tipodesolucionlabel").style.visibility="visible";
		document.getElementById("idtipodesoluciontxt").style.visibility="visible";
	    document.getElementById("tipodesoluciontxt").style.visibility="visible";
	}
	
	function deshabilitarucat(){
		document.getElementById("idusuariocatlabel").style.visibility="hidden";
	    document.getElementById("nameusuariocatlabel").style.visibility="hidden";
		document.getElementById("apellidousuariocatlabel").style.visibility="hidden";
		document.getElementById("apellidomatatendiolabel").style.visibility="hidden";
		document.getElementById("e-mailusuariocatllabel").style.visibility="hidden";
		document.getElementById("ciscousuariocatlabel").style.visibility="hidden";
		document.getElementById("idusuariocattxt").style.visibility="hidden";
	    document.getElementById("nameusuariocattxt").style.visibility="hidden";
		document.getElementById("apellidousuariocattxt").style.visibility="hidden";
		document.getElementById("apellidomatatendiotxt").style.visibility="hidden";
		document.getElementById("e-mailusuariocattxt").style.visibility="hidden";
		document.getElementById("ciscousuariocattxt").style.visibility="hidden";
	}
	
	function habilitarucat(){
		document.getElementById("idusuariocatlabel").style.visibility="visible";
	    document.getElementById("nameusuariocatlabel").style.visibility="visible";
		document.getElementById("apellidousuariocatlabel").style.visibility="visible";
		document.getElementById("apellidomatatendiolabel").style.visibility="visible";
		document.getElementById("e-mailusuariocatllabel").style.visibility="visible";
		document.getElementById("ciscousuariocatlabel").style.visibility="visible";
		document.getElementById("idusuariocattxt").style.visibility="visible";
	    document.getElementById("nameusuariocattxt").style.visibility="visible";
		document.getElementById("apellidousuariocattxt").style.visibility="visible";
		document.getElementById("apellidomatatendiotxt").style.visibility="visible";
		document.getElementById("e-mailusuariocattxt").style.visibility="visible";
		document.getElementById("ciscousuariocattxt").style.visibility="visible";
	}