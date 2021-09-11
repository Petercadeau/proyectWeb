<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Solicitar Tutor�a</title>
<%@ include file="/templates/meta.jsp"%>
</head>
<body " style="background-color: #343A40">
	<%@ include file="/templates/navbarEstudiante.jsp"%>
	<div class="container-fluid">
		<form action="ListarDocentesControlador" method="post">
			<div class="row my-5 justify-content-md-center">
				<div class="col-4 my-2" style="color: #AEAEAE">
					<h1 class="text-center">Solicitar Tutor�a</h1>
					<br>
					<h5 class="text-left">Seleccione la fecha en la que desea
						realizar la tutor�a:</h5>
					<br> <input class="align-middle form-control" type="date"
						id="txtFechatutoria" onchange="getDayFromDate()"> <input
						class="align-middle form-control" hidden type="text"
						id="txtDiaFecha" name="txtDiaFecha">

				</div>
			</div>
			<div class="row justify-content-md-center text-center my-3">
				<div class="col-8" style="color: #AEAEAE">
					<button type="button" class="btn btn-danger mx-5"
						onclick="location.href='MdoEstudianteControlador'">
						<i class="bi bi-x-circle black"></i> Cancelar
					</button>
					<button class="btn btn-primary mx-5"
						type="submit"><i class="bi bi-arrow-right black"></i> Continuar</button>
				</div>
			</div>
		</form>

	</div>
</body>
<%@ include file="/templates/footer.jsp"%>
<script type="text/javascript">
	function getDayFromDate() {
		let dias = [ "Lunes", "Martes", "Miercoles", "Jueves", "Viernes" ];
		let dt = new Date(Date.parse($("#txtFechatutoria").val()));
		let d = dt.getDay();

		if (dias[d] != null) {
			$("#txtDiaFecha").val(dias[d]);
			console.log("Hola");
		} else {
			console.log("NOOOOOOOOOOO");
		}
	}
</script>
</html>