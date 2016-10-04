<%-- 
    Document   : approved
    Created on : Oct 8, 2015, 4:48:23 PM
    Author     : Techm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
        body {
 
margin:80px 80px 100px 100px;
}
a{color:orange
}



div#fixedheader {
position:fixed;
top:0px;
left:0px;
width:100%;
background:maroon;
padding:20px;
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
        form{
           font-size: 200%;
        }
    </style>
    <div id="fixedheader">
        <a href="devoteeHomePage.jsp"  style="text-decoration:none" >HOME</a>
<p align="right" >
    <a href=""  style="text-decoration:none" ><h3 >LOGOUT</h3></a>
<a href="mailto:ttdseva@gmail.com" style="text-decoration:none">Write to us |</a> 
<a href="contactframe.html"  style="text-decoration:none">Contact Us</a>

</p></div>



<div id="fixedfooter">
<a href="tcframe.html" target="_top" style="text-decoration:none">Terms & Conditions</a>
<p style="color:orange  align=left"> © Copyright 2015.Tirumala Tirupati Devasthanams</p>

</div>
    <body>
         <c:forEach  var="f" items="${requestScope.approved}">
 <option value="${f.devoteeId}">${f.devoteeId}</option>
 <option value="${f.sevaName}">${f.sevaName}</option>
 <option value="${f.bookingDate}">${f.bookingDate}</option>
 <option value="${f.noofSeats}">${f.noofSeats}</option>
 <option value="${f.requestNo}">${f.requestNo}</option>
 <option value="${f.status}">${f.status}</option>
 <option value="${f.cost}">${f.cost}</option>
</c:forEach>
    </body>
</html>
