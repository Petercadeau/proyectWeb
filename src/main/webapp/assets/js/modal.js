

function modalActualizarDocente() {
	$.ajax({
		url: "ActualizarInformacionDocenteControlador",
		data: {},
		method: "POST",

	}).done(function() {
		$(this).addClass("done");
	});
	swal("Docente actualizado correctamente", {
		icon: "success",
	});
}



