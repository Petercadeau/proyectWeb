<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listar Horarios</title>
<%@ include file="../templates/meta.jsp"%>
</head>
<body " style="background-color: #343A40">
	<%@ include file="../templates/navbarEstudiante.jsp"%>
	<div class="container-fluid">
		<div class="row my-5 justify-content-md-center">
			<div class="col-4 my-2" style="color: #AEAEAE">
				<h1 class="text-center">Solicitar tutoría:</h1>
				<br>
				<h5 class="text-left">Seleccione un horario para la tutoría:</h5>
				<br>
				<table class="table table-dark table-striped text-center">
					<thead>
						<tr>
							<th>Inicia</th>
							<th>Finaliza</th>
						</tr>
					</thead>
					<tr class="align-middle">
						<td>11:00</td>
						<td>11:15</td>
					</tr>

					<c:forEach var="tutorias" items="${horario}">
						<tr class="align-middle">
							<td>${horario.hora_inicio}</td>
							<td>${horario.hora_fin}</td>

						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
		<div class="row justify-content-md-center text-center my-3">
			<div class="col-8" style="color: #AEAEAE">
				<button class="btn btn-danger mx-5">
					<i class="bi bi-x-circle black"></i> Cancelar
				</button>
				<button class="btn btn-light mx-5">
					<i class="bi bi-arrow-left black"></i> Regresar
				</button>
				<button class="btn btn-primary mx-5" onclick="modalRegistrarTutoria()"> Registrar Tutoría
				</button>
			</div>
		</div>
	</div>
</body>
<%@ include file="../templates/footer.jsp"%>
</html>