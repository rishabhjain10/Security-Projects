<%-- 
    Document   : checkavailability
    Created on : Oct 6, 2015, 6:10:56 PM
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
    <body><pre>
        <form action="cas" method="get">
            <center> <h1 style="font-family:verdana">Hello devotee</h1>
      SevaName:  <select name="nameOfSeva">
 <c:forEach  var="f" items="${requestScope.ListOfSevas}">
 <option value="${f.sevaId}">${f.sevaName}</option>
</c:forEach>
    </select></center>
                                    Booking date: <input type="text" name="sevadate" size="12">
            
                                    No of seats: <input type="text" name="seatsss">
            
                                          <input type="submit" value="check availability">
        
        </form>
            
</pre>
    </body>
</html>
