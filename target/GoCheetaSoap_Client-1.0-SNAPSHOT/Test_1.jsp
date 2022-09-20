<%-- 
    Document   : Test
    Created on : Sep 8, 2022, 8:12:13 PM
    Author     : ravin
--%>

<%@page import="com.mycompany.gocheetasoap_service.TestService"%>
<%@page import="com.mycompany.gocheetasoap_service.TestService_Service"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
            
            
     
            
            
            <%
            
            
            TestService_Service service = new TestService_Service();
            TestService proxy = service.getTestServicePort();
            out.println(proxy.hello("Ravindu"));
            
   
            
            %>
            
            
            
            
            
        </h1>
    </body>
</html>
