<%-- 
    Document   : Listener
    Created on : May 30, 2017, 6:31:07 PM
    Author     : Sekar
--%>

<%@ page import="Test.SessionCounter" %>
<html>
    <head>
        <title>Session Counter</title>
    </head>

    <body>
        <%
            SessionCounter counter = (SessionCounter) session.getAttribute("counter");
        %>
        Number of online user(s): <%= counter.getActiveSessionNumber()%>

    </body>
</html>
