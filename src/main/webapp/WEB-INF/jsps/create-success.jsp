<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>create-success successfully </h1>



${ STUDENT_DATA} </br></br>
${ STUDENT_DATA.fname}
${ STUDENT_DATA.lname}
${ STUDENT_DATA.email}
${ STUDENT_DATA.phone}


<form action="getAll2"> 
<input type="submit" value="GET_ALL_STUDENT">
</form>
</body>
</html>