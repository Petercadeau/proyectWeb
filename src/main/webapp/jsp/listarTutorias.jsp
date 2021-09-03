<%@ page language="java" contentType="text/html; charset=UTF-8"
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
				<h1>Listar tutorías</h1><br>
				<table class="table table-dark table-striped">
					<thead>
						<tr>
							<th>Cédula del estudiante</th>
							<th>Nombre</th>
							<th>Fecha</th>
							<th>Hora</th>
						</tr>
					</thead>

					<c:forEach var="tutorias" items="${tutoria}">
						<tr>
							<td>${tutoria.cedula}</td>
							<td>${tutoria.nombre}</td>
							<td>${tutoria.fecha}</td>
							<td>${tutoria.hora}</td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
	</div>
</body>
<%@ include file="../templates/footer.jsp"%>
</html>