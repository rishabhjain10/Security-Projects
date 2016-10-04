<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Item Details</title>
</head>
<style type="text/css">
#bold{
    text-transform: uppercase;
}
body {
 background:#FFF8DC;
margin:80px 80px 100px 100px;
}
#orange{
color:maroon;
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
background:#8FBC8F;
padding:8px;
 }

div#fixedfooter {
position:fixed;
bottom:0px;
left:0px;
width:100%;
color:orange;
background:#8FBC8F;
padding:8px;
}
</style>

<div id="fixedheader">



<a href="./adminhome.htm"><img src="bakery.jpeg" class="img-rounded"  width="100" height="100" style="float:left;"> </a> <font color="orange"><center><h1 id="orange">BIHAR BAKERY</h1> </center></font> 
<BR><BR>
<font color="maroon">HOME</FONT> 

</div>



<div id="fixedfooter">
<a href="./logout.htm"><img src="logout.jpg" class="img-rounded"  width="100" height="100" style="float:left;"> </a><a href="tcframe.html" target="_top" style="text-decoration:none; color:maroon; float:right">Terms & Conditions</a>
<br><p id="orange" style=";  float:right;" >© Copyright 2015. Bihar Bakery</p></div>
<br><br><br><br>
<body id="bold">
<center>
${username}
<h1>Item Details</h1>
<form:form action="./approvalsuccess.htm" commandName="" method="GET">
approve order:<select name="status">
  <option value="yes">Approve</option>
  <option value="no">Reject</option>
  </select> <br>
  <input type="hidden" name="orderid" value="${requestScope.orderid}"><br>
  <input type="submit" name="approve" value="SUMBIT" >
</form:form>
<center>
   </body>
   </html>
