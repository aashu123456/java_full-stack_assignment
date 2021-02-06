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
<label>Employee ID</label>
<input type="hidden" name="emp" value="update">
<input type="number" name="id"><br/><br/>
<label>Salary</label>

<input type="number" name="salary"><br/><br/>
<input type="submit" value="Update Employee Info">
</form>

</body>
</html>