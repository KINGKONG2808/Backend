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
			<div class="col-md-6 mx-auto">
				<h5 class="font-weight-bold mt-3 mb-4">Admin rules:</h5>
				<p>
					Admin team, dear all ... <br>
					- First: Sign in before access in here. <br>
					- Second: Don't public this link to any community. <br>
					- Third: Make sure you are store owner. <br>
					<i class="text-success">Thanks for reading !!! Keep growing</i>&nbsp;&nbsp;<i class="glyphicon glyphicon-thumbs-up"></i>   
				</p>
			</div>

			<div class="col-md-6 mx-auto">
				<h5 class="font-weight-bold mt-3 mb-3">Administrators page:</h5>
				<i class="glyphicon glyphicon-star"></i>&nbsp;&nbsp;Founder: Vu Van Hung <br> 
				<i class="glyphicon glyphicon-hand-right"></i>&nbsp;&nbsp;Designer: King Kong <br> 
				<i class="glyphicon glyphicon-hand-right"></i>&nbsp;&nbsp;Manager: K2 <br>
				<i class="glyphicon glyphicon-hand-right"></i>&nbsp;&nbsp;Admin team: <br>
			</div>
			
			
		</div>
	</div>
	<div class="footer-copyright text-center py-3">
		<c:set var="now" value="<%=new java.util.Date()%>" />
		©
		<fmt:formatDate pattern="yyyy" value="${now}" />
		Powered by: <a href="" target="_blank" class="text-white">Admin Team</a>
	</div>
</div>