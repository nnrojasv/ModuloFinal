<%@include file="../../header.jsp"%>
<div class="container-fluid">
	<div class="row ">
		<div class="col-lg-10 col-md-9 ">
			<h1>Lista de Accidentes</h1>
		</div>
		<div class="d-none d-md-none d-md-block">
		<%@ include file="../../hola.jsp"%>
		</div>
		
	</div>
</div>
<div class="container-fluid">
	<div class="table-responsive-lg">
		<table class="table">
			<thead class="thead-dark">
				<tr>
					<th scope="col">Id Accidente</th>
					<th scope="col">Fecha</th>
					<th scope="col">Hora</th>
					<th scope="col">Suceso</th>
					<th scope="col">Lugar</th>
					<th scope="col">Cliente</th>
					<th>Editar</th>
					<th>Eliminar</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="acc" items="${listacc}">
					<tr>
						<td scope="row">${acc.idaccidente}</td>
						<td>${acc.fecha}</td>
						<td>${acc.hora}</td>
						<td>${acc.suceso}</td>
						<td>${acc.lugar}</td>
						<td>${acc.cliente_id}</td>
						<td><a href="editacc/${acc.idaccidente}" type="button"
							class="btn btn-primary btn-sm">Editar</a></td>
						<td><a href="deleteacc/${acc.idaccidente}" type="button"
							class="btn btn-primary btn-sm">Eliminar</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</div>
<br />
<div class="container">
	<a href="accform" type="button" class="btn btn-primary ">Agregar
		Accidente</a>
</div>
<%@include file="../../footer.jsp"%>