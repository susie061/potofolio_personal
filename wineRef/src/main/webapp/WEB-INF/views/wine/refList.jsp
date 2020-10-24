<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>리스트</title>
<script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
<script src="/resources/js/axios.min.js"></script>
</head>
<body>
	<div><h2>와인의 모든것</h2></div>
	<div> ${loginUser.nm}님 환영합니다
		<a href="/user/logout">로그아웃</a>
	<c:if test="${loginUser ne null }">
		<a href="/wine/recommend">글쓰기</a>
	</c:if>
	</div>
	<table>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성일</th>
		</tr>
		<c:forEach items="${data}" var="item">
			<tr id="wineItem" onclick ="moveToDetail(${item.wine_num})">
				<td>${item.wine_num}</td>
				<td>${item.wine_name}</td>
				<td>${item.r_dt}</td>
			</tr>
		</c:forEach>
	</table>
	<script>
		function moveToDetail(wine_num) {
			location.href = '/wine/wineList?wine_num=' + wine_num
		}
	</script>
</body>
</html>