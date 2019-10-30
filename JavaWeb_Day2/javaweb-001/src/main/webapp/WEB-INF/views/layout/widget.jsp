<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- tich hop jstl vao jsp -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<h1 class="my-5"></h1>
<div class="card my-4">
	<h5 class="card-header font-weight-bold bg-dark text-white">Search</h5>
	<div class="card-body">
		<div class="input-group">
			<input type="text" class="form-control" placeholder="Search for...">
			<span class="input-group-btn">
				<button class="btn btn-success ml-3" type="button">Go!</button>
			</span>
		</div>
	</div>
</div>

<div class="card my-4">
	<h5 class="card-header font-weight-bold bg-dark text-white">Sign
		in</h5>
	<div class="card-body mb-4">
		<form action="">
			<div class="form-group">
				<label class="control-label">Username:</label>
				<div>
					<input type="text" class="form-control input-lg" name="name"
						value="" />
				</div>
			</div>
			<div class="form-group">
				<label class="control-label">Password:</label>
				<div>
					<input type="password" class="form-control input-lg"
						name="password" />
				</div>
			</div>
		</form>
	</div>
	<div class="card-footer d-flex justify-content-center">
		<div class="form-group">
			<div>
				<button type="submit" class="btn btn-success">Sign in</button>
			</div>
		</div>
	</div>
	<a href="" class="font-italic text-center">Forget password?</a>
</div>
<a href="#" class="font-italic" data-toggle="modal"
	data-target="#modalRegisterForm">Click here to sign up.</a>