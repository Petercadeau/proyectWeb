<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listar Departamentos</title>
<%@ include file="../templates/meta.jsp"%>
</head>
<body " style="background-color: #343A40">
	<%@ include file="../templates/navbarAdministrador.jsp"%>
	<div class="container-fluid">
		<div class="row my-5 justify-content-md-center">
			<div class="col-8 my-2" style="color: #AEAEAE">
				<h1 class="text-center">Listar Departamentos</h1>
				<br>
				<table class="table table-dark table-striped text-center">
					<thead>
						<tr>
							<th>Departamento</th>
							<th>Acciones</th>
						</tr>
					</thead>
					<tr class="align-middle">
						<td>Sistemas</td>
						<td>
							<button type="button" class="btn btn-danger">
								<i class="bi bi-trash-fill white"></i> Eliminar
							</button>
							<button type="button" class="btn btn-primary">
								<i class="bi bi-pencil-fill white"></i> Actualizar
							</button>
						</td>
					</tr>

					<c:forEach var="tutorias" items="${departamento}">
						<tr class="align-middle">
							<td>${departamento.nombre}</td>
						<td>
							<button type="button" class="btn btn-danger" onclick="location.href='EliminarDepartamentoControlador'">
								<i class="bi bi-trash-fill white"></i> Eliminar
							</button>
							<button type="button" class="btn btn-primary" onclick="location.href='ActualizarDepartamentoControlador'">
								<i class="bi bi-pencil-fill white"></i> Actualizar
							</button>
						</td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
		<div class="row justify-content-md-center text-center my-3">
			<div class="col-4" style="color: #AEAEAE">
				<button class="btn btn-light mx-5" onclick="location.href='MdoAdministradorControlador'"> <i class="bi bi-arrow-left black"></i> Regresar</button>
			</div>
		</div>
	</div>
</body>
<%@ include file="../templates/footer.jsp"%>
</html>