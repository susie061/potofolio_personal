<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인페이지</title>
</head>
<body>
	
	<div>와인의 모든 것</div>
	<a href="/wine/main">검색<span><img src="/resources/img/search.png" class="searchBox"></span></a>
	<div><span><input type="text"></span></div>
		<c:if test="${loginUser.i_user eq null}">
			<a href="/user/login">Log In</a>
		</c:if>
		<c:if test="${loginUser.i_user ne null}">
			<a href="/user/logout">Log Out</a>
		</c:if>
		<c:if test="${loginUser.i_user ne null}">
			<a href="/wine/recommend">글쓰기</a>
		</c:if>
		<c:if test="${loginUser.i_user ne null}">
			<a href="/wine/refList">리스트로가기</a>
		</c:if>
</body>
</html>