<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기</title>
</head>
<body>
	<form id="frm" action="/wine/${data != null ? 'update' :'recommend' }" method="post">
		<div><input type="hidden" name="wine_num" value="${data != null? data.wine_num : 0}"></div>
		<div><input type="text" placeholder="wineName" name="wine_name" value="${data.wine_name}"></div>
		<div><textarea name="wineCtnt" placeholder="wineCtnt">${data.wineCtnt}</textarea></div>
		<div><input type="submit" value="${data != null ? '수정' : '등록' }"></div>
	</form>	
	
</body>
</html>