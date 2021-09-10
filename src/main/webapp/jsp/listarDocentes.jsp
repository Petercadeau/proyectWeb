<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listar Docentes</title>
<%@ include file="/templates/meta.jsp"%>
</head>
<body " style="background-color: #343A40">
	<%@ include file="/templates/navbarEstudiante.jsp"%>
	<div class="container-fluid">
		<div class="row my-5 justify-content-md-center">
			<div class="col-8 my-2" style="color: #AEAEAE">
				<h1 class="text-center">Solicitar tutoría:</h1>
				<br>
				<h5 class="text-left">Seleccione un Docente:</h5>
				<br>
				<table class="table table-dark table-striped text-center">
					<thead>
						<tr>
							<th>Departamento</th>
							<th>Apellidos</th>
							<th>Nombres</th>
							<th>Acciones</th>
						</tr>
					</thead>
					<tr class="align-middle">
						<td>Sistemas</td>
						<td>Villa Torres</td>
						<td>Yolanda</td>
						<td>
							<button type="button" class="btn btn-primary">
								<i class="bi bi-cursor-fill white"></i> Seleccionar
							</button>
						</td>
					</tr>

					<c:forEach var="docente" items="${docentes}">
						<tr class="align-middle">
							<td>${docente.departamento}</td>
							<td>${docente.apellido}</td>
							<td>${dcoente.nombre}</td>
							<td>
								<button type="button" class="btn btn-primary" onclick="location.href='SeleccionarHorarioControlador'">
									<i class="bi bi-cursor-fill white"></i> Seleccionar
								</button>
							</td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
		<div class="row justify-content-md-center text-center my-3">
			<div class="col-4" style="color: #AEAEAE">
				<button class="btn btn-danger mx-5"><i class="bi bi-x-circle black"></i> Cancelar</button>
				<button class="btn btn-light mx-5"> <i class="bi bi-arrow-left black"></i> Regresar</button>
			</div>
		</div>
	</div>
</body>
<%@ include file="/templates/footer.jsp"%>
</html>