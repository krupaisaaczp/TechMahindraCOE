<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add STudents</title>
</head>
<body>

<h1>Add Students</h1>   
<form action="StudentServlet" method="post">     
Name :<input type="text" name="name"/><br/>     
Age :<input type="text" name="age"/><br/>     
RegNo :<input type="text" name="regno"/><br/>     
Per :<input type="text" name="per"/><br/>     
<input type="submit" value="Add Students" />   
</form> 

</body>
</html>