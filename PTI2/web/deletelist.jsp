<%-- 
    Document   : deletechart
    Created on : Jun 9, 2017, 11:35:10 AM
    Author     : Kirizu
--%>

<%@page import="Feed.SongRequest"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%SongRequest songRequest = new SongRequest();
        songRequest.deleteList();%>
    </body>
</html>
