<%@page import="com.aartek.model.Registration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Login</title>
</head>


<body>

   <form:form method="POST" action="login.do" modelAttribute="Registration" >
       <table border="1" cellpadding="1" cellspacing="1" align="center">
    <tr>
        <td><form:input path="email" /></td><td align="right"><form:errors path="email"/></td>
    </tr>
    <tr>
        <td><form:password path="password"/></td><td align="right"><form:errors path="password"/></td>
    </tr>
    
   <tr>
       <td colspan="2" align="center">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="submit" /></td>
          </tr>
          <tr>
              <td>
                <label> <a href="Registration.do" >create an account</a></label> 
              </td>
          </tr>
        </table>
      </form:form>
    
</body>
</html>