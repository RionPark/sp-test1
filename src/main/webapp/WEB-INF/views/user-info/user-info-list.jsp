<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
	<thead>
		<tr>
			<th>번호</th>
			<th>아이디</th>
		</tr>
	</thead>
	<tbody id="tBody">
	
	</tbody>
</table>
<button onclick="location.href='/views/user-info/user-info-insert'">등록</button>
<script>
window.onload = function(){
	var xhr = new XMLHttpRequest();
	xhr.open('GET','/users');
	xhr.onreadystatechange = function(){
		if(xhr.readyState==4 && xhr.status==200){
			var res = JSON.parse(xhr.responseText);
			console.log(res);
			var html ='';
			for(var i=0;i<res.length;i++){
				var userInfo = res[i];
				html += '<tr onclick="location.href=\'/views/user-info/user-info-view?uiNum=' + userInfo.uiNum + '\'">';
				html += '<td>' + userInfo.uiNum + '</td>';
				html += '<td>' + userInfo.uiId + '</td>';
				html += '</tr>';
			}
			document.querySelector('#tBody').innerHTML = html;
		}
	}
	xhr.send();
}
</script>
</body>
</html>