<%-- 
    Document   : showfeed
    Created on : Jun 11, 2017, 7:16:39 PM
    Author     : Yoseph
--%>

<%@page import="Feed.SongRequest"%>
<%@page import="Feed.Feed"%>
<%@page import="twitter4j.Status"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="assets/css/chatbox.css">
        <title>JSP Page</title>

    </head>
    <body>
        <h1>tess</h1>
        <%for (Feed feed : SongRequest.feedList) {
                String user = feed.getUser();
                String text = feed.getText();
        out.println("@" + user + " : " + text);
        %>
        <br>
        <%}%>
        

    </body>
</html>
