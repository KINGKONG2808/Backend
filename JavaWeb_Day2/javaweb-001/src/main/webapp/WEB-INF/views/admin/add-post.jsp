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
<title>Add Product</title>

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

					<div class="card">
						<div class="card-header">Add Product</div>
						<div class="card-body">
							<div class="panel-body">
								<!-- đây là cách dùng bind-data của spring. -->
								<form:form modelAttribute="post" action="/admin/add-post" enctype="multipart/form-data">
									<form:hidden path="id"/>
									<div class="form-group">
										<label for="txtInput" class="required">Type Product (Category)</label>
										<form:select class="form-control" path="category.id">
											<form:options items="${categories}" itemValue="id" itemLabel="name"/>
										</form:select>
									</div>
									<div class="form-group">
										<label class="required">Name Product (Title)</label> 
										<form:input path="title" class="form-control" /> 
									</div>
									<div class="form-group">
										<label class="required">Product Status</label> 
										<form:input path="status" class="form-control" /> 
									</div>
									<div class="form-group">
										<label class="required">Price</label> 
										<form:input path="price" class="form-control" /> 
									</div>
									<div class="form-group">
										<label class="required">Description Product</label> 
										<form:textarea path="description" class="form-control" rows="5"/> 
									</div>
									<div class="form-group">
										<label class="required">Details</label> 
										<form:textarea path="details" class="form-control" rows="5" cssClass="my-summernote" id="my-summernote"></form:textarea> 
									</div>
									<div class="form-group">
										<label>Attachment</label>
										<input type="file" name="postImage"/>
									</div>
									<button type="submit" class="btn btn-primary"><i class="glyphicon glyphicon-floppy-save"></i>&nbsp;Save</button>
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