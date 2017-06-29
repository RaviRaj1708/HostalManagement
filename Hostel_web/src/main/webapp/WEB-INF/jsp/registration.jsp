<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form method="POST" action="submitRegistration.do" modelAttribute="Registration" >

<table>
	
    <tr>
		
        <td><form:label path="firstName">firstName</form:label></td>
      <td><form:input path="firstName"/></td><td align="right"><form:errors path="firstName"/></td>
        
         </td>
    </tr>
    
    <tr>
    
        <td><form:label path="lastName">lastName</form:label></td>
       <td> <form:input path="lastName" /></td><td align="right"><form:errors path="lastName"/></td>
        </td>
    </tr>
    
     <tr>
     
        <td><form:label path="email">Email</form:label></td>
        <td>
        <form:input path="email" /></td><td align="right"><form:errors path="email"/></td>
    </tr>
    
    <tr>
    	<td><form:label path="password">password</form:label></td>
       <td> <form:password path="password"/></td><td align="right"><form:errors path="password"/></td>
    </tr>
   
    <tr>
     
        <td><form:label path="mobile">mobile</form:label></td>
       <td> <form:password path="mobile"/></td><td align="right"><form:errors path="mobile"/></td>
    </tr>
    <tr>
    <td>
    <form:radiobutton path="sex" value="M"/>Male
    <form:radiobutton path="sex" value="F"/>Female
    </td>
    
    </tr>
   
    
   <tr>
       <td colspan="2">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="submit"  /></td>
          </tr>
          
        </table>
      </form:form>
</body>
</html>