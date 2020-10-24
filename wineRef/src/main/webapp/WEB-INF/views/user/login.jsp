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
	<section>	
		<div>${msg}</div>
		<div id ="login">
			<h3>로그인</h3>
		</div>
		
	<form id="frm" action="/user/loginPost" method="post">
		<div><input type="text" name="cid" placeholder="ID"></div>
		<div><input type="password" name="cpw" placeholder="PW"></div>
		<div><input type="submit" value="로그인"></div>
		<span><a href="/user/kakaoLogin"><img src="/resources/img/kakao.png"></a></span>
	    <a href="/user/join">회원가입</a>
    </form>
    </section>
    
</body>
</html>