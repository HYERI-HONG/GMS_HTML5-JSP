<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>비밀번호 변경</title>
<link rel="stylesheet" href="css/style.css" />
</head>
<body>
	<h3>비밀번호 변경</h3>
	<form action="update_result.jsp" id="form-style">
	아이디 : <br>
	<input type="text" name="userid"/>
	 <br>
	기존 비밀번호 : <br>
	<input type="text" name="before_pass"/>
	 <br>
	변경할 비밀번호 : <br>
	<input type="text" name="after_pass" />
	<br><br>
	<input type="submit" value ="변경" />
	</form>
</body>
</html>




