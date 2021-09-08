<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Solicitar Tutoría</title>
<%@ include file="../templates/meta.jsp"%>
</head>
<body " style="background-color: #343A40">
	<%@ include file="../templates/navbarEstudiante.jsp"%>
	<div class="container-fluid">
		<div class="row my-5 justify-content-md-center">
			<div class="col-4 my-2" style="color: #AEAEAE">
				<h1 class="text-center">Solicitar Tutoría</h1>
				<br>
				<h5 class="text-left">Seleccione la fecha en la que desea realizar la tutoría:</h5>
				<br>
				<input class="align-middle form-control" type="date">

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
				<button class="btn btn-danger mx-5" onclick="location.href='MdoEstudianteControlador'">
					<i class="bi bi-x-circle black"></i> Cancelar
				</button>
				<button class="btn btn-primary mx-5" onclick="location.href='ListarDocentesControlador'">Continuar</button>
			</div>
		</div>
	</div>
</body>
<%@ include file="../templates/footer.jsp"%>
</html>