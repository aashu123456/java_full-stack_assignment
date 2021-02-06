<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="EmployeeController" method="post">
<label>Employee Id</label>
<input type="hidden" name="emp" value="insert">
<input type="text" name="id"><br/><br>
<label>Name</label>
<input type="text" name="name"><br/><br>
<label>Salary</label>
<input type="number" name="salary"><br/><br>
<label>Designation</label>
<input type="text" name="designation"><br/><br>
<input type="submit" value="Store Employee Info">
</form>

</body>
</html>