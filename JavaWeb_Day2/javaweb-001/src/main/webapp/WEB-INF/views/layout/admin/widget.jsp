<%-- <%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%> --%>

<!-- tích hợp JSTL vào trong JSP -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ include file="/WEB-INF/views/layout/includer.jsp"%>

<div class="card my-5">
	<h5 class="card-header font-weight-bold">Setting Page</h5>
	<div class="card-body">
		<ul class="list-unstyled mb-0">
			<li><b>Contacts</b></li>
			<li><a href="/admin/list-contact"><i class="glyphicon glyphicon-arrow-right"></i> List contact</a></li>
			<li><a href="#"><i class="glyphicon glyphicon-arrow-right"></i> Edit contact</a></li>
			<li><a href="#"><i class="glyphicon glyphicon-arrow-right"></i> Delete contact</a></li>
			<li><b>Products</b></li>
			<li><a href="#"><i class="glyphicon glyphicon-arrow-right"></i> Category</a></li>
			<li><a href="#"><i class="glyphicon glyphicon-arrow-right"></i> Posts</a></li>
			<li><a href="#"><i class="glyphicon glyphicon-arrow-right"></i> Post attachments</a></li>
			<li><a href="/admin/add-post"><i class="glyphicon glyphicon-arrow-right"></i> Add product</a></li>
			<li><a href="#"><i class="glyphicon glyphicon-arrow-right"></i> Edit product</a></li>
			<li><a href="#"><i class="glyphicon glyphicon-arrow-right"></i> Delete product</a></li>
			<li><b>Customers</b></li>
			<li><a href="#"><i class="glyphicon glyphicon-arrow-right"></i> Information</a></li>
			<li><a href="#"><i class="glyphicon glyphicon-arrow-right"></i> Edit information</a></li>
			<li><b>Carts</b></li>
			<li><a href="#"><i class="glyphicon glyphicon-arrow-right"></i> Bill information</a></li>
			<li><a href="#"><i class="glyphicon glyphicon-arrow-right"></i> Bill post</a></li>
		</ul>
	</div>
	<h6 class="card-footer">ADMIN PAGE: KINGKONG</h6>
</div>
