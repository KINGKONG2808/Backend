<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- tich hop jstl vao jsp -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

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
				<form role="form" method="POST" action="" id="frmRegiterForm">
					<input type="hidden" name="_token" value="" />
					<div class="form-group">
						<label class="control-label">Username</label>
						<div>
							<input type="text" class="form-control input-lg" name="name"
								value="" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label">E-Mail Address</label>
						<div>
							<input type="email" class="form-control input-lg" name="email"
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
					<div class="form-group">
						<label class="control-label">Confirm Password</label>
						<div>
							<input type="password" class="form-control input-lg"
								name="password_confirmation" />
						</div>
					</div>
				</form>
			</div>
			<div class="modal-footer d-flex justify-content-center">
				<div class="form-group">
					<div>
						<button type="submit" class="btn btn-success">
							<i class="glyphicon glyphicon-floppy-save"></i> Register
						</button>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>