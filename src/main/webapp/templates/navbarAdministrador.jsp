<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
	<div class="container-fluid">
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<img src="../assets/img/logo.png" class="mx-2" alt="" width="3%" height="auto">
			<a class="navbar-brand">Universidad X</a>
			<ul class="navbar-nav mb-2 mb-lg-0 ">
				<li id="tabCompras" class="nav-item dropdown"><a
					class="nav-link text-center px-4" href="#" id="navbarDropdown"
					role="button" data-bs-toggle="dropdown" aria-expanded="false">
						Departamentos </a>
					<ul class="dropdown-menu dropdown-menu-dark bg-dark"
						aria-labelledby="navbarDropdown">
						<li><a class="dropdown-item text-center nav-link"
							href="ListarDepartamentoControlador">Listar departamento</a></li>
						<li><a class="dropdown-item text-center nav-link"
							href="CrearDepartamentoControlador">Crear departamento</a></li>
					</ul></li>
				<li id="tabEgresos" class="nav-item dropdown"><a
					class="nav-link text-center px-4" href="#" id="navbarDropdown"
					role="button" data-bs-toggle="dropdown" aria-expanded="false">
						Usuarios </a>
					<ul class="dropdown-menu dropdown-menu-dark bg-dark"
						aria-labelledby="navbarDropdown">
						<li><a class="dropdown-item text-center nav-link"
							href="ListarUsuarioControlador">Listar Usuario</a></li>
						<li><a class="dropdown-item text-center nav-link"
							href="CrearUsuarioControlador">Crear Usuario</a></li>
					</ul></li>

			</ul>
			
		</div>
		<div class="d-flex flex-row-reverse  bd-highlight">
				
				<ul class="navbar-nav mx-auto">
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle my-auto me-3 text-center" href="#"
						id="navbarDropdown" role="button" data-bs-toggle="dropdown"
						aria-expanded="false"> <i class="bi bi-person-circle color"></i>
							<span id="Usuario">${sessionScope.usuarioLogueado.getNombre()}</span>
					</a>
						<ul
							class="dropdown-menu dropdown-menu-end dropdown-menu-dark bg-dark "
							aria-labelledby="navbarDropdown">
							<li><a id="cerrarsesion"
								class="dropdown-item text-center nav-link" href="LogoutControlador">Cerrar
									sesión</a></li>
						</ul></li>
				</ul>
			</div>
	</div>
</nav>