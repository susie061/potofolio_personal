<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인페이지</title>
</head>
<body>
	
	<div>와인의 모든 것</div>
	<a href="/main">검색<img src="/resources/img/search.png" class="searchBox"></a>
	<c:if test="${loginUser.i_user eq null}">
		
	</c:if>
</body>
</html>