<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
</head>
<body>
	<div>${msg}</div>
	<div>
		<input type="hidden" id="chkId" value="2">
		<form id="frm" action="/user/joinPost" method="post" onsubmit="return chk()">
			<div>
				<input type="hidden" id="checkId" value="2">
			</div>
			<span><label>아이디: <input type="text" name="cid"
					placeholder="아이디" onchange="defaultCheckIdValue()"></label></span> 
					<span><button type="button"  onclick="return chkId()">ID중복확인</button></span>
			<div id="duplicationIdMsg"></div>
			<div>
				<label>비밀번호: <input type="password" name="cpw"
					placeholder="비밀번호"></label>
			</div>
			<div>
				<label>비밀번호 확인: <input type="password" name="cpwConfirm"
					placeholder="비밀번호 확인"></label>
			</div>
			<div>
				<label>이름:<input type="text" name="nm" placeholder="이름"></label>
			</div>
			<div>
				<label>이메일: <input type="text" name="email" placeholder="이메일"></label>
			</div>
			<div>
				<input type="submit" value="회원가입">
			</div>
		</form>
	</div>

	<script>
	function defaultCheckIdValue() {
			checkId.value = 2
			duplicationIdMsg.innerHTML=''
		}
		
		function chkId() {
			var cid = frm.cid.value
			if(cid.length == 0) {
				alert('아이디를 입력 해 주세요')
				return false
			}
			
			axios.get('/user/chkId', {
				params: {
					cid : cid
				}
			}).then(function(response) {
				checkId.value=response.data.result
				var msg = ''
				switch(response.data.result) {
				case 0:
					msg = '아이디를 사용할 수 있습니다.'
					break;
				case 1:
					msg = '이미 사용 중입니다.'
					break;
				}
				duplicationIdMsg.innerHTML = msg
			
			}).catch(function(error) {
			    console.log(error);
			  })
			var a =10;
			return false
		}
		
	function chk() {
			
			if(checkId.value == 2) {
				alert('아이디 중복 확인을 해주세요')
				return false			
			
			} else if(checkId.value == 1) {
				alert('다른 아이디를 사용해주세요.')
				return false
			}else if(frm.cid.value.length == 0) {
				alert('아이디를 입력해 주세요.')
				frm.cid.focus()
				return false			
			} else if(frm.cpw.value == '') {
				alert('비밀번호를 입력해 주세요.')
				frm.cpw.focus()
				return false			
			} else if(frm.cpw.value != frm.cpwConfirm.value) {
				alert('비밀번호를 확인해 주세요.')
				frm.cpw.focus()
				return false			
			} else if(frm.nm.value.length == 0) {
				alert('이름을 입력해 주세요.')
				frm.nm.focus()
				return false
			}else if(frm.ph.value.length == 0){
				alert('전화번호를 입력해 주세요')
				frm.ph.focus()
				return false
			}else if(frm.email.value.length == 0){
				alert('이메일을 입력해 주세요')
				frm.nm.focus()
				return false
			}
		}
		
	</script>
</body>
</html>