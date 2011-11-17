
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Result Page</title>
    </head>
    <body>
        <h1>The result of the convertion is:</h1>
        
        <%= 
            request.getParameter("param1") 
        %>

        
    </body>
</html>
