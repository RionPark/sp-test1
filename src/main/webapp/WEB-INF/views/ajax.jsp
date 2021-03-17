<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div id="rDiv"></div>
<script>
var xhr = new XMLHttpRequest();
xhr.open('GET','/test');
xhr.onreadystatechange = function(){
	if(xhr.readyState==4 && xhr.status==200){
		document.querySelector('#rDiv').innerHTML = xhr.responseText;
	}
}
xhr.send();
</script>
</body>
</html>