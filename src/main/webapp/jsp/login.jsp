<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="ISO-8859-1">
        <title>Inicio de sesi�n</title>
        <%@ include file="../templates/meta.jsp" %>
    </head>

    <body style="background-image: url('../assets/img/bg.png');">
        <div class="container h-100 text-white">
            <div class="row justify-content-sm-center h-100">
                <div class="col-xxl-4 col-xl-5 col-lg-5 col-md-7 col-sm-9">
                    <div class="text-center my-2">
                        <img class="my-0" src="../assets/img/logo.png" width=35%>
                    </div>
                    <div class="card shadow-lg bg-dark">
                        <div class="card-body p-5">
                            <h1 class="fs-4 card-title fw-bold mb-4">Inicio de sesi�n</h1>
                            <form method="POST" class="needs-validation" novalidate="" autocomplete="off">
                                <div class="mb-3">
                                    <label class="mb-2 text-muted" for="email">C�dula</label>
                                    <input id="cedula" type="text" class="form-control" name="email" value="" required
                                        autofocus>
                                    <div class="invalid-feedback">
                                        Credenciales incorrectas
                                    </div>
                                </div>
                                <div class="mb-3">
                                    <div class="mb-2 w-100">
                                        <label class="text-muted" for="password">Contrase�a</label>
                                    </div>
                                    <input id="password" type="password" class="form-control bg.dark" name="password"
                                        required>
                                    <div class="invalid-feedback">
                                        Contrase�a requerida
                                    </div>
                                </div>
                                <div class="d-flex align-items-center">
                                    <div class="form-check">
                                        <input type="checkbox" name="remember" id="recordarme" class="form-check-input">
                                        <label for="remember" class="form-check-label">Recordarme</label>
                                    </div>
                                    <button type="submit" class="btn btn-primary ms-auto">
                                        Iniciar sesi�n
                                    </button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
    <%@ include file="../templates/footer.jsp" %>

    </html>