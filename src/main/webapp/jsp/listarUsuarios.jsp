<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listar Usuarios</title>
<%@ include file="/templates/meta.jsp"%>
</head>
<body " style="background-color: #343A40">
	<%@ include file="/templates/navbarAdministrador.jsp"%>
	<div class="container-fluid">
		<div class="row my-5 text-center justify-content-md-center">
			<div class="col-8 my-2" style="color: #AEAEAE">
				<h1>Listar usuarios</h1>
				<br>
				<table class="table table-dark table-striped">
					<thead>
						<tr>
							<th>Cédula</th>
							<th>Apellidos</th>
							<th>Nombres</th>
							<th>Tipo de usuario</th>
							<th>Acciones</th>
						</tr>
					</thead>
					<c:forEach var="usuario" items="${usuarios}">
						<tr class="align-middle">
							<td>${usuario.cedula}</td>
							<td>${usuario.apellido}</td>
							<td>${usuario.nombre}</td>
							<td>${usuario.tipoDeUsuario}</td>
							<td><button type="button" class="btn btn-danger"
									onclick="modalEliminarUsuario()">
									<i class="bi bi-trash-fill white"></i> Eliminar
								</button>
								<button type="button" class="btn btn-primary" onclick="location.href='ActualizarUsuarioControlador'">
									<i class="bi bi-pencil-fill white"></i> Actualizar
								</button></td>
						</tr>
					</c:forEach>
				</table>
			</div>
			<div class="row justify-content-md-center text-center my-3">
			<div class="col-4" style="color: #AEAEAE">
				<button class="btn btn-light mx-5" onclick="location.href='MdoAdministradorControlador'"> <i class="bi bi-arrow-left black"></i> Regresar</button>
			</div>
		</div>
		</div>
	</div>


</body>
<%@ include file="/templates/footer.jsp"%>
</html>