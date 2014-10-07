function validarDatos(){
	var folio = document.getElementById("foliotxt");
	
	if (folio == "" || folio == '' || folio == null){
		alert("Ingresa un Folio");
		folio.focus();
		return false;
	}
}