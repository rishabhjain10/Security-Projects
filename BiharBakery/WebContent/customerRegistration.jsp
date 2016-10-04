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
    if(form.customerName.value == "") {
      alert("Error: Username cannot be blank!");
      form.customerName.focus();
      return false;
    }
    if(form.password.value == "") {
	      alert("Error: password cannot be blank!");
	      form.password.focus();
	      return false;
	    }
	if(form.emailId.value == "") {
      alert("Error: Email cannot be blank!");
      form.emailId.focus();
      return false;
    }
	var phoneno = /^\d{10}$/;  
	  if((inputtxt.mobileNumber.match(phoneno)))  
	        {  
	      return true;  
	        }  
	      else  
	        {  
	        alert("message");  
	        return false;  
	        } 
	
	if(form.mobileNumber.value == "") {
      alert("Error: mobile Number cannot be blank!");
      form.mobileNumber.focus();
      return false;
    }
	

    if(form.password.value != "" && form.password.value == form.pwd2.value) {
      if(form.pwd1.value.length < 6) {
        alert("Error: Password must contain at least six characters!");
        form.pwd1.focus();
        return false;
      }
      
     
      re = /[a-z]/;
      if(!re.test(form.pwd1.value)) {
        alert("Error: password must contain at least one lowercase letter (a-z)!");
        form.pwd1.focus();
        return false;
      }
      re = /[A-Z]/;
      if(!re.test(form.pwd1.value)) {
        alert("Error: password must contain at least one uppercase letter (A-Z)!");
        form.pwd1.focus();
        return false;
      }
    } else {
      alert("Error: Please check that you've entered and confirmed your password!");
      form.pwd1.focus();
      return false;
    }

    alert("You have successfully registered " );
    return true;
  }

</script>
<style type="text/css">

body {
 background:#FFF8DC;
margin:80px 80px 100px 100px;
}
#bihar{
color:maroon;
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

<%-- <p align="right" > <a href="mailto:Biharbakery@gmail.com" style="text-decoration:none">Write to us |</a> 
<a href="contactframe.html"  style="text-decoration:none">Contact Us</a></p> --%>

<img src="bakery.jpeg" class="img-rounded"  width="100" height="100" style="float:left;><font color="orange"><center><h1 id="bihar">BIHAR BAKERY</h1> </center></font>

</div>



<div id="fixedfooter">
<a href="tcframe.html" target="_top" style="text-decoration:none; color:maroon;">Terms & Conditions</a>
<p id="bihar" style="  align="left" >© Copyright 2015. Bihar Bakery</p></div>
<body>
<br>

 <center><h1>Registration Form</h1></center>

     <form:form action="./register.htm" commandName="regCmd" onsubmit="return checkForm(this);">
      <pre>       	
       							<font style="font-family: Georgia;">User Name:			</font><input type="text" name="customerName">		
       
       							<font style="font-family: Georgia;">Password:			</font><input type="password" name="password"> 		
      
       							<font style="font-family: Georgia;">Confirm Password:	</font><input type="password" name="pwd2"> 		 		
       
       							<font style="font-family: Georgia;">Mobile Number:		</font><input type="text" name="mobileNumber"> 		
       
       							<font style="font-family: Georgia;">emailId:			</font><input type="text" name="emailId"> 
       		
       							<font style="font-family: Georgia;">Address:			</font><textarea rows="4" cols="50" type="text" name="address"></textarea> 		
       
       												<input type="submit" value="Register" style="font-size:15pt;background-color:white;border:2px solid #336600;padding:3px"/>  
    </pre>
    </form:form>


 
 

</body>
</html>