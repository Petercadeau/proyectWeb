<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <div class="container-fluid">
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false"
                aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
                <img src="../assets/img/logo.png" alt="" width="3%" height="auto">
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mx-auto me-auto mb-2 mb-lg-0 text-center">
                    <li id="tabCompras" class="nav-item dropdown">
                        <a class="nav-link text-center px-5" href="#" id="navbarDropdown" role="button"
                            data-bs-toggle="dropdown" aria-expanded="false">
                            Perfil
                        </a>
                        <ul class="dropdown-menu dropdown-menu-dark bg-dark" aria-labelledby="navbarDropdown">
                            <li><a class="dropdown-item text-center nav-link" href="RegistrarCompra.html">Actualizar Información</a>
                            </li>
                        </ul>
                    </li>
                    <li id="tabEgresos" class="nav-item dropdown">
                        <a class="nav-link text-center px-5" href="#" id="navbarDropdown" role="button"
                            data-bs-toggle="dropdown" aria-expanded="false">
                            Horarios
                        </a>
                    </li>
                    <li id="tabEgresos" class="nav-item dropdown">
                        <a class="nav-link text-center px-5" href="#" id="navbarDropdown" role="button"
                            data-bs-toggle="dropdown" aria-expanded="false">
                            Tutorias
                        </a>
                    </li>
                   
                </ul>
                <div class="d-flex">
                    <ul class="navbar-nav mx-auto">
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle my-auto me-3 text-center" href="#" id="navbarDropdown"
                                role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                <i class="bi bi-person-circle color"></i>
                                <span id="Usuario">Nombre</span>
                            </a>
                            <ul class="dropdown-menu dropdown-menu-end dropdown-menu-dark bg-dark " aria-labelledby="navbarDropdown">
                                <li><a id="cerrarsesion" class="dropdown-item text-center nav-link" href="index.html">Cerrar sesión</a></li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </nav>