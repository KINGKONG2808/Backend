<%-- <%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%> --%>
<!-- sử dụng taglibs của spring để bind-data từ end-point trả về. -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!-- tích hợp JSTL vào trong JSP -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<head>
<meta charset="UTF-8" />
<meta name="description" content="Double H store" />
<meta name="keyword" content="Website technology store" />
<meta name="author" content="H&H admin" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Edit Contact</title>

<!-- I N C L U D E R -->
<%@ include file="/WEB-INF/views/layout/includer.jsp"%>
</head>

<body>
	<!--  H E A D E R -->
	<%@ include file="/WEB-INF/views/layout/admin/header-admin.jsp"%>

	<!--  M A I N -->
	<div id="main" class="container">
		<h1 class="mt-2"></h1>

		<div class="row">
			<div class="col-md-12" style="padding: 5px;">

				<div class="card my-5">
					<div class="card-header bg-danger text-center text-light font-weight-bold">Contact Edit</div>
					<div class="card-body">
						<div class="panel-body">
							<!-- đây là cách dùng bind-data của spring. -->
							<form:form modelAttribute="contact" action="/admin/edit-contact">
								<form:hidden path="id" />
								<div class="form-group">
									<label class="required">Full name</label>
									<form:input path="fullName" class="form-control"
										placeholder="Enter full name" />
								</div>
								<div class="form-group">
									<label for="exampleInputEmail1" class="required">Email</label>
									<form:input path="email" type="email" class="form-control"
										id="exampleInputEmail1" aria-describedby="emailHelp"
										placeholder="Enter email" />
									<small id="emailHelp" class="form-text text-muted">We'll
										never share your email with anyone else.</small>
								</div>
								<div class="form-group">
									<label class="required">Mobile</label>
									<form:input path="phone" class="form-control"
										placeholder="Enter mobile" />
								</div>
								<div class="form-group">
									<label>Content</label>
									<form:textarea path="content" class="form-control" rows="3" />
								</div>
								<a href="/admin/list-contact" class="btn btn-success"><i
									class="glyphicon glyphicon-hand-left"></i>&nbsp;Go Back</a>
								<button type="submit" class="btn btn-primary">
									<i class="glyphicon glyphicon-floppy-save"></i>&nbsp;Update
								</button>
							</form:form>
						</div>
					</div>
				</div>


			</div>

		</div>
	</div>

	<!--  F O O T E R -->
	<%@ include file="/WEB-INF/views/layout/admin/footer-admin.jsp"%>
</body>
</html>