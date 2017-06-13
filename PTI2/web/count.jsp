<%-- 
    Document   : count
    Created on : Jun 2, 2017, 8:56:02 PM
    Author     : Yoseph
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Count</title>
    </head>
    <body style="color: white; font-size: 100px;">
    <center>
        <jsp:useBean class="Count.CountStream"
                     id="sessionCounter" scope="application" />         
        <jsp:getProperty name="sessionCounter"
                         property="currentSessionCount" />
        <br>
    </center>

    </body>
</html>
