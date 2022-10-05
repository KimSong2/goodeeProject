<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
  * {
                   box-sizing: border-box;
               }
               body {
                   width: 100vw;
                   height: 100vh;
               }
               .container {
                margin: 0 auto;
                display: flex;
                flex-direction:column;
                align-items: center;
                justify-content: center;
               }
                   table {
                   width: 80%;
                   display: flex;
                   flex-direction: column;
                   border : gray;
               }
               thead {
                   background-color: blue;
                   color: white;
               }
               th,td {
                padding: 10px;
               }
               tr {
                   display: flex;
                   flex-direction: row;
                   width: 100%;
                   text-align: left;
               }
       
               tr:nth-child(even) {
                   background-color: lightgrey;
               }
       
               .th1 {
                   width: 10%;
                   border-right: 1px solid lightgrey;
               }
               .th2{
                  width: 15%;
                  border-right: 1px solid lightgrey;
               }
               .th3{
                   width: 35%;
                   border-right: 1px solid lightgrey;
               }
               .th4{
                   width: 15%;
       border-right: 1px solid lightgrey;
               }
               .th5{
               	width: 25%
               }
</style>
</head>
<body>
<div class="container">
	<div class="button">
		<a href="${pageContext.request.contextPath }/write">글쓰기</a>
	</div>
	<table>
		<thead>
			<tr>
				<th class="th1">id</th>
				<th class="th2">카테고리</th>
				<th class="th3">제목</th>
				<!-- <th class="th3">내용</th> -->
				<th class="th4">글쓴이</th>
				<th class="th5">작성일/작성시간</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="item" items="${list}">
				<tr>
					<td class="th1">${item.id}</td>
					<td class="th2">${item.category}</td>
					<td class="th3"><a href="${pageContext.request.contextPath}/id/${item.id}">${item.title}</a></td>
					<%-- <td class="th3">${item.content }</td> --%>
					<td class="th4">${item.owner}</td>
					<td class="th5">${item.createDate}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	</div>
</body>
</html>