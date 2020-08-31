<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
	<form action="/joinPost" method="post">
	<div><label>아이디: <input type="text" name="cid" placeholder="아이디"></label></div>
	<div><label>비밀번호: <input type="password" name="cpw" placeholder="비밀번호"></label></div>
	<div><label>비밀번호 확인: <input type="password" name="cpwCnfirm" placeholder="비밀번호 확인"></label></div>
	<div><label>이름: <input type="text" name="nm" placeholder="이름"></label></div>
	<div><label>휴대폰: <input type="text" name="ph" placeholder="휴대폰"></label></div>
	<div><label>이메일: <input type="text" name="email" placeholder="이메일"></label>@
		<select>
			<option value="">	선택</option>
			<option value="">	naver.com</option>	
			<option value="">	hanmail.com</option>
			<option value="">	gamail.com</option>
		</select>	
	</div>
	<div><input type="submit" value="회원가입"></div>
	</form>
</body>
</html>