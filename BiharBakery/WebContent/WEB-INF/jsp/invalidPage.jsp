<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login failed</title>
</head>
<style type="text/css">

body {
 
margin:80px 80px 100px 100px;
}
#orange{
color:orange;
}
#newuser {
    text-decoration: none; font: menu;
    display: inline-block; padding: 2px 8px;
    background: ButtonFace; color: ButtonText;
    border-style: solid; border-width: 2px;
    border-color: ButtonHighlight ButtonShadow ButtonShadow ButtonHighlight;
    font-size:15pt;color:white;background-color:green;border:2px solid #336600;padding:3px
}
div#fixedheader {
position:fixed;
top:0px;
left:0px;
width:100%;
background:maroon;
padding:8px;
 }

div#fixedfooter {
position:fixed;
bottom:0px;
left:0px;
width:100%;
color:orange;
background:maroon;
padding:8px;
}
</style>

<div id="fixedheader">


<img src="bakery.jpeg" class="img-rounded"  width="100" height="100" style="float:left;><font color="orange"><center><h1 id="orange">BIHAR BAKERY</h1> </center></font>

</div>



<div id="fixedfooter">
<a href="tcframe.html" target="_top" style="text-decoration:none; color:orange;">Terms & Conditions</a>
<p style="color:orange  align="left" >© Copyright 2015. Bihar Bakery</p></div>
<body>

 <h1>Invalid Page</h1>
     <form:form action="login.jsp">
        username or password is incorrect please login again here
        <input type="submit" value="login"/>
    </form:form>
 
 
 
 

</body>
</html>