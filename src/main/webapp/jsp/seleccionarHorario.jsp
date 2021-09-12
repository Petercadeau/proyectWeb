<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listar Horarios</title>
<%@ include file="/templates/meta.jsp"%>
</head>
<body " style="background-color: #343A40">
	<%@ include file="/templates/navbarEstudiante.jsp"%>
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
							<th>Acciones</th>
						</tr>
					</thead>
					<c:forEach var="horario" items="${horarios}">
						<tr class="align-middle">
							<td>${horario.horaDeInicio}</td>
							<td>${horario.horaDeFin}</td>
							<td><button class="btn btn-primary mx-5"
									onclick="modalRegistrarTutoria(${horario.idHorario})">Registrar Tutoría</button></td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
		<div class="row justify-content-md-center text-center my-3">
			<div class="col-8" style="color: #AEAEAE">
				<button class="btn btn-danger mx-5"  onclick="location.href='MdoEstudianteControlador'">
					<i class="bi bi-x-circle black"></i> Cancelar
				</button>
				<button class="btn btn-light mx-5"  onclick="location.href='ListarDocentesControlador?txtDiaFecha=${txtDia}'">
					<i class="bi bi-arrow-left black"></i> Regresar
				</button>

			</div>
		</div>
	</div>
</body>
<script>
function modalRegistrarTutoria(id) {
	console.log(id);
	console.log("${idDocente}");
	console.log("${sessionScope.usuarioLogueado.getId()}");
	
	let idEstudiante = ${sessionScope.usuarioLogueado.getId()};
	let idDocente = ${idDocente};
	
	
	$.ajax({
		method: "POST",
		url: "SeleccionarHorarioControlador",
		data: { idHorario: id, idDocente: idDocente, idEstudiante: idEstudiante},
		
		success: function() {
			swal("Tutoría registrada correctamente", {
				icon: "success",
			});
			setTimeout(() => {
				location.href = "MdoEstudianteControlador";
			}, 2000);
		}
	})
}
</script>
<%@ include file="/templates/footer.jsp"%>
</html>