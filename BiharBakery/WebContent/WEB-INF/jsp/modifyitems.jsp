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



<a href="adminHomePage.jsp"><img src="bakery.jpeg" class="img-rounded"  width="100" height="100" style="float:left;"> </a> <font color="orange"><center><h1 id="bihar">BIHAR BAKERY</h1> </center></font> 
<BR><BR>
<font color="orange">HOME</FONT> 

</div>



<div id="fixedfooter">
<a href="login.jsp"><img src="logout.jpg" class="img-rounded"  width="100" height="100" style="float:left;"> </a><a href="tcframe.html" target="_top" style="text-decoration:none; color:orange; float:right">Terms & Conditions</a>
<br><p style="color:orange;  float:right;" >© Copyright 2015. Bihar Bakery</p></div>
<body>
${username}
<h1>Item Details</h1>
<form action="./updateitem.htm" method="GET" commandName="makeOrder">
       
 <table id="bold" border="2">

         
   <tr>
    <th></th>            
	<th>Item ID </th>
             
   	<th>Item NAME</th>
            
   	 <th>Item type</th>
   	 <th>Item Quantity</th>
   	 <th>Item Cost</th>
       
    </tr>

           
<c:forEach  var="item" items="${requestScope.itemlist}">

               
 <tr >

 <td> <input type="radio" name="itemid" value="${item.itemId}"> </td>    
	<td>${item.itemId}</td>
                    
	<td>${item.itemName}</td>
                    
	<td>${item.itemType}</td>
	<td>${item.quantity}</td>
	<td>${item.itemCost}</td>
    
               
 </tr>
          
 </c:forEach>
<tr><td><input type="submit" name="selectingItems" value="SUBMIT" ></td>
        </table>
    </form> 
   </body>
   </html>