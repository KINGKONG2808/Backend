<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- tich hop jstl vao jsp -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div id="header" class="container-fluid bg-dark sticky-top">
	<nav class="navbar navbar-expand-md bg-dark navbar-dark">
		<!-- Brand -->
		<a class="navbar-brand" href="/admin/home">
			<b><span class="text-danger">A D M I N</span> P A G E</b>
		</a>

		<!-- Toggler/collapsibe Button -->
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#collapsibleNavbar">
			<span class="navbar-toggler-icon"></span>
		</button>

		<!-- Navbar links -->
		<div class="collapse navbar-collapse" id="collapsibleNavbar">
			<ul class="navbar-nav mr-auto justify-content-center">
				<li class="nav-item"><a class="nav-link" href="#">Home</a></li>
				<li class="nav-item"><a class="nav-link" href="#contact">Contacts</a></li>
				<li class="nav-item"><a class="nav-link" href="#category">Category</a></li>
				<li class="nav-item"><a class="nav-link" href="#post">Posts</a></li>
				<li class="nav-item"><a class="nav-link" href="#postAttachment">Post Attachment</a></li>
				<li class="nav-item"><a class="nav-link" href="#bill">Bills</a></li>
				<li class="nav-item"><a class="nav-link" href="#billPost">Bill Post</a></li>
			</ul>
			<form class="form-inline navbar-right" action="#">
				<a class="btn-sm btn-danger" href="${pageContext.request.contextPath}/perform_logout"><i
						class="glyphicon glyphicon-chevron-down"></i></a>
			</form>
		</div>
	</nav>
</div>