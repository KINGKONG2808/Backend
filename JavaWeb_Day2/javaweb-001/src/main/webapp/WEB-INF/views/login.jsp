<%-- <%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%> --%>

<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Admin Login</title>
<%@ include file="/WEB-INF/views/layout/includer.jsp"%>
</head>
<body class="bg-dark">
	<div class="container">
		<div class="row">
			<div class="col-md-6 mx-auto" style="margin-top: 250px">
				<h1 class="text-danger text-center mx-auto mb-3">A D M I N P A G E</h1>
				<form name='f' action="/perform_login" method='POST'>
					<table class="card">
						<tr>
							<td><label class="label font-weight-bold ml-5 my-4">Username </label></td>
							<td><input type='text' class="form-control mx-5 my-4" name='username' placeholder="Username"></td>
						</tr>
						<tr>
							<td><label class="label font-weight-bold ml-5 my-4">Password </label></td>
							<td><input type='password' class="form-control mx-5 my-4" name='password' placeholder="*********"/></td>
						</tr>
						<tr>
							<td colspan="2"><input class="btn btn-primary btn-block mx-5 my-3" name="submit" type="submit" value="Sign in" /></td>
						</tr>
					</table>
				</form>
			</div>
		</div>
	</div>
</body>
</html>