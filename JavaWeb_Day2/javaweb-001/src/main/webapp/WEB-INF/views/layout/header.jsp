<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- tich hop jstl vao jsp -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div id="header" class="container-fluid bg-dark sticky-top">
	<nav class="navbar navbar-expand-md bg-dark navbar-dark">
		<!-- Brand -->
		<a class="navbar-brand" href="/"> <img id="logo"
			src="/img/logo.jpg" alt="Logo">
		</a>

		<!-- Toggler/collapsibe Button -->
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#collapsibleNavbar">
			<span class="navbar-toggler-icon"></span>
		</button>

		<!-- Navbar links -->
		<div class="collapse navbar-collapse" id="collapsibleNavbar">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbardrop"
					data-toggle="dropdown"> iMac </a>
					<div class="dropdown-menu bg-danger">
						<a class="dropdown-item" href="#">iMac 2019</a> <a
							class="dropdown-item" href="#">iMac 2018</a> <a
							class="dropdown-item" href="#">iMac 2017</a> <a
							class="dropdown-item" href="#">iMac 2015</a> <a
							class="dropdown-item" href="#">iMac 2013</a> <a
							class="dropdown-item" href="#">iMac 2011</a>
					</div></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbardrop"
					data-toggle="dropdown"> Macbookpro </a>
					<div class="dropdown-menu bg-danger">
						<a class="dropdown-item" href="#">Macbookpro 2019</a> <a
							class="dropdown-item" href="#">Macbookpro 2018</a> <a
							class="dropdown-item" href="#">Macbookpro 2017</a> <a
							class="dropdown-item" href="#">Macbookpro 2016</a> <a
							class="dropdown-item" href="#">Macbookpro 2015</a> <a
							class="dropdown-item" href="#">Macbookpro 2013</a> <a
							class="dropdown-item" href="#">Macbookpro 2012</a> <a
							class="dropdown-item" href="#">Macbookpro 2011</a>
					</div></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbardrop"
					data-toggle="dropdown"> Macbookair </a>
					<div class="dropdown-menu bg-danger">
						<a class="dropdown-item" href="#">Macbookair 2018</a> <a
							class="dropdown-item" href="#">Macbookair 2017</a> <a
							class="dropdown-item" href="#">Macbookair 2016</a> <a
							class="dropdown-item" href="#">Macbookair 2015</a> <a
							class="dropdown-item" href="#">Macbookair 2014</a> <a
							class="dropdown-item" href="#">Macbookair 2013</a> <a
							class="dropdown-item" href="#">Macbookair 2012</a> <a
							class="dropdown-item" href="#">Macbookair 2011</a>
					</div></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbardrop"
					data-toggle="dropdown"> Macbook Old </a>
					<div class="dropdown-menu bg-danger">
						<a class="dropdown-item" href="#">Macbookpro </a> <a
							class="dropdown-item" href="#">Macbookair</a> <a
							class="dropdown-item" href="#">iMac</a>
					</div></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbardrop"
					data-toggle="dropdown"> Accessories </a>
					<div class="dropdown-menu bg-danger">
						<a class="dropdown-item" href="#">Mobile phone</a> <a
							class="dropdown-item" href="#">Head phone</a> <a
							class="dropdown-item" href="#">Laptop/PC</a> <a
							class="dropdown-item" href="#">Other</a>
					</div></li>
				<li class="nav-item"><a class="nav-link"
					href="https://www.facebook.com/KINGKONG2808">Service</a></li>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/contact">Contact</a></li>
				<li class="nav-item"><a class="nav-link"
					href="https://github.com/KINGKONG2808">Subcrible</a></li>
			</ul>
			<form class="form-inline navbar-right" action="#">
				<div class="form-group">
					<a class="btn btn-primary mr-3" href="#"><i
						class="glyphicon glyphicon-shopping-cart"></i></a>
				</div>
			</form>
			<form class="form-inline navbar-form navbar-right" action="#">
				<div class="form-group">
					<input type="text" class="form-control" placeholder="Search">
				</div>
				<button type="submit" class="btn btn-success ml-2 my-2">Search</button>
			</form>
		</div>
	</nav>
</div>