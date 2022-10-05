<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<p>제목 : ${list.title}</p>
		<hr />
		<div class="content">
			<p>${list.content }</p>
		</div>
		<a href="${pageContext.request.contextPath }/board">뒤로가기</a>
	</div>
</body>
</html>