<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<script type="text/javascript">

  function checkForm(form)
  {
    if(form.userName.value == "") {
      alert("Error: Username cannot be blank!");
      form.customerName.focus();
      return false;
    }
	
	if(form.password.value == "") {
	      alert("Error: password cannot be blank!");
	      form.password.focus();
	      return false;
	    }
      
    
  
    return true;
  }

</script>

<style type="text/css">

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
    font-size:15pt;color:black;background-color:#FFFFF0;border:2px solid #336600;padding:3px
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


<img src="bakery.jpeg" class="img-rounded"  width="100" height="100" style="float:left;><font color="maroon"><center><h1 id="orange">BIHAR BAKERY</h1> </center></font>

</div>



<div id="fixedfooter">
<a href="tcframe.html" target="_top" style="text-decoration:none; color:maroon;">Terms & Conditions</a>
<p id="orange" style="  align="left"" >© Copyright 2015. Bihar Bakery</p></div>
<body>
<pre>





</pre>
<center> <h2>Login Page</h2></center>

    <center> <form:form action="./insert.htm" commandName="cmdUser" onsubmit="return checkForm(this);">
     <pre>
       		<font style="font-family: Georgia;">Username:</font>     <input type="text" name="userName">		<br>
       		<font style="font-family: Georgia;">Password:</font>     <input type="password" name="password"> 		<br>
       <a href="customerRegistration.jsp" method="POST" style="text-decoration:none "><p id=newuser >NEW USER?</p></a> 		<input type="submit" value="LOGIN" style="font-size:15pt;color:black;background-color:#FFFFF0;border:2px solid #336600;padding:3px"/>
      </pre>  
    </form:form>
 </center>
 
 
 

</body>
</html>