<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import="java.util.List" %>
    
<% String[] list = (String[])request.getAttribute("list"); %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>選んでください</title>
</head>
<body>
<h1>選んでください</h1>
<p>

<% for (int i = 0; i < list.length; i++) { %>
			<a href="Main2"><button><%=list[i]%></button></a><br>
			
			<% } %><br>

</p>

<a href="Main">戻る</a>
</body>
</html>