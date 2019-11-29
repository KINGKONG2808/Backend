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
	<div id="main" class="container-fluid">
		<div class="row">
			<div class="col-md-2">
				<%@ include file="/WEB-INF/views/layout/admin/widget.jsp"%>
			</div>

			<div class="col-md-10">
			
				<!-- contact -->
				<div class="card my-5" id="contact">
					<div
						class="card-header bg-danger text-center text-light font-weight-bold"
						id="contact">C O N T A C T L I S T</div>
					<div class="card-body">

						<div class="table-responsive">
							<h3>Search in table</h3>
							<p>Enter something in the input field to search the table for
								full name, email or phone number:</p>
							<input class="form-control my-4" id="myInput-contact" type="text"
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
								<tbody id="myTable-contact">

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
				
				<!-- categories -->
				<div class="card my-5" id="category">
					<div
						class="card-header bg-danger text-center text-light font-weight-bold"
						id="contact">C A T E G O R Y L I S T</div>
					<div class="card-body">

						<div class="table-responsive">
							<h3>Search in table</h3>
							<p>Enter something in the input field to search the table for category:</p>
							<input class="form-control my-4" id="myInput-category" type="text"
								placeholder="Search..">
							<table class="table table-bordered table-striped table-condensed">
								<thead class="thead-dark">
									<tr>
										<th>ID</th>
										<th>Name</th>
										<th>Status</th>
									</tr>
								</thead>
								<tbody id="myTable-category">

									<c:forEach var="category" items="${categories }">
										<tr>
											<td>${category.id }</td>
											<td>${category.name }</td>
											<td>${category.status }</td>
										</tr>
									</c:forEach>

								</tbody>
							</table>
						</div>
					</div>
				</div>
				
				<!-- posts -->
				<div class="card my-5" id="post">
					<div
						class="card-header bg-danger text-center text-light font-weight-bold"
						id="contact">P O S T L I S T</div>
					<div class="card-body">

						<div class="table-responsive">
							<h3>Search in table</h3>
							<p>Enter something in the input field to search the table for post:</p>
							<input class="form-control my-4" id="myInput-post" type="text"
								placeholder="Search..">
							<table class="table table-bordered table-striped table-condensed">
								<thead class="thead-dark">
									<tr>
										<th>ID</th>
										<th>Title</th>
										<th>Status</th>
										<th>Create date</th>
										<th>Price</th>
										<th>Action</th>
									</tr>
								</thead>
								<tbody id="myTable-post">

									<c:forEach var="post" items="${posts }">
										<tr>
											<td>${post.id }</td>
											<td>${post.title }</td>
											<td>${post.status }</td>
											<td>${post.price }</td>
											<td>${post.getCreatedDate()}</td>
											<td style="text-align: center;"><a
												href="#"
												class="btn btn-success btn-sm"> <span
													class="glyphicon glyphicon-edit"></span> Edit
											</a> &nbsp; <a href="#"
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
				
				<!-- postAttachments -->
				<div class="card my-5" id="postAttachment">
					<div
						class="card-header bg-danger text-center text-light font-weight-bold"
						id="contact">P O S T A T T A C H M E N T L I S T</div>
					<div class="card-body">

						<div class="table-responsive">
							<h3>Search in table</h3>
							<p>Enter something in the input field to search the table for post attachments:</p>
							<input class="form-control my-4" id="myInput-postAttachment" type="text"
								placeholder="Search..">
							<table class="table table-bordered table-striped table-condensed">
								<thead class="thead-dark">
									<tr>
										<th>ID</th>
										<th>Name</th>
										<th>Path</th>
										<th>Mime</th>
									</tr>
								</thead>
								<tbody id="myTable-postAttachment">

									<c:forEach var="postAttachment" items="${postAttachments }">
										<tr>
											<td>${postAttachment.id }</td>
											<td>${postAttachment.name }</td>
											<td>${postAttachment.path }</td>
											<td>${postAttachment.mime }</td>
										</tr>
									</c:forEach>

								</tbody>
							</table>
						</div>
					</div>
				</div>
				
				<!-- bills -->
				<div class="card my-5" id="bill">
					<div
						class="card-header bg-danger text-center text-light font-weight-bold"
						id="contact">B I L L S L I S T</div>
					<div class="card-body">

						<div class="table-responsive">
							<h3>Search in table</h3>
							<p>Enter something in the input field to search the table for bill list:</p>
							<input class="form-control my-4" id="myInput-bill" type="text"
								placeholder="Search..">
							<table class="table table-bordered table-striped table-condensed">
								<thead class="thead-dark">
									<tr>
										<th>ID</th>
										<th>Name</th>
									</tr>
								</thead>
								<tbody id="myTable-bill">

									<c:forEach var="bill" items="${bills }">
										<tr>
											<td>${bill.id }</td>
											<td>${bill.name }</td>
										</tr>
									</c:forEach>

								</tbody>
							</table>
						</div>
					</div>
				</div>
				
				<!-- billPosts -->
				<div class="card my-5" id="billPost">
					<div
						class="card-header bg-danger text-center text-light font-weight-bold"
						id="contact">B I L L P O S T L I S T</div>
					<div class="card-body">

						<div class="table-responsive">
							<h3>Search in table</h3>
							<p>Enter something in the input field to search the table for bill post:</p>
							<input class="form-control my-4" id="myInput-billPost" type="text"
								placeholder="Search..">
							<table class="table table-bordered table-striped table-condensed">
								<thead class="thead-dark">
									<tr>
										<th>ID</th>
										<th>Product ID</th>
										<th>Bill ID</th>
										<th>Price</th>
										<th>Quality</th>
										<th>Total</th>
									</tr>
								</thead>
								<tbody id="myTable-billPost">

									<c:forEach var="billPost" items="${billPosts }">
										<tr>
											<td>${billPost.id }</td>
											<td>${billPost.productId }</td>
											<td>${billPost.bill }</td>
											<td>${billPost.price }</td>
											<td>${billPost.quality }</td>
											<td>${billPost.total }</td>
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