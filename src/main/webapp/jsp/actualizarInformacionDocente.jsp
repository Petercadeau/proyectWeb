<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Actualizar Información Docente</title>
<%@ include file="../templates/meta.jsp"%>
</head>
<body " style="background-color: #343A40">
	<%@ include file="../templates/navbarDocente.jsp"%>
	<div class="container-fluid">
		<div class="row mt-4 mb-3 text-center justify-content-md-center">
			<div class="col-8 my-2" style="color: #AEAEAE">
				<h1>Actualizar Información Personal</h1>
			</div>
		</div>
		<div class="row justify-content-md-center">
			<div class="col-4" style="color: #AEAEAE">
				<label class="form-label">Nombre:</label><br>
				<input type="text" class="form-control"><br> 
				<label class="form-label">Apellido:</label><br>
				<input type="text" class="form-control"><br> 
				<label class="form-label">Departamento:</label><br>
				<select class="form-select align-center" aria-label="Default select example">
					<option selected></option>
					<option value="1">Química</option>
					<option value="2">Mecánica</option>
					<option value="3">Sistemas</option>
				</select><br>
			</div>
		</div>
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
<%@ include file="../templates/footer.jsp"%>
</html>