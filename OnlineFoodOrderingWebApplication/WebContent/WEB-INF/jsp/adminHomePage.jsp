<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<style type="text/css">
ul {
    float: left;
    width: 100%;
    padding: 0;
    margin: 0;
    list-style-type: none;
}

#menu{
    float: left;
    width: 6em;
    text-decoration: none;
    color: black;
    background-color: #8FBC8F;
    padding: 0.2em 0.6em;
    border-right: 1px solid white;
}

a:hover {
    background-color: fuchsia;
}

li {
    display: inline;
}
body {
background:#FFF8DC;  
margin:80px 80px 100px 100px;
}
#bihar{
color:maroon;
}

a{
text-decoration:none;
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



<img src="bakery.jpeg" class="img-rounded"  width="100" height="100" style="float:left;">  <font color="orange"><center><h1 id="bihar">BIHAR BAKERY</h1> </center></font> 
<BR><BR>
<font color="maroon">HOME</FONT> 

</div>



<div id="fixedfooter">
<a href="./logout.htm"><img src="logout.jpg" class="img-rounded"  width="100" height="100" style="float:left;"> </a><a href="tcframe.html" target="_top" style="text-decoration:none; color:maroon; float:right">Terms & Conditions</a>
<br><p id="bihar"style="  float:right;" >© Copyright 2015. Bihar Bakery</p></div>
<body>
<br>
<br><br>
<br>
<center><h1 style="font-family: Georgia;text-transform: uppercase;">HELLO ${username}</h1></center>
<form:form action="" commandName="" method="GET"><br> 
     <li><a href="./enteritems.htm" name="enteritem" method="GET" id="menu">INSERT<br> ITEM</a></li>
     <li><a href="./viewitem1.htm" name="item" method="GET" id="menu">VIEW <br>ITEMS</a></li>
     <li><a href="./viewadminorder.htm" name="item" method="GET" id="menu">VIEW ORDERS</a></li>
     <li><a href="./viewcustomer.htm" name="order" method="GET" id="menu">VIEW CUSTOMERS</a></li>   
    </form:form> 

</body>
</html>