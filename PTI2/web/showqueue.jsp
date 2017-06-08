<%-- 
    Document   : showqueue
    Created on : Jun 8, 2017, 6:42:11 PM
    Author     : Yoseph
--%>

<%@page import="Feed.SongRequest"%>
<%@page import="twitter4j.Status"%>
<%@page import="Feed.StreamRequest"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%StreamRequest sr = new StreamRequest();%>
        <%
            for (SongRequest songRequest : SongRequest.songListQueue) {
                String user = songRequest.getUser();
                String artis = songRequest.getArtis();
                String title = songRequest.getTitle();
                out.println(user + " : " + artis + " - " + title);
            }%>
    </body>
</html>