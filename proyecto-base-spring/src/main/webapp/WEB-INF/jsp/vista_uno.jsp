<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
pagina uno <br>

${turno.especialidad}


<!-- 
 <c:if test="${not empty listaDeTurnos}">
     <c:forEach var="ob" varStatus="status" items="${listaDeTurnos}">
    <tr>
        <td><c:out value="${ob.lista.turno.especialidad}"/></td>
        <td><c:out value="${ob.lista.turno.fecha}"/></td>
        <td><c:out value="${ob.lista.turno.horario}"/></td>
    </tr>
     </c:forEach>
 </c:if>

 -->

 
</body>
</html>