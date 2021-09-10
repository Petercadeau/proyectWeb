<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ include file="/templates/meta.jsp"%>
</head>
<body " style="background-color: #343A40">
	<%@ include file="/templates/navbarEstudiante.jsp"%>
	<div class="container-fluid">
		<form method="POST">
			<div class="row mt-4 mb-3 text-center justify-content-md-center">
				<div class="col-8 my-2" style="color: #AEAEAE">
					<h1>Cambiar clave</h1>
				</div>
			</div>
			<div class="row justify-content-md-center">
				<div class="col-4" style="color: #AEAEAE">
					<label class="form-label">Ingrese su contraseña actual:</label><br>
					<input type="password" class="form-control" id="txtClave"><br>
					<label class="form-label">Ingrese su nueva contraseña:</label><br>
					<input type="password" class="form-control" id="txtNuevaClave"><br>
					<label class="form-label">Vuelva a ingresar su nueva
						contraseña:</label><br> <input type="password" class="form-control"
						id="txtConfirmarClave"><br>
				</div>
			</div>
		</form>
		<div class="row justify-content-md-center text-center my-3">
			<div class="col-4" style="color: #AEAEAE">
				<button class="btn btn-primary mx-5" onclick="modalCambiarClave()">Continuar</button>
			</div>
		</div>
	</div>
</body>
<%@ include file="/templates/footer.jsp"%>

<script type="text/javascript">



function modalCambiarClave() {
	let claveAntigua = $('#txtClave').val();
	let txtClaveReal = ${sessionScope.usuarioLogueado.getClave()};
	let claveNueva = $('#txtNuevaClave').val();
	let confirmarClave = $('#txtConfirmarClave').val();
	let txtId = ${sessionScope.usuarioLogueado.getId()};
	
	if(claveAntigua != txtClaveReal || claveNueva!=confirmarClave){
		swal("Error al cambiar la clave", {
			icon: "error",
		});
		return;
	}else{
		swal({
			title: "¿Estás seguro que deseas actualizar tu clave?",
			text: "",
			icon: "warning",
			buttons: ["Cancelar", "Continuar"],
		})
			.then((willDelete) => {
				if (willDelete) {
					$.ajax({
						url: "CambiarClaveControlador",
						data: {"txtClaveNueva":claveNueva, "txtId": txtId},
						method: "POST",
						success: function(){
							console.log('clave cambiada con exito');
							swal("Clave actualizada correctamente", {
								icon: "success",
							});
							setTimeout(() => {
								location.href = "MdoEstudianteControlador";
							}, 2000);
						}

					})
				}
			});
	}
	
	
}
</script>
</html>