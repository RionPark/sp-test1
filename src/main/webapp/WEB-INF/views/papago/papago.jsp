<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
*{
	padding : 0;
	margin : 0;
	text-align:center;
}
div{
	width:40%;
	float:left;
	border :0; 
}
div.middle{
	width:70px;
	border :0; 
}
</style>
<body>

<div class="left-div">
<select id="source" onchange="check(this)" onfocus="saveTmp(this)">
</select><br>
<textarea id="text" placeholder="번역할 단어"></textarea>
</div>
<div class="middle">
	<button onclick="doTranslate()">번역하기</button>
</div>
<div class="right-div">
<select id="target" onchange="check(this)" onfocus="saveTmp(this)">
</select><label for="honorific">존댓말</label><input type="checkbox" id="honorific"><br>
<textarea id="translatedText"></textarea>
</div>
<script>
function doTranslate(){
	/* var param = {
			source : source.value,
			target : target.value,
			text : document.querySelector('#text').value
	} */
	var url = '/papago?source=' + source.value + '&target=' +target.value;
	url += '&text=' + document.querySelector('#text').value;
	url += '&honorific=' + document.querySelector('#honorific').checked;
	var xhr = new XMLHttpRequest();
	xhr.open('GET',url);
	xhr.onreadystatechange = function(){
		if(xhr.readyState==4 && xhr.status==200){
			var res = JSON.parse(xhr.responseText);
			var translatedText = res.message.result.translatedText;
			document.querySelector('#translatedText').value = translatedText;
		}
	}
	xhr.send();
}
var langs = ['ko','en','id'];
var source = document.querySelector('#source');
var target = document.querySelector('#target');
var changeObj = null;
var tmpIdx = 1;
function saveTmp(obj){
	changeObj = obj;
	tmpIdx = langs.indexOf(obj.value);
}

function init(){
	var html = '';
	for(var lang of langs){
		html += '<option>' + lang + '</option>';
	}
	source.innerHTML = html;
	target.innerHTML = html;
	check(source);
}

function check(obj){
	var targetObj = (obj==source)?target:source;
	if(source.value==target.value){
		targetObj.value = langs[tmpIdx];
		if(obj.value==targetObj.value){
			var idx = langs.indexOf(targetObj.value);
			if(++idx==langs.length){
				idx=langs.indexOf(targetObj.value)==0?1:0;
			}
			targetObj.value = langs[idx];
		}
	}
}
window.onload = init;
</script>
</body>
</html>