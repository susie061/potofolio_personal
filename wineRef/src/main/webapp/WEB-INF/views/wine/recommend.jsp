<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기</title>
</head>
<body>
	<form id="frm" action="/wine/refPost" method="post"  enctype="multipart/form-data" onsubmit="chk()">
		<div><img id="ref_wine" src="${myImg}"></div>
		<div><input type="text" placeholder="Title" name="제목"></div>
		<div><input type="text" placeholder="degree" name="도수"></div>
		<div><input type="text" placeholder="taste" name="맛"></div>
		<div><input type="text" placeholder="sort" name="종류"></div>
		<div><input type="text" placeholder="brand" name="브랜드"></div>
		<div><input type="file" placeholder="uploadWineImg" accept="image/*"></div>
		<div><input type="submit" value="등록"></div>
	</form>
	
	<script>
	  function chk(){
		  console.log('frm.uploadWineImg.value: ' + frm.uploadWineImg.value)
		   if(frm.uploadWineImg.value==''){
			   alert('이미지를 선택해주세요')
			   return false
		   }
	  }
	</script>
</body>
</html>