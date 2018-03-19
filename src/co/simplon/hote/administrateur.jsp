<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<link type="text/css" rel="stylesheet" href="css/materialize.min.css" media="screen" />
<link type="text/css" rel="stylesheet" href="style.css" media="screen" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<body class="background">
	
	<header> <nav>
	<div class="nav-wrapper light blue z-depth-4">
		<a href="index.html" class="brand-logo center"><img
			src="contenu/logo.png"></a> <a href="#"
			data-activates="mobile-menu" class="button-collapse"> <i
			class="material-icons">menu</i>
		</a>
		<ul class="left hide-on-med-and-down">
			<li><a href="index.html">Accueil</a></li>
			<li><a href="page2.html">Decouvrez notre region</a></li>
			<li><a href="page3.html">Reservation</a></li>
		</ul>

		<ul class="side-nav background" id="mobile-menu">
			<li><a href="index.html">Accueil</a></li>
			<li><a href="page2.html">Decouvrez notre region</a></li>
			<li><a href="page3.html">Reservation</a></li>
		</ul>
	</div>
	</nav> 
	</header>

	<div id="conteneur">
	<table  id="tab"class="bordered responsive-table">
	
		<thead >
			<tr>
				<th>Nom</th>
				<th>Prenom</th>
				<th>Email</th>
				<th>Tel</th>
				<th>Parking</th>
				<th>Animal</th>
				<th>Fumeur</th>
				<th>Petit dejeuner</th>
				<th>Type de séjour</th>
				<th>Nombre de nuit</th>
				<th>Nombre de visiteurs</th>
			</tr>
		</thead>

		<tbody>
		<!-- parcours de la liste des reservations et affichage dans les chmaps du tableau -->
		<c:forEach var="client" items="${infoResa}">
		<tr>
		<td><c:out value="${client.nom}"/></td>
			
			<td><c:out value="${client.prenom}"/></td>

			
			<td><c:out value="${client.mail}"/></td>

			
		<td><c:out value="${client.tel}"/></td>
		<td>
				<c:choose>
					<c:when test="${client.parking == null}">non</c:when>
					<c:otherwise>oui</c:otherwise>
				</c:choose>			
			</td>
			<td>
				<c:choose>
					<c:when test="${client.animal == null}">non</c:when>
					<c:otherwise>oui</c:otherwise>
				</c:choose>
			</td>
			<td>
				<c:choose>
					<c:when test="${client.fumeur == null}">non</c:when>
					<c:otherwise>oui</c:otherwise>
				</c:choose>
				<td>
				<c:choose>
					<c:when test="${client.ptiDej == null}">non</c:when>
					<c:otherwise>oui</c:otherwise>
				</c:choose>
			</td>
			<td><c:out value="${client.sejour}"/></td>
			<td><c:out value="${client.nuit}"/></td>
			<td><c:out value="${client.nbreDeVisiteur}"/></td>
		</tr>
	</c:forEach>
		</tbody>
	</table>
	</div>


</body>
</html>