<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Actualizar Usuario</title>
<%@ include file="/templates/meta.jsp"%>
</head>
<body " style="background-color: #343A40">
	<%@ include file="/templates/navbarAdministrador.jsp"%>
	<div class="container-fluid">
		<form method="POST">
			<div class="row mt-4 mb-3 text-center justify-content-md-center">
				<div class="col-8 my-2" style="color: #AEAEAE">
					<h1>Actualizar usuarios</h1>
				</div>
			</div>
			<div class="row justify-content-md-center">
				<div class="col-4" style="color: #AEAEAE">
					<label class="form-label">C�dula:</label><br> <input
						id="txtCedula" name="Cedula" type="text" class="form-control"><br>
					<label class="form-label">Nombre:</label><br> <input
						id="txtNombre" name="Nombre" type="text" class="form-control"><br>
					<label class="form-label">Apellido:</label><br> <input
						id="txtApellido" name="Apellido" type="text" class="form-control"><br>
					<label class="form-label">Tipo de usuario:</label><br> <select
						id="txtTipoUsuario" name="txtTipoUsuario" class="form-select">
						<option value="Administrador">Administrador</option>
						<option value="Docente">Docente</option>
						<option value="Estudiante">Estudiante</option>
					</select> <br>
				</div>
			</div>
		</form>
		<div class="row justify-content-md-center text-center my-3">
			<div class="col-4" style="color: #AEAEAE">
				<button class="btn btn-danger mx-5">
					<i class="bi bi-x-circle black"></i> Cancelar
				</button>
				<button class="btn btn-primary mx-5"
					onclick="modalActualizarUsuario()">Continuar</button>
			</div>
		</div>
	</div>
</body>
<%@ include file="/templates/footer.jsp"%>
</html>