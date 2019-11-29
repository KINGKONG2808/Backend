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
<title>Details Product</title>

<!-- I N C L U D E R -->
<%@ include file="/WEB-INF/views/layout/includer.jsp"%>
</head>

<body>
	<!-- H E A D E R -->
	<%@ include file="/WEB-INF/views/layout/header.jsp"%>

	<!-- B O D Y -->
	<div id="main" class="container">
		<div class="row">
			<!-- P R O D U C T S -->
			<div class="col-md-12">
				<h1 class="font-weight-bold my-4 text-danger text-center">${product.category.name }</h1>
				<a href="javascript:Blog.addToCart(${product.id});"
					class="btn btn-danger btn-block my-3" style="font-size: 13px"> <i
					class="glyphicon glyphicon-shopping-cart"></i>&nbsp;Add to Cart
				</a>
				<div class="row my-4">
					<h1 class="my-3">${product.title }</h1> <br>
					${product.details }
				</div>
				<a href="javascript:Blog.addToCart(${product.id});"
					class="btn btn-danger btn-block my-3" style="font-size: 13px"> <i
					class="glyphicon glyphicon-shopping-cart"></i>&nbsp;Add to Cart
				</a>
			</div>
		</div>
	</div>

	<!-- M O D A L: R E G I S T E R -->
	<%@ include file="/WEB-INF/views/layout/dialogs.jsp"%>

	<!-- F O O T E R -->
	<%@ include file="/WEB-INF/views/layout/footer.jsp"%>
</body>

</html>