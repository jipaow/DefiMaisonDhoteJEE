<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="co.simplon.hote.model.ReservationManager" %>
<%@page import="co.simplon.hote.model.ClientImpl" %>
<%@page import="co.simplon.hote.model.Client" %>
<%@page import="co.simplon.hote.controller.Accueil"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<!--Import materialize.css-->
<link type="text/css" rel="stylesheet" href="css/materialize.min.css"
	media="screen,projection" />
<link type="text/css" rel="stylesheet" href="style.css"
	media="screen,projection" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>administration</title>
</head>
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
		  <tr>
			<!-- affichage des infos saisies à titre informatif pour le client -->
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
			</td>
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
		</tbody>
	</table>
	</div>



	<!--footer-->
	<footer class="page-footer blue z-depth-4 ">
	<div class="container">
		<div class="row">
			<div class="col l6 s12">
				<h5 class="black-text">Mas responsive design en provence</h5>
				<p class="black-text ">
					22 aveune des accacias<br>06600 Antibes
				</p>
			</div>
			<div class="col l4 offset-l2 s12">
				<h5 class="white-text">Liens</h5>
				<ul>
					<li><a class="grey-text text-lighten-3"
						href="https://fr-fr.facebook.com/">facebook</a> <img
						src="contenu/facebook.png" /></li>
					<li><a class="grey-text text-lighten-3"
						href="https://twitter.com">twitter</a> <img
						src="contenu/twitter_logo.svg.png" /></li>
					<li><a class="grey-text text-lighten-3"
						href="mailto: MasProvencal@blabla.com">contactez nous par mail</a><i
						class="material-icons font-size:24px">email</i></li>
				</ul>
			</div>
		</div>
	</div>
	<div class="footer-copyright black-text">
		<div class="container">© 2017 Copyright Text</div>
	</div>
	</footer>
</body>
</html>