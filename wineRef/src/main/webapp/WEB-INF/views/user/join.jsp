<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<script src="/resources/js/join.js"></script>
<script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
</head>
<body>
	<div>${msg}</div>
	<div>
		<form id="frm" action="/user/joinPost" method="post" onsubmit="return chk()">
			<h3>회원가입</h3>
			<div>
				<input type="hidden" id="checkId" value="2">
			</div>
			<span><label>아이디: 
					<input type="text" name="cid" placeholder="아이디" onchange="defaultCheckIdValue()">
					</label>
			</span> 
			
			<span>
				<button type="button"  onclick="return chkId()">ID중복확인</button>
			</span>
			
			<div id="duplicationIdMsg"></div>
			
			<div>
				<label>비밀번호: 
					<input type="password" name="cpw" placeholder="비밀번호"></label>
			</div>
			
			<div>
				<label>비밀번호 확인: 
					<input type="password" name="cpwConfirm" placeholder="비밀번호 확인"></label>
			</div>
			
			<div>
				<label>이름:<input type="text" name="nm" placeholder="이름"></label>
			</div>
			
			<div>
				<label>이메일: <input type="text" name="email" placeholder="이메일"></label>
			</div>
			
			<div>
				<input type="submit" value="join" onclick ="return chk()">
			</div>
			
		</form>
	</div>

	
</body>
</html>