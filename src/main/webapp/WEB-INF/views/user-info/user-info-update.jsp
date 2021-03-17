<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <input type="hidden" id="uiNum"><br>
 <input type="text" id="uiName" placeholder="이름"><br>
 <input type="text" id="uiId" placeholder="아이디"><br>
 <input type="text" id="uiPwd" placeholder="비번"><br>
 <input type="text" id="uiGenre" placeholder="장르"><br>
 <input type="text" id="uiEmail" placeholder="이메일"><br>
 <input type="text" id="uiPhone1" placeholder="휴대폰1"><br>
 <input type="text" id="uiPhone2" placeholder="휴대폰2"><br>
 <input type="text" id="uiAddress" placeholder="주소"><br>
 <input type="text" id="uiHint" placeholder="비번힌트"><br>
 <input type="text" id="uiAnswer" placeholder="비번답"><br>
 <button onclick="update()">수정</button>
<script>
function update(){
	var param = {};
	var objs = document.querySelectorAll('input[type=text],input[type=hidden]');
	for(var i=0;i<objs.length;i++){
		var obj = objs[i];
		var key = obj.id;
		var value = obj.value;
		param[key] = value;
	}
	console.log(param);
	var xhr = new XMLHttpRequest();
	xhr.open('POST','/user/update')
	xhr.onreadystatechange = function(){
		if(xhr.readyState==4 && xhr.status==200){
			console.log(xhr.responseText)
		}
	}
	xhr.setRequestHeader('content-type','application/json;charset=utf-8');
	xhr.send(JSON.stringify(param));
}


var uiNum = ${param.uiNum};
var xhr = new XMLHttpRequest();
xhr.open('GET','/user?uiNum=' + uiNum);
xhr.onreadystatechange = function(){
	if(xhr.readyState==4 && xhr.status==200){
		var html = '';
		var res = JSON.parse(xhr.responseText);
		for(var key in res){
			if(document.querySelector('#'+key)){
				document.querySelector('#'+key).value=res[key];
			}
		}  
	}
}
xhr.send();
</script>
</body>
</html>