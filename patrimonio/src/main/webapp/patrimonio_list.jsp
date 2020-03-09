<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<link rel='stylesheet' type="text/css" href='<c:url value="css/bootstrap.min.css"></c:url>'>
<meta charset="ISO-8859-1">
<title>Lista de Patrimonio</title>
</head>
<body>
<h1>Lista de Patrimonio</h1>
<a href="patrimonio_cadastro.jsp" class="btn btn-primary">Novo Cadastro</a>

<table id="example" class="table table-striped table-bordered" style="width:100%">
        <thead>
            <tr>
                <th>Identifica��o</th>
                <th>Patrimonio</th>
                <th>Local</th>
            </tr>            
        </thead>
        <tbody>
        
        <c:forEach items="${patrimonio}" var="patrimonio">
        <tr>        
        <td>${patrimonio.identificacao}</td>
        <td>${patrimonio.nome}</td>
        <td>${patrimonio.local}</td>   
        
        
        
        </tr>
        
        
        
        </c:forEach>
        
        
        </tbody>
</table>

</body>
</html>