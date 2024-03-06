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
<form action="Ragistration" method="get">
<fieldset>
<table class="table">
	<tr align="center"><td colspan='2'><h2>Voting App</h2></td></tr>
	<tr align="center"><td><label>Username : </label></td><td><input type="text" name="name"></td></tr>
	<tr align="center"><td><label>Password : </label></td><td><input type="text" name="pass"></td></tr>
	<tr align="center"><td><label>Email ID : </label></td><td><input type="text" name="eid"></td></tr>
	<tr align="center"><td><label>Phone No : </label></td><td><input type="text" name="pno"></td></tr>
	<tr align="center"><td><input type="submit" name="sub" value="Ragister"/></td></tr>
	</table>
</fieldset>
</form>

</body>
</html>