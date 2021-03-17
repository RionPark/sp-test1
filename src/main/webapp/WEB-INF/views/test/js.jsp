<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<input type="text" id="uiId"><br>
<input type="text" id="uiPwd"><br>
<button onclick="test1()">어쩌구</button>
<script>
document.querySelector('#uiNum').value = 117;
var res = {
		uiId : 'test',
		uiPwd : '1234'
}
for(var key in res){
	document.querySelector('#'+key).value = res[key];
	console.log(key + ' = ' + res[key]);
}

function test1(){
/*
 * javascript for
   일반적인 for
 */
 for(var i=0;i<3;i++){
	 
 }
 // java의 향상된 for문이랑 비슷한 for of
 var nums = [1,2,3];
 for(var num of nums){
	 console.log(num);
 }
 /*	위에껄 자바로 바꾸자면 아래임
 	int[] nums = {1,2,3};
 	for(int num:nums){
 		System.out.println(num);
 	}
 */
 // for in 굳이 따지자면 Iterator랑 비슷함.
 var param = {
		 name : 'haha',
		 age : 22
 }
 for(var key in param){
	 console.log(key);
	 console.log(param[key]);
 }
}
</script>
</body>
</html>