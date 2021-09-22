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
<body style="background-color: #343A40">
	<%@ include file="/templates/navbarDocente.jsp"%>
	<div class="container-fluid">
		<div class="row my-5 justify-content-md-center">
			<div class="col-4 my-2" style="color: #AEAEAE">
				<h1 class="text-center">Configurar Disponibilidad</h1>
				<br>
				<h5 class="text-left">Añada o retire horarios según su
					disponibilidad:</h5>
				<br>
				<table class="table table-dark table-striped text-center">
					<thead>
						<tr>
							<th>Día</th>
							<th>Hora</th>
							<th>Acciones</th>
						</tr>
					</thead>
				
					<c:forEach var="horario" items="${horarios}">
						<tr class="align-middle" >
							<td >${horario.dia}</td>
							<td>${horario.horaDeInicio} - ${horario.horaDeFin}</td>
							<td>
								<button type="button" class="btn btn-danger"   onclick="location.href='EliminarHorarioControlador?idhorario=${horario.idHorario}'" >
									<i class="bi bi-trash-fill white"></i> Retirar
								</button>
							</td>
						
							
							
						</tr>
					</c:forEach>
				</table>
				<div class="card border border-white justify-content-end"
					style="background-color: #343A40">
					<div class="card-body">
						<form action="AgregarHorarioControlador" method="POST">
						<label class="form-label">Seleccione un día:</label> <br> <select
							class="form-select" aria-label="Default select example" id="txtDia" name="txtDia">
							<option selected>Día</option>
							<option value="Lunes">Lunes</option>
							<option value="Martes">Martes</option>
							<option value="Miércoles">Miércoles</option>
							<option value="Jueves">Jueves</option>
							<option value="Viernes">Viernes</option>
						</select><br> <label class="form-label">Seleccione una franja
							horaria:</label><br> <select class="form-select align-center"
							aria-label="Default select example" id="txtFranjaHoraria" name="txtFranjaHoraria">
							<option selected>Horario</option>
							<option value="08:00">8:00</option>
							<option value="08:15">8:15</option>
							<option value="08:30">8:30</option>
							<option value="08:45">8:45</option>
							<option value="09:00">9:00</option>
							<option value="09:15">9:15</option>
							<option value="09:30">9:30</option>
							<option value="09:45">9:45</option>
							<option value="10:00">10:00</option>
							<option value="10:15">10:15</option>
							<option value="10:30">10:30</option>
							<option value="10:45">10:45</option>
							<option value="11:00">11:00</option>
							<option value="11:15">11:15</option>
							<option value="11:30">11:30</option>
							<option value="11:45">11:45</option>
							<option value="12:00">12:00</option>
							<option value="12:15">12:15</option>
							<option value="12:30">12:30</option>
							<option value="12:45">12:45</option>
							<option value="14:00">14:00</option>
							<option value="14:15">14:15</option>
							<option value="14:30">14:30</option>
							<option value="14:45">14:45</option>
							<option value="15:00">15:00</option>
							<option value="15:15">15:15</option>
							<option value="15:30">15:30</option>
							<option value="15:45">15:45</option>
							<option value="16:00">16:00</option>
							<option value="16:15">16:15</option>
							<option value="16:30">16:30</option>
							<option value="16:45">16:45</option>
				
						</select><br>
						<div class="text-end">
							<button type=submit" class="btn btn-primary text-end"  onclick="modalRegistrarHorario()">
								<i class="bi bi-plus white"></i> Añadir
							</button>
						</div>
						</form>
					</div>
				</div>
			</div>
		</div>
		<div class="row justify-content-md-center text-center my-3">
			<div class="col-8" style="color: #AEAEAE">
				<button class="btn btn-light mx-5" onclick="location.href='MdoDocenteControlador'">
					<i class="bi bi-arrow-left black"></i> Regresar
				</button>
			</div>
		</div>
	</div>
</body>
<%@ include file="/templates/footer.jsp"%>
</html>