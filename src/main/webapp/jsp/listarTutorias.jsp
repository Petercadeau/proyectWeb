<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listar tutorías</title>
<%@ include file="../templates/meta.jsp"%>
</head>
<body " style="background-color: #343A40">
	<%@ include file="../templates/navbarDocente.jsp"%>
	<div class="container-fluid">
		<div class="row my-5 text-center justify-content-md-center">
			<div class="col-8 my-2" style="color: #AEAEAE">
				<h1>Listar tutorías</h1>
				<br>
				<table class="table table-dark table-striped">
					<thead>
						<tr class="align-middle">
							<th>Cédula del estudiante</th>
							<th>Nombre</th>
							<th>Fecha</th>
							<th>Hora</th>
						</tr>
					</thead>
						<tr class="align-middle">
							<th>1723793870</th>
							<th>Jeipi</th>
							<th>2021-09-04</th>
							<th>11:00 - 11:15</th>
						</tr>

					<c:forEach var="tutorias" items="${tutoria}">
						<tr class="align-middle">
							<td>${tutoria.cedula}</td>
							<td>${tutoria.nombre}</td>
							<td>${tutoria.fecha}</td>
							<td>${tutoria.hora}</td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
				<div class="row justify-content-md-center text-center my-3">
			<div class="col-8" style="color: #AEAEAE">
				<button class="btn btn-light mx-5" onclick="location.href='MdoDocenteControlador'">
					<i class="bi bi-arrow-left black"></i> Regresar
				</button>
	</div>
</body>
<%@ include file="../templates/footer.jsp"%>
</html>