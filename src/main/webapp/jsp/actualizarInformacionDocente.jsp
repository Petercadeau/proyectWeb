<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Actualizar Información Docente</title>
<%@ include file="/templates/meta.jsp"%>
</head>
<body " style="background-color: #343A40">
	<%@ include file="/templates/navbarDocente.jsp"%>
	<div class="container-fluid">
		<form action="ActualizaInformacionDocenteControlador" method="POST">
			<div class="row mt-4 mb-3 text-center justify-content-md-center">
				<div class="col-8 my-2" style="color: #AEAEAE">
					<h1>Actualizar Información Personal</h1>
				</div>
			</div>
			<div class="row justify-content-md-center">
				<div class="col-4" style="color: #AEAEAE">
					<label class="form-label">Nombre:</label><br> 
					<input type="text" class="form-control" id="txtNombre" name="txtNombre" value="${persona.getNombre()}"><br> 
					<label class="form-label">Apellido:</label><br> 
					<input type="text" class="form-control" id="txtApellido" name="txtApellido" value="${persona.getApellido()}"><br> 
					<label class="form-label">Departamento:</label><br>
					<select class="form-select align-center" id="txtDepartamento" name="txtDepartamento"
						aria-label="Default select example">
						<option value="${persona.departamento.idDepartamento}" hidden selected>${persona.departamento.nombre}</option>
						<c:forEach  var="departamento" items="${departamentos}">
							<option value=${departamento.idDepartamento}>${departamento.nombre}</option>
						</c:forEach>
					</select><br>
				</div>
			</div>
		</form>
		<div class="row justify-content-md-center text-center my-3">
			<div class="col-4" style="color: #AEAEAE">
				<button class="btn btn-danger mx-5" onclick="location.href='MdoDocenteControlador'">
					<i class="bi bi-x-circle black"></i> Cancelar
				</button>
				<button class="btn btn-primary mx-5"
					onclick="modalActualizarDocente()">Continuar</button>
			</div>
		</div>

	</div>
</body>
<%@ include file="/templates/footer.jsp"%>

<script type="text/javascript">


function modalActualizarDocente() {
	let idDocente = ${persona.id};
	let nombre = $('#txtNombre').val();
	let apellido = $('#txtApellido').val();
	let departamento = $('#txtDepartamento').val();
	
	
	$.ajax({
		url: "ActualizarInformacionDocenteControlador",
		data: {txtIdDocente: idDocente,txtNombre: nombre,txtApellido: apellido, txtDepartamento:departamento},
		method: "POST",
		success: function(){
			swal("Docente actualizado correctamente", {
				icon: "success",
			});
			setTimeout(() => {
				location.href='MdoDocenteControlador';
			}, 2000);
		}

	}).done(function() {
		$(this).addClass("done");
	});
	
}
</script>


</html>