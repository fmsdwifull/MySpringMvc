<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UFT-8">
<title>Insert title here</title>
</head>
<body>



<a href="springmvc/testModelAndView">testModelAndView</a>
<br/>
<form action="springmvc/testPojo" method="post">
	username:<input type="text" name="username"/>
	<br/>
	password:<input type="password" name="password" />
	<br/>
	email:<input  type="text" name="email"/>
	<br/>
	age:<input type="text" name="age"/>
	<br/>
	<!-- 
	birday:<input type="text" name="birday"/>
	<br/> 
	-->
	province :<input type="text" name="address.province" />
	<br/>
	city: <input type="text" name="address.city" />
	<input type="submit" value="提交" />
	
</form>

<br/>
<a href="springmvc/testRequestPara?username=yangliu&age=11">testRequestPara</a>

<br/>
<a href="springmvc/testPathVariable/1">testPathVariable</a>
<br/>
<a href="springmvc/helloworld">hello world</a>
</body>
</html>