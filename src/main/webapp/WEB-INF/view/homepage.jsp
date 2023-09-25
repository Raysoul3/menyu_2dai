<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>どんな料理を作るか</h1>
<form action="Main" method="post">
材料：<select name="zairyou">
	<option value="1">ピーマン</option>
	<option value="2">トマト</option>
	<option value="3">肉</option>
	<option value="4">ジャガイモ</option>
	<option value="5">なす</option>
	<option value="6">卵</option>
	<option value="7">玉ねぎ</option>
	
</select><br>
<!-- 材料：<select name="zairyou">
	<option value="1">ピーマん</option>
	<option value="2">トマト</option>
	<option value="4">肉</option>
	<option value="5">ジャガイモ</option>
	<option value="6">なす</option>
	<option value="7">卵</option>
	<option value="8">玉ねぎ</option>
</select><br>
材料：<select name="zairyou">
	<option value="1">ピーマん</option>
	<option value="2">トマト</option>
	<option value="3">にんじん</option>
	<option value="4">肉</option>
	<option value="5">ジャガイモ</option>
	<option value="6">なす</option>
	<option value="7">卵</option>
	<option value="8">玉ねぎ</option> 
</select>-->
<input type="submit" value="決定">
</form>

</body>
</html>