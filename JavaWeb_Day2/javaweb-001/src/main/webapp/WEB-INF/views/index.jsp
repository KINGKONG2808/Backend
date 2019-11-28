<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- tich hop jstl vao jsp -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8" />
<meta name="description" content="Double H store" />
<meta name="keyword" content="Website technology store" />
<meta name="author" content="H&H" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>H&H technology store</title>

<!-- I N C L U D E R -->
<%@ include file="/WEB-INF/views/layout/includer.jsp"%>
</head>

<body>
	<!-- H E A D E R -->
	<%@ include file="/WEB-INF/views/layout/header.jsp"%>

	<!-- C A R O U S E L S L I D E B A R -->
	<div id="demo" class="carousel slide" data-ride="carousel">

		<!-- Indicators -->
		<ul class="carousel-indicators">
			<li data-target="#demo" data-slide-to="0" class="active"></li>
			<li data-target="#demo" data-slide-to="1"></li>
			<li data-target="#demo" data-slide-to="2"></li>
			<li data-target="#demo" data-slide-to="3"></li>
			<li data-target="#demo" data-slide-to="4"></li>
			<li data-target="#demo" data-slide-to="5"></li>
			<li data-target="#demo" data-slide-to="6"></li>
			<li data-target="#demo" data-slide-to="7"></li>
			<li data-target="#demo" data-slide-to="8"></li>
			<li data-target="#demo" data-slide-to="9"></li>
		</ul>

		<!-- The slideshow -->
		<div class="carousel-inner">
			<div class="carousel-item active">
				<img src="/img/slide1.jpg" alt="img1">
			</div>
			<div class="carousel-item">
				<img src="/img/slide2.jpg" alt="img2">
			</div>
			<div class="carousel-item">
				<img src="/img/slide3.jpg" alt="img3">
			</div>
			<div class="carousel-item">
				<img src="/img/slide4.jpg" alt="img4">
			</div>
			<div class="carousel-item">
				<img src="/img/slide5.jpg" alt="img5">
			</div>
			<div class="carousel-item">
				<img src="/img/slide6.jpg" alt="img6">
			</div>
			<div class="carousel-item">
				<img src="/img/slide7.jpg" alt="img7">
			</div>
			<div class="carousel-item">
				<img src="/img/slide8.jpg" alt="img8">
			</div>
			<div class="carousel-item">
				<img src="/img/slide9.jpg" alt="img9">
			</div>
			<div class="carousel-item">
				<img src="/img/slide10.jpg" alt="img10">
			</div>
		</div>

		<!-- Left and right controls -->
		<a class="carousel-control-prev" href="#demo" data-slide="prev"> <span
			class="carousel-control-prev-icon"></span>
		</a> <a class="carousel-control-next" href="#demo" data-slide="next">
			<span class="carousel-control-next-icon"></span>
		</a>
	</div>

	<!-- B O D Y -->
	<div id="main" class="container">
		<div class="row">
			<div class="col-md-12">

				<!-- macbook pro -->
				<h1 class="font-weight-bold my-4 text-danger text-center">Macbook
					Pro</h1>
				<div class="row">
					<div class="col-md-12">
						<div class="row">
							<c:forEach var="product" items="${_products}">
								<c:choose>
									<c:when test="${product.category.id == 1 || product.category.id == 2 || product.category.id == 3 || product.category.id == 4 || product.category.id == 5 || product.category.id == 6 || product.category.id == 7 || product.category.id == 8}">
										<div class="col-md-3 my-4">
											<div class="card my-4">
												<a
													href="${pageContext.request.contextPath}/details/${product.id}"
													style="display: block"> <img class="card-img-top"
													src="${pageContext.request.contextPath}/files/${product.postAttachments.get(0).name }"
													alt="Card image cap">
												</a>
												<div class="card-body">
													<a class="card-title text-dark"
														href="${pageContext.request.contextPath}/details/${product.id}"
														style="font-size: 13px; display: block; text-decoration: none">
														<c:out value="${product.title }"></c:out> <br>
													</a>
													<hr>
													<h5 class="text-center">
														<i>$ </i>
														<c:out value="${product.price }"></c:out>
													</h5>
													<a href="javascript:Blog.addToCart(${product.id});"
														class="btn btn-danger btn-block" style="font-size: 13px">
														<i class="glyphicon glyphicon-shopping-cart"></i>&nbsp;Add
														to Cart
													</a>
												</div>
												<div class="card-footer text-muted" style="font-size: 10px">
													${product.category.name}, posted on ${product.getCreatedDate()}
													<%-- ${product.createdDate.getDay()}/${product.createdDate.getMonth()+1}/${product.createdDate.getYear()+1900} --%>
												</div>
											</div>
										</div>
									</c:when>
								</c:choose>
							</c:forEach>
						</div>
					</div>
				</div>
				
				<!-- macbook air -->
				<h1 class="font-weight-bold my-4 text-danger text-center">Macbook
					Air</h1>
				<div class="row">
					<div class="col-md-12">
						<div class="row">
							<c:forEach var="product" items="${_products}">
								<c:choose>
									<c:when test="${product.category.id == 9 || product.category.id == 10 || product.category.id == 11 || product.category.id == 12 || product.category.id == 13 || product.category.id == 14 || product.category.id == 15 || product.category.id == 16}">
										<div class="col-md-3 my-4">
											<div class="card my-4">
												<a
													href="${pageContext.request.contextPath}/details/${product.id}"
													style="display: block"> <img class="card-img-top"
													src="${pageContext.request.contextPath}/files/${product.postAttachments.get(0).name }"
													alt="Card image cap">
												</a>
												<div class="card-body">
													<a class="card-title text-dark"
														href="${pageContext.request.contextPath}/details/${product.id}"
														style="font-size: 13px; display: block; text-decoration: none">
														<c:out value="${product.title }"></c:out> <br>
													</a>
													<hr>
													<h5 class="text-center">
														<i>$ </i>
														<c:out value="${product.price }"></c:out>
													</h5>
													<a href="javascript:Blog.addToCart(${product.id});"
														class="btn btn-danger btn-block" style="font-size: 13px">
														<i class="glyphicon glyphicon-shopping-cart"></i>&nbsp;Add
														to Cart
													</a>
												</div>
												<div class="card-footer text-muted" style="font-size: 10px">
													${product.category.name}, posted on ${product.getCreatedDate()}
													<%-- ${product.createdDate.getDay()}/${product.createdDate.getMonth()+1}/${product.createdDate.getYear()+1900} --%>
												</div>
											</div>
										</div>
									</c:when>
								</c:choose>
							</c:forEach>
						</div>
					</div>
				</div>
			
				<!-- imac -->
				<h1 class="font-weight-bold my-4 text-danger text-center">iMac</h1>
				<div class="row">
					<div class="col-md-12">
						<div class="row">
							<c:forEach var="product" items="${_products}">
								<c:choose>
									<c:when test="${product.category.id == 17 || product.category.id == 18 || product.category.id == 19 || product.category.id == 20 || product.category.id == 21 || product.category.id == 22}">
										<div class="col-md-3 my-4">
											<div class="card my-4">
												<a
													href="${pageContext.request.contextPath}/details/${product.id}"
													style="display: block"> <img class="card-img-top"
													src="${pageContext.request.contextPath}/files/${product.postAttachments.get(0).name }"
													alt="Card image cap">
												</a>
												<div class="card-body">
													<a class="card-title text-dark"
														href="${pageContext.request.contextPath}/details/${product.id}"
														style="font-size: 13px; display: block; text-decoration: none">
														<c:out value="${product.title }"></c:out> <br>
													</a>
													<hr>
													<h5 class="text-center">
														<i>$ </i>
														<c:out value="${product.price }"></c:out>
													</h5>
													<a href="javascript:Blog.addToCart(${product.id});"
														class="btn btn-danger btn-block" style="font-size: 13px">
														<i class="glyphicon glyphicon-shopping-cart"></i>&nbsp;Add
														to Cart
													</a>
												</div>
												<div class="card-footer text-muted" style="font-size: 10px">
													${product.category.name}, posted on ${product.getCreatedDate()}
													<%-- ${product.createdDate.getDay()}/${product.createdDate.getMonth()+1}/${product.createdDate.getYear()+1900} --%>
												</div>
											</div>
										</div>
									</c:when>
								</c:choose>
							</c:forEach>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- M O D A L: R E G I S T E R -->
	<%@ include file="/WEB-INF/views/layout/dialogs.jsp"%>

	<!-- F O O T E R -->
	<%@ include file="/WEB-INF/views/layout/footer.jsp"%>
</body>

</html>