 <%@page import="com.aartek.model.Login"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

 <%-- <html>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Login</title>
</head>


<body>

   <form:form method="POST" action="login.do" modelAttribute="Login">
       <table  align="center">
    <tr>
   <td> <form:label path="email">Email</form:label></td>
     <td><form:input path="email" /></td>
        
    </tr>
    <tr>
        <td><form:label path="password">Password</form:label></td>
        <td><form:password path="password"/>
    </tr>
    
   <tr>
       <td colspan="2" align="center"><input type="submit" value="submit" /></td>
          </tr>
          
        </table>
      </form:form>
    
</body>
</html>  

 --%> 
<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> --%>
<body>
	<div class="pen-title"><h1>Admin Login</h1></div>
	<!-- Form Module-->
	<div class="module form-module">
		<div class="toggle"></div>
		<div class="form">
			<h2>Login to your account</h2>
			<%-- <form action="#">
				<input type="text" placeholder="Username" /> 
				<input type="password" placeholder="Password" />
				<button>Login</button>
			</form> --%>
			
			
			<form:form id="login" modelAttribute="Login" action="login.do" method="post">
                <table align="center">
                    <tr>
                        <td>
                            <form:label path="email">email: </form:label>
                        </td>
                        <td>
                            <form:input path="email" name="email" id="email" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="password">Password:</form:label>
                        </td>
                        <td>
                            <form:password path="password" name="password" id="password" />
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td align="left">
                            <form:button id="login" name="login">Login</form:button>
                        </td>
                    </tr>
                    <tr></tr>
                   
                 
                </table>
            </form:form>
			
			
		</div>
	</div>
</body>




