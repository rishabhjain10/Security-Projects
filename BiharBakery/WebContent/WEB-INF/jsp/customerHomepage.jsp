<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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

</div>



<div id="fixedfooter">
<a href="login.jsp"><img src="logout.jpg" class="img-rounded"  width="100" height="100" style="float:left;"> </a><a href="tcframe.html" target="_top" style="text-decoration:none; color:maroon; float:right">Terms & Conditions</a>
<br><p style="color:maroon;  float:right;" >© Copyright 2015. Bihar Bakery</p></div>
<body>
<br>
<br>
<br>
<br>
<body>


<CENTER style="text-transform: uppercase;"> <!-- <h2>Welcome to Bihar Bakery</h2> -->
 <h1 style="text-transform: uppercase;">Welcome ${username}</h1> </CENTER>
  <center>
     <form:form action="" commandName="">
    <H3 ALIGN="CENTER"> 
    <li><a href="./customer.htm" name="item" method="GET" id="menu">VIEW <br>ITEMS</a></li><BR><BR><BR><BR>
     <li><a href="./vieworder.htm" name="order" id="menu">VIEW ORDER</a></li> </H3>
        
    </form:form>
 </center>
 
 
 

</body>
</html>