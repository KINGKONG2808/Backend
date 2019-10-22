<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8" />
<meta name="description" content="Welcome to Double H store" />
<meta name="keyword" content="Website technology store" />
<meta name="author" content="H&H" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>H&H technology store</title>

<!-- include bootstrap css -->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/bootstrap-4.0.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/glyphicons/css/bootstrap-glyphicons.min.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/glyphicons/maps/glyphicons-fontawesome.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/index.css">

<!-- include bootstrap js -->
<script src="${pageContext.request.contextPath}/js/jquery-3.4.1.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap-4.0.js"></script>
<script src="${pageContext.request.contextPath}/js/index.js"></script>
</head>

<body>
	<!--THIS IS HEADER-->
	<div id="header" class="container-fluid bg-dark sticky-top">
		<nav class="navbar navbar-expand-md bg-dark navbar-dark">
			<!-- Brand -->
			<a class="navbar-brand" href="#"> <img id="logo"
				src="${pageContext.request.contextPath}/img/logo.jpg" alt="Logo">
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
						data-toggle="dropdown"> Desktop </a>
						<div class="dropdown-menu bg-danger">
							<a class="dropdown-item" href="#">Macbook</a> <a
								class="dropdown-item" href="#">Windowns</a> <a
								class="dropdown-item" href="#">Other</a>
						</div></li>
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" id="navbardrop"
						data-toggle="dropdown"> Laptop </a>
						<div class="dropdown-menu bg-danger">
							<a class="dropdown-item" href="#">Macbook</a> <a
								class="dropdown-item" href="#">Windowns</a> <a
								class="dropdown-item" href="#">Other</a>
						</div></li>
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" id="navbardrop"
						data-toggle="dropdown"> Phone </a>
						<div class="dropdown-menu bg-danger">
							<a class="dropdown-item" href="#">Apple</a> <a
								class="dropdown-item" href="#">Android</a> <a
								class="dropdown-item" href="#">Blackberry</a> <a
								class="dropdown-item" href="#">Other</a>
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
					<li class="nav-item"><a class="nav-link" href="#">Service</a>
					</li>
				</ul>
				<form class="form-inline my-2 my-lg-0">
					<button class="btn btn-success my-2 my-sm-0" type="button">
						<a id="submit" href="https://github.com/KINGKONG2808">Subcrible</a>
					</button>
				</form>
			</div>
		</nav>
	</div>

	<!--THIS IS BODY-->
	<div id="main" class="container">
		<div class="row">
			<div class="col-md-9 my-4 mb-4">
				<h2 class="font-weight-bold mb-4">Macbook</h2>
				<div class="card mb-4">
					<img src="/img/macpro2019.jpg" alt="macpro2019"
						class="card-img-top my-4 mb-4"> <a href="#"
						class="card-body text-center">Macbookpro 2019</a>
				</div>

				<div class="card mb-4">
					<img src="/img/macpro2018.jpg" alt="macpro2018"
						class="card-img-top my-4 mb-4"> <a href="#"
						class="card-body text-center">Macbookpro 2018</a>
				</div>

				<div class="card mb-4">
					<img src="/img/macpro2017.jpg" alt="macpro2017"
						class="card-img-top my-4 mb-4"> <a href="#"
						class="card-body text-center">Macbookpro 2017</a>
				</div>
				<a href="#" class="btn btn-primary"><i
					class="glyphicon glyphicon-hand-right"></i> See More →</a>
			</div>

			<div class="col-md-3 my-4 mb-4">
				<h1 class="my-5"></h1>
				<div class="card mb-4">
					<h5 class="card-header font-weight-bold bg-dark text-white">Search</h5>
					<div class="card-body">
						<div class="input-group">
							<input type="text" class="form-control"
								placeholder="Search for..."> <span
								class="input-group-btn">
								<button class="btn btn-success ml-3" type="button">Go!</button>
							</span>
						</div>
					</div>
				</div>

				<div class="card my-4">
					<h5 class="card-header font-weight-bold bg-dark text-white">Sign
						in</h5>
					<div class="card-body mb-4">
						<form action="">
							<div class="form-group">
								<label class="control-label">Username:</label>
								<div>
									<input type="text" class="form-control input-lg" name="name"
										value="" />
								</div>
							</div>
							<div class="form-group">
								<label class="control-label">Password:</label>
								<div>
									<input type="password" class="form-control input-lg"
										name="password" />
								</div>
							</div>
						</form>
					</div>
					<div class="card-footer d-flex justify-content-center">
						<div class="form-group">
							<div>
								<button type="submit" class="btn btn-success">Sign in</button>
							</div>
						</div>
					</div>
					<a href="" class="font-italic text-center">Forget password?</a>
				</div>
				<a href="#" class="font-italic" data-toggle="modal"
					data-target="#modalRegisterForm">Click here to sign up.</a>
			</div>
		</div>
	</div>

	<!-- M O D A L: REGISTER -->
	<div class="modal fade" id="modalRegisterForm" tabindex="-1"
		role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header text-white text-center bg-secondary">
					<h4 class="modal-title w-100 font-weight-bold">Sign up</h4>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close"
						onClick="document.getElementById('frmRegiterForm').reset();">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body mx-3">
					<form role="form" method="POST" action="" id="frmRegiterForm">
						<input type="hidden" name="_token" value="" />
						<div class="form-group">
							<label class="control-label">Username</label>
							<div>
								<input type="text" class="form-control input-lg" name="name"
									value="" />
							</div>
						</div>
						<div class="form-group">
							<label class="control-label">E-Mail Address</label>
							<div>
								<input type="email" class="form-control input-lg" name="email"
									value="" />
							</div>
						</div>
						<div class="form-group">
							<label class="control-label">Password</label>
							<div>
								<input type="password" class="form-control input-lg"
									name="password" />
							</div>
						</div>
						<div class="form-group">
							<label class="control-label">Confirm Password</label>
							<div>
								<input type="password" class="form-control input-lg"
									name="password_confirmation" />
							</div>
						</div>
					</form>
				</div>
				<div class="modal-footer d-flex justify-content-center">
					<div class="form-group">
						<div>
							<button type="submit" class="btn btn-success">
								<i class="glyphicon glyphicon-floppy-save"></i> Register
							</button>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!--THIS IS FOOTER-->
	<div id="footer" class="container-fluid bg-dark text-white">
		<div class="container text-center text-md-left">
			<div class="row">
				<div class="col-md-4 mx-auto">
					<h5 class="font-weight-bold mt-3 mb-4">Our slogan:</h5>
					<p>
						Right here, you can looking for any product about technology. <br>
						This is real choose for you because we sell everything super
						cheap. <br> You're welcome !!!
					</p>
				</div>

				<div class="col-md-2 mx-auto">
					<h5 class="font-weight-bold mt-3 mb-3">Macbook New</h5>
					<a href="#" class="font-italic">Macbookpro2019</a> <br> <a
						href="#" class="font-italic">Macbookpro2018</a> <br> <a
						href="#" class="font-italic">Macbookpro2017</a> <br> <a
						href="#" class="font-italic">Macbookpro2015</a> <br> <a
						href="#" class="font-italic">Macbookair2019</a> <br> <a
						href="#" class="font-italic">Macbookair2018</a> <br> <a
						href="#" class="font-italic">Macbookair2015</a> <br>
				</div>

				<div class="col-md-2 mx-auto">
					<h5 class="font-weight-bold mt-3 mb-3">Windows Brand</h5>
					<a href="#">ASUS</a> <br> <a href="#">DELL</a> <br> <a
						href="#">ACER</a> <br>
				</div>

				<div class="col-md-2 mx-auto">
					<h5 class="font-weight-bold mt-3 mb-3">Mobile Phone</h5>
					<a href="#">Android</a> <br> <a href="#">Iphone</a> <br>
					<a href="#">Other</a> <br>
				</div>
			</div>
		</div>
		<div class="footer-copyright text-center py-3">© 2019 Developed
			by: H&H</div>
	</div>
</body>

</html>