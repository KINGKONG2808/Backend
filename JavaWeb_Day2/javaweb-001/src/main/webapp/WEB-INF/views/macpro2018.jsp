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
<title>Macbook Pro 2018</title>

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
				<h1 class="font-weight-bold my-4 text-danger text-center">Macbook
					Pro 2018</h1>
				<div class="row">
					<c:forEach var="macPro" items="${_macbookPro}">
						<c:choose>
							<c:when test="${macPro.year==2018}">
								<div class="col-md-6 my-2 mb-4">
									<div class="card mb-4">
										<img src="${macPro.image}" alt=""
											class="card-img-top my-4 mb-4"> <a href="#"
											class="card-body text-center">${macPro.name}</a><a
											class="card-footer text-center"><b>$ </b>${macPro.price}</a>
									</div>
								</div>
							</c:when>
						</c:choose>
					</c:forEach>
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