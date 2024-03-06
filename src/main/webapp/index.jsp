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
width:275px;

}
</style>
</head>
<body>
<form action="Login" method="get">
<fieldset>
<table>
	<tr align="center"><td colspan='2'><h2>Voting App</h2></td></tr>
	<tr align="center"><td><label>Username : </label></td><td><input type="text" name="user"></td></tr>
	<tr align="center"><td><label>Password : </label></td><td><input type="password" name="pass"></td></tr>
	<tr align="center"><td><input type="submit" value="Login" name="sub"></td>
					   <td><a href="Ragistration.jsp"><input type="button" value="Ragister" name="sub"/></a></td></tr>
</table>
</fieldset>
</form>
</body>
</html>
