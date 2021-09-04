<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listar Horarios</title>
<%@ include file="../templates/meta.jsp"%>
</head>
<body " style="background-color: #343A40">
	<%@ include file="../templates/navbarDocente.jsp"%>
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
					<tr class="align-middle">
						<td>Lunes</td>
						<td>11:00 - 11:15</td>
						<td>
							<button type="button" class="btn btn-danger">
								<i class="bi bi-trash-fill white"></i> Retirar
							</button>
						</td>
					</tr>

					<c:forEach var="tutorias" items="${tutoria}">
						<tr class="align-middle">
							<td>${tutoria.tutoria_dia}</td>
							<td>${tutoria.tutoria_hora}</td>
							<td>
								<button type="button" class="btn btn-danger">
									<i class="bi bi-trash-fill white"></i> Retirar
								</button>
							</td>
						</tr>
					</c:forEach>
				</table>
				<div class="text-center" style="border: 1px solid grey; font-size: 20px">
					<a>Seleccione un día:</a><br>
					<div class="col-6">
						<select class="form-select align-center"
							aria-label="Default select example">
							<option selected>Día</option>
							<option value="1">Lunes</option>
							<option value="2">Martes</option>
							<option value="3">Miércoles</option>
							<option value="4">Jueves</option>
							<option value="5">Viernes</option>
						</select>
					</div>
					<a>Seleccione una franja horaria:</a><br>
					<div class="col-6">
						<select class="form-select align-center"
							aria-label="Default select example">
							<option selected>Horario</option>
							<option value="1">11:00 - 11:15</option>
							<option value="2">12:00 - 12:15</option>
							<option value="3">13:00 - 13:15</option>
						</select>
					</div>
					<div>
						<button type="button" class="btn btn-primary">
							<i class="bi bi-plus white"></i> Añadir
						</button>
					</div>

				</div>
			</div>

		</div>
		<div class="row justify-content-md-center text-center my-3">
			<div class="col-8" style="color: #AEAEAE">
				<button class="btn btn-light mx-5">
					<i class="bi bi-arrow-left black"></i> Regresar
				</button>
			</div>
		</div>
	</div>
</body>
<%@ include file="../templates/footer.jsp"%>
</html>