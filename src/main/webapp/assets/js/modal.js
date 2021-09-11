function modalEliminarUsuario() {
	swal({
		title: "¿Estás seguro que deseas eliminar este usuario?",
		text: "",
		icon: "warning",
		buttons: ["Cancelar", "Continuar"],
	})
		.then((willDelete) => {
			if (willDelete) {
				$.ajax({
					url: "EliminarUsuarioControlador",
					data: {},
					method: "POST",

				}).done(function() {
					$(this).addClass("done");
				});
				swal("Usuario eliminado exitosamente", {
					icon: "success",
				});
			}
		});
}
function modalActualizarUsuario() {
	$.ajax({
		url: "ActualizarUsuarioControlador",
		data: {},
		method: "POST",

	}).done(function() {
		$(this).addClass("done");
	});
	swal("Usuario actualizado correctamente", {
		icon: "success",
	});
}
function modalActualizarDocente() {
	$.ajax({
		url: "ActualizarInformaciónDocenteControlador",
		data: {},
		method: "POST",

	}).done(function() {
		$(this).addClass("done");
	});
	swal("Docente actualizado correctamente", {
		icon: "success",
	});
}
function modalCrearDepartamento() {
	$.ajax({
		url: "CrearDepartamentoControlador",
		data: {},
		method: "POST",

	}).done(function() {
		$(this).addClass("done");
	});
	swal("Departamento creado correctamente", {
		icon: "success",
	});
}
function modalCrearUsuario() {
	$.ajax({
		url: "CrearUsuarioControlador",
		data: {},
		method: "POST",

	}).done(function() {
		$(this).addClass("done");
	});
	swal("Usuario creado correctamente", {
		icon: "success",
	});
}

