<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script>
var uiNum = ${param.uiNum};
var xhr = new XMLHttpRequest();
xhr.open('GET','/user?uiNum=' + uiNum);
xhr.onreadystatechange = function(){
	if(xhr.readyState==4 && xhr.status==200){
		console.log(xhr.responseText);
	}
}
xhr.send();
</script>

</body>
</html>