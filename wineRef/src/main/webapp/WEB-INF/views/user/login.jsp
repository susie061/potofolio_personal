<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
	<div>${msg}</div>
	<form action="/user/loginPost" method="post">
	<div><input type="text" name="cid" placeholder="ID"></div>
	<div><input type="password" name="cpw" placeholder="PW"></div>
	<div><input type="submit" value="로그인"></div>
	<a href="/user/kakaoLogin">카카오로그인</a>
    <a href="/user/join">회원가입</a>
    </form>
</body>
</html>