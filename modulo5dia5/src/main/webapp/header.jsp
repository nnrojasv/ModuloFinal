<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport"
	content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scscale=1.0, minumum-scale=1.0">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
 <%-- <link href="<c:url value="/resources/css/estilos.css" />"rel="stylesheet">  --%>
<style> 
body {
  background-color: #c23f56;
  display: flex;
  flex-direction: column;
  height:100vh;
  margin: auto;
  
}
main{
	background-color: #fdddff;
	width:90%;
	inline-block:center;
	margin-rigth:5%;
	margin-left:5%;
	padding:20px;
	heigth:80%;
	flex:1;
	justify-content: center;
	align-items: center;
	
}

.list-group {
  display: flex;
  align-items: center;
  justify-content: center;
 
}

.menu{
	background-color: pink;
	heigth:20%;
	
}

.mensaje{
	color:red;
	text-sizing:30px;

}

footer{
	background-color: black;
	color: white;
	padding: 20px;
	heigth:10%;
}

.container {
  display: inline-block;
  cursor: pointer;
}

.bar1, .bar2, .bar3 {
  width: 35px;
  height: 5px;
  background-color: #333;
  margin: 6px 0;
  transition: 0.4s;
}

.change .bar1 {
  -webkit-transform: rotate(-45deg) translate(-9px, 6px);
  transform: rotate(-45deg) translate(-9px, 6px);
}

.change .bar2 {opacity: 0;}

.change .bar3 {
  -webkit-transform: rotate(45deg) translate(-8px, -8px);
  transform: rotate(45deg) translate(-8px, -8px);
}
</style>
	
<title>Sistema de gestion de Accidentabilidad</title>
<!-- <script src="/resources/css/jquery-3.5.1.min.js"></script> -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript" src="<c:url value="/resources/js/js.js" />"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>

</head>
<body>

	<div class="container-fluid menu">
		<nav class="navbar navbar-expand-lg navbar-light row">
			<div class=" col-sm-10 col-lg-1 col-md-2 ">
				<a class="navbar-brand" href="#">Logo</a>
			</div>

			<div class="collapse navbar-collapse col-md-10 col-lg-11"
				id="navbarNav">
				<ul class="navbar-nav">
					<li class="nav-item"><a class="nav-link" href="viewcli">Ver
							Clientes </a></li>
					<li class="nav-item"><a class="nav-link" href="viewemp">Ver
							Empleados</a></li>
					<li class="nav-item"><a class="nav-link" href="viewacc">Ver
							Accidentes</a></li>
					<li class="nav-item"><a class="nav-link" href="viewas">Ver
							Asesorias</a></li>
					<li class="nav-item"><a class="nav-link" href="viewvis">Ver
							Visitas</a></li>
					<li class="nav-item"><a class="nav-link" href="viewmej">Ver
							Mejoras</a></li>
					<li class="nav-item"><a class="nav-link" href="viewcap">Ver
							Capacitaciones</a></li>
					<li class="nav-item"><a class="nav-link" href="viewch">Ver
							Checklist</a></li>
					<!--  <li class="nav-item">
        <a class="nav-link" href="viewtasa">Ver Accidentabilidad</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="viewmoro">Ver Morosidad</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="revisarlog">Ver Bitacora de sistema</a>
      </li> -->
				</ul>

			</div>
			<div class="col-xs-12 col-sm-2 col-md-2">
			
				<div class="dropdown">
					<button class="navbar-toggler dropdown-toggle id="dropdownMenu2" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" type="button" 
						 data-toggle="dropdown">
						<span class="navbar-toggler-icon"></span>
					</button>

					<div class="dropdown-menu" aria-labelledby="dropdownMenu2">
						<a class="dropdown-item" href="viewcli">Ver Clientes</a> <a
							class="dropdown-item" href="viewemp">Ver Empleados</a> <a
							class="dropdown-item" href="viewacc">Ver Accidentes</a> <a
							class="dropdown-item" href="viewas">Ver Asesorias</a> <a
							class="dropdown-item" href="viewvis">Ver Visitas</a> <a
							class="dropdown-item" href="viewmej">Ver Mejoras</a> <a
							class="dropdown-item" href="viewcap">Ver Capacitaciones</a> <a
							class="dropdown-item" href="viewch">Ver Checklist</a> <a
							class="dropdown-item" href="viewtasa">Ver Accidentabilidad</a> <a
							class="dropdown-item" href="viewmoro">Ver Morosidad</a> <a
							class="dropdown-item" href="revisarlog">Ver Bitacora de
							sistema</a>
					</div>
				</div>
			</div>
		</nav>

	</div>
	
<main class="main">

	<c:if test="${mensaje != ''}">
		<div class="jumbotron mensaje">
			<h2>
				<c:out value="${mensaje}"></c:out>
			</h2>
		</div>
	</c:if>

	<br>