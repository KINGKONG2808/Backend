<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- tich hop jstl vao jsp -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!-- I N C L U D E R -->
<%@ include file="/WEB-INF/views/layout/includer.jsp"%>

<div id="footer" class="container-fluid bg-dark text-white">
	<div class="container text-center text-md-left">
		<div class="row">
			<div class="col-md-5 mx-auto">
				<h5 class="font-weight-bold mt-3 mb-4">Double H store slogan:</h5>
				<p>
					Right here, you can looking for any product about technology. <br>
					This is real choose for you because we sell everything super cheap.
					<br> You're welcome !!!
				</p>
			</div>

			<div class="col-md-5 mx-auto">
				<h5 class="font-weight-bold mt-3 mb-3">Contact us:</h5>
				<i class="glyphicon glyphicon-thumbs-up"></i>&nbsp;&nbsp;Double H
				store <br> <i class="glyphicon glyphicon-earphone"></i>&nbsp;&nbsp;Hotline:
				0366310685 <br> <i class="glyphicon glyphicon-envelope"></i>&nbsp;&nbsp;Email:
				vuhung2881999@gmail.com <br> <i
					class="glyphicon glyphicon-calendar"></i>&nbsp;&nbsp;Time: 8A.M -
				8P.M (All day) <br> <i class="glyphicon glyphicon-user"></i>&nbsp;&nbsp;Address:
				Number 15, Alley 86/30, Dinh Quan street, Bac Tu Liem district.
			</div>
			
			<div class="col-md-2 mx-auto">
				<h5 class="font-weight-bold mt-3 mb-3">Register / Login</h5>
				<div class="row">
				<a href="#" class="btn btn-primary btn-block my-4" data-toggle="modal" data-target="#modalSigninForm">
					<i class="glyphicon glyphicon-open"></i>&nbsp;&nbsp;Sign in
				</a>
				</div>
				<div class="row">
				<a href="#" class="btn btn-primary btn-block my-2" data-toggle="modal" data-target="#modalRegisterForm">
					<i class="glyphicon glyphicon-floppy-save"></i>&nbsp;&nbsp;Sign up
				</a>
				</div>
			</div>
		</div>
	</div>
	<div class="footer-copyright text-center py-3">
		<c:set var="now" value="<%=new java.util.Date()%>" />
		©
		<fmt:formatDate pattern="yyyy" value="${now}" />
		Developed by: H&H
	</div>
</div>