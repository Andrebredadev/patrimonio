<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
<link rel='stylesheet' type="text/css" href='<c:url value="css/bootstrap.min.css"></c:url>'>
<meta charset="ISO-8859-1">
<title>Editar Patrimonio</title>
</head>
<body>

<div class="container">
		<div class="row justify-content-center">
		   <div class="col-8">
		       <h4 class="mt-4 texto-cinza">
		       		Cadastro de Patrimonio
		       </h4>
		       
		       <form action="<c:url value='/EditPatrimonioSrv?id=${patrimonio.id}' />"  
		          method="post"  
		        >
		          <div class="form-group">
		          <h1>Identificação do patrimonio</h1>
						<input
						   type="text"
						   name="numero"
						   id="numero"						   
						   class="form-control"
						   value="${patrimonio.identificacao}"
						>
		          </div>
		          
		          <div class="form-group">
		          <h1>Nome do Patrimonio</h1>
						<input
						   type="text"
						   name="nome"
						   id="nome"						   
						   class="form-control"
						   value="${patrimonio.nome}"
						>
		          </div>
		       <div class="form-group">
		          <h1>Local do Patrimonio</h1>
						<input
						   type="text"
						   name="local"
						   id="local"						   
						   class="form-control"
						   value="${patrimonio.local}"
						>
		          </div>	
		          
		          <button 
		            type="submit"
		            class="btn btn-success"
		           >Editar</button>
		           
		           <button type="button" class="btn btn-primary" onclick="window.history.back()">Voltar</button>   
		           	        
		          
		            
		       
		       </form>
		       
		       
		   </div>
		</div>
		
		
		
		
	</div>


</body>
</html>