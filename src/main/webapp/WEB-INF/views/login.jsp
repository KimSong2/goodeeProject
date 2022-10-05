<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/board" method="get">
		<label><input type="text" name="userid" id="id" /></label> 
		<label><input type="password" name="password" id="pw" /></label>
		<button>민지바보</button>
	</form>
</body>
</html>