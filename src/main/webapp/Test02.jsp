<%-- 
    Document   : Test02
    Created on : Sep 9, 2022, 9:01:54 AM
    Author     : ravin
--%>

<%@page import="com.mycompany.gocheetasoap_service.Customer"%>
<%@page import="com.mycompany.gocheetasoap_service.Testone"%>
<%@page import="com.mycompany.gocheetasoap_service.Testone_Service"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
            <p>ffffffffffffffffffffffff</p>
         <%! 
		Customer customer = null;
		
		String uname = null;
	
	%>

	<%
	
		if(session.getAttribute("customer") != null) {
			
			customer = (Customer)session.getAttribute("customer");
			
			uname = customer.getUsername();
		}
	
	%>
            
            
        </h1>
    </body>
</html>
