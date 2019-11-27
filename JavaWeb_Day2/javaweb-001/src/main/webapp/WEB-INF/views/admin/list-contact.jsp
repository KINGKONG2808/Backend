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
<meta name="author" content="H&H admin" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Manage Page</title>

<!-- I N C L U D E R -->
<%@ include file="/WEB-INF/views/layout/includer.jsp"%>
</head>

<body>
	<!-- H E A D E R -->
	<%@ include file="/WEB-INF/views/layout/admin/header-admin.jsp"%>

	<!-- B O D Y -->
	<div id="main" class="container">
		<div class="row">
			<div class="col-md-12">
				<div class="card my-5">
					<div
						class="card-header bg-danger text-center text-light font-weight-bold"
						id="contact">Contact List</div>
					<div class="card-body">

						<div class="table-responsive">
							<h3>Search in table</h3>
							<p>Enter something in the input field to search the table for
								full name, email or phone number:</p>
							<input class="form-control my-4" id="myInput" type="text"
								placeholder="Search..">
							<table class="table table-bordered table-striped table-condensed">
								<thead class="thead-dark">
									<tr>
										<th>Full Name</th>
										<th>Email</th>
										<th>Mobile</th>
										<th>Message</th>
										<th>Action</th>
									</tr>
								</thead>
								<tbody id="myTable">

									<c:forEach var="contact" items="${contacts }">
										<tr>
											<td>${contact.fullName }</td>
											<td>${contact.email }</td>
											<td>${contact.phone }</td>
											<td>${contact.content }</td>
											<td style="text-align: center;"><a
												href="/admin/edit-contact/${contact.id }"
												class="btn btn-success btn-sm"> <span
													class="glyphicon glyphicon-edit"></span> Edit
											</a> &nbsp; <a href="javascript:void(0);"
												onclick="Blog.deleteForm('modalDeleteForm', ${contact.id }, '/rest/api/contact/delete')"
												class="btn btn-danger btn-sm"> <span
													class="glyphicon glyphicon-remove"></span> Delete
											</a></td>
										</tr>
									</c:forEach>

								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>

	</div>

	<!-- M O D A L: R E G I S T E R -->
	<%@ include file="/WEB-INF/views/layout/dialogs.jsp"%>

	<!-- F O O T E R -->
	<%@ include file="/WEB-INF/views/layout/admin/footer-admin.jsp"%>
</body>

</html>