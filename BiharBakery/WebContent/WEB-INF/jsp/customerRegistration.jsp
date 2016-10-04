<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <h2>REGISTRATION</h2>
 <h1>REgistration Form</h1>
     <form:form action="./register.htm" commandName="regCmd">
       password: 	<input type="text" name="password"> 		<br>
       customerName: 	<input type="text" name="customerName"> 		<br>
       mobileNumber: 	<input type="text" name="mobileNumber"> 		<br>
       emailId: 	<input type="text" name="emailId"> 		<br>
       address: 	<input type="text" name="address"> 		<br>
       
       <input type="submit" value="Register User"/>
        
    </form:form>
 
 
 
 

</body>
</html>