<%-- 
    Document   : showchart
    Created on : Jun 8, 2017, 10:21:07 PM
    Author     : Yoseph
--%>

<%@page import="Feed.SongRequest"%>
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
        
        <%for (SongRequest songRequest : SongRequest.songListChart) {
                String user = songRequest.getUser();
                String artis = songRequest.getArtis();
                String title = songRequest.getTitle();
                int vote = songRequest.getVote();%>
        <%out.println(user + " : " + artis + " - " + title + " ("+ vote +" Request)");%>
        <%}%>

    </body>
</html>
