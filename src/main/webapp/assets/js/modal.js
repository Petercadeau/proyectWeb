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