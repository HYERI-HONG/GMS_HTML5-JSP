<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!-- 회원가입 페이지 : userId,age(birth 930318-2),name,password -->
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>회원가입</title>
<link rel="stylesheet" href="css/style.css" />
</head>
<body>
	<h2>회원가입</h2>
	<form action="join_result.jsp" id="form-style">
	ID : <br>
	<input type="text" name="userid" />
	<br>
	Password : <br>
	<input type="text" name="password" />
	<br>
	Name : <br>
	<input type="text" name="name" />
	<br>
	SSN : <br>
	<input type="text" name ="ssn" />
	<br><br>
	<input type="submit" value = "등록" />	
	</form>
</body>
</html>
