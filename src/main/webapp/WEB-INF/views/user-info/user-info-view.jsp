<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1" id="tTable">

</table>
<script>

function doDelete(){
	xhr.open('POST','/user/delete');
	xhr.onreadystatechange = function(){
		if(xhr.readyState==4 && xhr.status==200){
			var res = JSON.parse(xhr.responseText);
			console.log(res);
		}
	}
	var param = {uiNum:${param.uiNum}}
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
			html += '<tr>';
			html += '<th>' + key + '</th>';
			html += '<td>' + res[key] + '</td>';
			html += '</tr>';
		}  
		html += '<tr ><th colspan="2">';
		html += '<button onclick="location.href=\'/views/user-info/user-info-update?uiNum=' + res.uiNum + '\'">수정</buton> ';
		html += '<button onclick="doDelete()">삭제</button>';
		html += '</th></tr>';
		document.querySelector('#tTable').innerHTML = html;
	}
}
xhr.send();
</script>

</body>
</html>