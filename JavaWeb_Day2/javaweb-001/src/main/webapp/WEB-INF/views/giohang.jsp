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
<title>Bill</title>

<!-- I N C L U D E R -->
<%@ include file="/WEB-INF/views/layout/includer.jsp"%>
</head>

<body>
	<!-- H E A D E R -->
	<%@ include file="/WEB-INF/views/layout/header.jsp"%>

	<!-- B O D Y -->
	<div id="main" class="container">
		<div class="row">
			<h1 class="mt-2"></h1>
			<table
				class="table table-bordered table-striped table-condensed my-4">
				<thead class="thead-light">
					<tr>
						<th>ID</th>
						<th>Product Name</th>
						<th>Price</th>
						<th>Quality</th>
						<th>Total Product</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="items" items="${giohang }">
						<tr>
							<td>${items.productId }</td>
							<td>${items.productName }</td>
							<td>${items.price }</td>
							<td>${items.quality }</td>
							<td>${items.getTotalMoney()}</td>
						</tr>
					</c:forEach>
					<tr>
						<td colspan="4" class="text-center"><b>Total Money</b></td>
						<td><i>$ </i><b>${total}</b></td>
					</tr>
				</tbody>
			</table>
			<a href="#" class="btn btn-danger btn-block my-4" data-toggle="modal" data-target="#modalSigninForm">
					<i class="glyphicon glyphicon-shopping-cart"></i>&nbsp;&nbsp;P A Y M E N T B I L L
				</a>
		</div>
	</div>

	<!-- M O D A L: R E G I S T E R -->
	<%@ include file="/WEB-INF/views/layout/dialogs.jsp"%>

	<!-- F O O T E R -->
	<%@ include file="/WEB-INF/views/layout/footer.jsp"%>
</body>

</html>