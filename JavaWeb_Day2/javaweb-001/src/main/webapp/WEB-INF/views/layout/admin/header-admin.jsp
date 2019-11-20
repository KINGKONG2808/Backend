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
				<li class="nav-item"><a class="nav-link" href="#contact">Home</a></li>
				<li class="nav-item"><a class="nav-link" href="#contact">Contacts</a></li>
				<li class="nav-item"><a class="nav-link" href="#product">Products</a></li>
				<li class="nav-item"><a class="nav-link" href="#customer">Customers</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Carts</a></li>
			</ul>
		</div>
	</nav>
</div>