

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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
<br><p id="orange" style=";  float:right;" >� Copyright 2015. Bihar Bakery</p></div>
<br><br><br><br>
 <body>
  
      
        
        <h2 id="bold">welcome admin</h2>
        <form:form action="./updateItem.htm" commandName="itemCmd" method="GET">
            
            <table align="center">               
                
	<tr>
          <th></th>
   	<th>Item NAME</th>
            
   	 <th>Item type</th>
   	 <th>Item Quantity</th>
   	 <th>Item Cost</th>
       
    </tr>
            
           <tr>

               
 <tr >

 		 <td><input type="hidden" value="${item.itemId}" name="itemId"></td>
		<td> <input type="text" value="${item.itemName}" name="itemName"></td>
		<td> <input type="text" value="${item.itemType}" name="itemType"></td>
		<td> <input type="text" value="${item.quantity}" name="quantity"></td>
		<td><input type="text" value="${item.itemCost}" name="itemCost"></td>
    
               
 </tr>
           
           
           
          

<br></table><br><br><br><br>
            <table align="center">
<tr><td> <input type="submit" name="update" value="UPDATE" ></td></tr>
            
            </table>	
        </form:form>
    </body>
</html>