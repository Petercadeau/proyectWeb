<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ include file="../templates/meta.jsp"%>
</head>
<body " style="background-color: #343A40">
	<%@ include file="../templates/navbarAdministrador.jsp"%>
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
					<tr>
						<td>0123456789</td>
						<td>Apellido X</td>
						<td>Nombre X</td>
						<td>Administrador</td>
						<td>
							<button type="button" class="btn btn-danger">
								<i class="bi bi-trash-fill white"></i>Eliminar
							</button>
							<button type="button" class="btn btn-primary">
								<i class="bi bi-pencil-fill white"></i>Actualizar
							</button>
						</td>
					</tr>
					<c:forEach var="usuarios" items="${usuario}">
						<tr>
							<td>${usuario.cedula}</td>
							<td>${usuario.apellido}</td>
							<td>${usuario.nombre}</td>
							<td>${usuario.tipo}</td>
							<td><button type="button" class="btn btn-danger" onclick="modalEliminarUsuario()"> 
									<i class="bi bi-trash-fill white"></i>Eliminar
								</button>
								<button type="button" class="btn btn-primary">
									<i class="bi bi-pencil-fill white"></i>Actualizar
								</button></td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
	</div>
	<div class="modal fade" id="staticBackdrop" data-bs-backdrop="static"
		data-bs-keyboard="false" tabindex="-1"
		aria-labelledby="staticBackdropLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="btn-close" data-bs-dismiss="modal"
						aria-label="Close"></button>
				</div>
				<div class="modal-body">
				¿Estás seguro que deseas eliminar este usuario?
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-danger"
						data-bs-dismiss="modal">Cancelar</button>
					<button type="button" class="btn btn-primary">Continuar</button>
				</div>
			</div>
		</div>
	</div>


</body>
<%@ include file="../templates/footer.jsp"%>
</html>