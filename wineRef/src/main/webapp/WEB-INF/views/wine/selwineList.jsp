<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>디테일 </title>

<script src="/resources/js/axios.min.js"></script>
</head>
<body>
	<div>
		<a href="/wine/refList">목록</a>
		<c:if test ="${loginUser ne null}">
			<a href="/wine/delwine?wine_num=${data.wine_num}"><button>삭제</button></a>
			<a href="/wine/update?wine_num=${data.wine_num}"><button>수정</button></a>
		</c:if>
	</div>
		<table>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>내용</th>
			<th>작성일</th>
		</tr>
		<tr>
			<td>${data.wine_num}</td>
			<td>${data.wine_name}</td>
			<td>${data.wineCtnt}</td>
			<td>${data.r_dt}</td>
	</table>
	
	<form action="/wine/wineCmt" method="post">
		<div><input type="hidden" value="i_comment"></div>
		<textarea id="ctnt" name="ctnt"></textarea>
		<div><input type="submit" value="comment"></div>
	</form>
</body>
</html>