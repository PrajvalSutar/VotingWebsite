<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">
fieldset{
height:400px;
width:300px;
margin:auto;
}
table{
height:350px;
width:275px
}
</style>
</head>
<body>
<%String user=request.getParameter("user"); %>
<h1>Welcome <%=user %></h1>
<form action="Addvote" method="get">
<fieldset>
<table>
	<tr><td><input type="hidden" value="<%=user%>" name="user" /></td></tr>
	<tr><h2>Best Bollywwod Actor Male</h2><tr>
	<tr><td><input type="radio" name="vote" value="1" id="1" /><label for="1">Shah Rukh Khan</label></td></tr>
	<tr><td><input type="radio" name="vote" value="2" id="2" /><label for="2">Salman Khan</label></td></tr>
	<tr><td><input type="radio" name="vote" value="3" id="3" /><label for="3">Hritik Roshan</label></td></tr>
	<tr><td><input type="radio" name="vote" value="4" id="4" /><label for="4">Akshay Kumar</label></td></tr>
	<tr align="center"><td><input type="submit" value="vote"/></td></tr>
</table>
</fieldset>
</form>
</body>
</html>