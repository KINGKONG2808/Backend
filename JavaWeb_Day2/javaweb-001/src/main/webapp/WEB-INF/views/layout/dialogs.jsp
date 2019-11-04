<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- tich hop jstl vao jsp -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!-- I N C L U D E R -->
<%@ include file="/WEB-INF/views/layout/includer.jsp"%>

<!-- S I N G U P -->
<div class="modal fade" id="modalRegisterForm" tabindex="-1"
	role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header text-white text-center bg-secondary">
				<h4 class="modal-title w-100 font-weight-bold">Sign up</h4>
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close"
					onClick="document.getElementById('frmRegiterForm').reset();">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<div class="modal-body mx-3">
				<form role="form" method="POST" action="" id="frmRegiterForm"
					name="formRegister">
					<input type="hidden" name="_token" value="" />
					
					<div class="form-group">
						<label class="control-label">Username</label>
						<div>
							<input type="text" id="userName" class="form-control input-lg"
								name="name" />
						</div>
					</div>
					
					<!-- alert email -->
					<div class="alert alert-success" id="divSuccessEmail">
						<Strong>Success !!! </Strong>Email is valid.
					</div>
					<div class="alert alert-danger" id="divErrorEmail">
						<Strong>Faile !!! </Strong>Email is not valid ...
					</div>
					
					<div class="form-group">
						<label class="control-label">E-Mail Address</label>
						<div>
							<input type="email" id="userEmail" class="form-control input-lg"
								name="email" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label">Password</label>
						<div>
							<input type="password" id="userPassword"
								class="form-control input-lg" name="password" />
						</div>
					</div>
					
					<!-- alert password -->
					<div class="alert alert-success" id="divSuccessPassword">
						<Strong>OK! </Strong>Password is correct.
					</div>
					<div class="alert alert-danger" id="divErrorPassword">
						<Strong>Oh no, </Strong>Password is incorrect ...
					</div>
					
					<div class="form-group">
						<label class="control-label">Confirm Password</label>
						<div>
							<input type="password" id="confirmUserPassword"
								class="form-control input-lg" name="password_confirmation" />
						</div>
					</div>
				</form>
			</div>
			<div class="modal-footer d-flex justify-content-center">
				<div class="form-group">
					<div>
						<button type="button" class="btn btn-success"
							onclick="Blog.userRegister(); validate();" id="btnValidate">
							<i class="glyphicon glyphicon-floppy-save"></i> Register
						</button>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

<!-- S I G N I N -->
<div class="modal fade" id="modalSigninForm" tabindex="-1" role="dialog"
	aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header text-white text-center bg-secondary">
				<h4 class="modal-title w-100 font-weight-bold">Sign in</h4>
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close"
					onClick="document.getElementById('frmRegiterForm').reset();">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<div class="modal-body mx-3">
				<form role="form" method="POST" action="" id="frmSigninForm">
					<input type="hidden" name="_token" value="" />
					<div class="form-group">
						<label class="control-label">Username</label>
						<div>
							<input type="text" class="form-control input-lg" name="name"
								value="" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label">Password</label>
						<div>
							<input type="password" class="form-control input-lg"
								name="password" />
						</div>
					</div>
				</form>
			</div>
			<div class="modal-footer d-flex justify-content-center">
				<div class="form-group">
					<div>
						<button type="submit" class="btn btn-success">
							<i class="glyphicon glyphicon-open"></i> Sign in
						</button>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>