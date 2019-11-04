<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- tich hop jstl vao jsp -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!-- sử dụng taglibs của spring để bind-data từ end-point trả về. -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8" />
<meta name="description" content="Double H store" />
<meta name="keyword" content="Website technology store" />
<meta name="author" content="H&H" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Contact</title>

<!-- I N C L U D E R -->
<%@ include file="/WEB-INF/views/layout/includer.jsp"%>
</head>

<body>
	<!-- H E A D E R -->
	<%@ include file="/WEB-INF/views/layout/header.jsp"%>

	<!-- B O D Y -->
	<div id="main" class="container">
		<div class="row">
			<div class="col-md-12">

				<!-- thong bao nguoi dung -->
				<h1 class="my-4"></h1>
				<c:choose>
					<c:when test="${status=='success' }">
						<div class="alert alert-success">
							<Strong>Success !!! </Strong>Submit complete ...
						</div>
					</c:when>
					<c:when test="${status=='faile' }">
						<div class="alert alert-danger">
							<Strong>Faile !!! </Strong>Submit fault ...
						</div>
					</c:when>
				</c:choose>

				<div class="card-body">
					<div class="card-header headerSubmit">Submit bind</div>
					<div class="panel-body">
						<form:form modelAttribute="contact" action="/contact-bind-data">
							<h1 class="my-5"></h1>
							<div class="form-group">
								<label for="exampleInputName">Full name<i
									class="text-danger">*</i></label>
								<form:input type="text" path="fullName" class="form-control"
									id="exampleInputName1" placeholder="Enter full name" />
							</div>
							<div class="form-group">
								<label for="exampleInputEmail1">Email address<i
									class="text-danger">*</i></label>
								<form:input type="email" class="form-control" path="email"
									id="exampleInputEmail1" aria-describedby="emailHelp"
									placeholder="Enter email" />
							</div>
							<div class="form-group">
								<label for="exampleInputMobile1">Number Phone<i
									class="text-danger">*</i></label>
								<form:input type="text" class="form-control" path="phone"
									id="exampleInputMobile1" placeholder="Number phone" />
							</div>
							<div class="form-group">
								<div class="form-group">
									<label for="exampleFormControlTextarea1">Content</label>
									<form:textarea type="text" class="form-control" path="content"
										id="exampleFormControlTextarea1" rows="3" />
								</div>
							</div>
							<button type="submit" class="btn btn-primary my-3">Submit</button>
						</form:form>
					</div>
				</div>

				<div class="card-body">
					<div class="card-header headerSubmit">Submit normal</div>
					<div class="panel-body">
						<form action="/contact-normal" method="post">
							<h1 class="my-5"></h1>
							<div class="form-group">
								<label for="exampleInputName">Full name<i
									class="text-danger">*</i></label> <input type="text" name="fullName"
									class="form-control" id="exampleInputName1" placeholder="Name" />
							</div>
							<div class="form-group">
								<label for="exampleInputEmail1">Email address<i
									class="text-danger">*</i></label> <input type="email"
									class="form-control" name="email" id="exampleInputEmail1"
									aria-describedby="emailHelp" placeholder="Enter email" />
							</div>
							<div class="form-group">
								<label for="exampleInputMobile1">Number Phone<i
									class="text-danger">*</i></label> <input type="text"
									class="form-control" name="phone" id="exampleInputMobile1"
									placeholder="Number phone" />
							</div>
							<div class="form-group">
								<div class="form-group">
									<label for="exampleFormControlTextarea1">Content</label>
									<textarea type="text" class="form-control" name="content"
										id="exampleFormControlTextarea1" rows="3"></textarea>
								</div>
							</div>
							<button type="submit" class="btn btn-primary my-3">Submit</button>
						</form>
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