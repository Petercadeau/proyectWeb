function modalEliminarUsuario() {
	swal({
		title: "¿Estás seguro que deseas eliminar este usuario?",
		text: "",
		icon: "warning",
		buttons: ["Cancelar","Continuar"],
	})
		.then((willDelete) => {
			if (willDelete) {
				swal("Usuario eliminado exitosamente", {
					icon: "success",
				});
			}
		});
}
function modalActualizarUsuario(){
	swal("Usuario actualizado correctamente", {
					icon: "success",
				});
}
function modalActualizarDocente(){
	swal("Docente actualizado correctamente", {
					icon: "success",
				});
}
function modalCrearDepartamento(){
	swal("Departamento creado correctamente", {
					icon: "success",
				});
}
function modalCrearUsuario(){
	swal("Usuario creado correctamente", {
					icon: "success",
				});
}
function modalActualizarDepartamento(){
	swal("Departamento actualizado correctamente", {
					icon: "success",
				});
}
function modalRegistrarTutoria(){
	swal("Tutoría registrada correctamente", {
					icon: "success",
				});
}
function modalCambiarClave() {
	swal({
		title: "¿Estás seguro que deseas actualizar tu clave?",
		text: "",
		icon: "warning",
		buttons: ["Cancelar","Continuar"],
	})
		.then((willDelete) => {
			if (willDelete) {
				swal("Clave actualizada correctamente", {
					icon: "success",
				});
			}
		});
}