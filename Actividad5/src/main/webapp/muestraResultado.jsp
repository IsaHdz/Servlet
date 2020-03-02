<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Suma"%>
<!DOCTYPE html>
<html>
	<head>
		<title>JSP Page</title>
	</head>
	<body>
	
	<%
		Suma s =(Suma) request.getAttribute("sumaResuelta");
                Suma s2 = (Suma) request.getAttribute("perimetro");
	%>
	<h1>El area es:</h1>
	<%=s.getResultado()%>
        <h1>El perimetro es:</h1>
	<%=s2.getResultado()%>
	</body>
</html>