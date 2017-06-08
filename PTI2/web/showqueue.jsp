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
        <link rel="stylesheet" href="assets/css/chatbox.css">
        <title>JSP Page</title>

    </head>
    <body>
        <%StreamRequest sr = new StreamRequest();%>
        <section class="chatbox">
            <section class="chat-window">
                <%
                    for (SongRequest songRequest : SongRequest.songListQueue) {
                        String user = songRequest.getUser();
                        String artis = songRequest.getArtis();
                        String title = songRequest.getTitle();%>
                <article class="msg-container msg-remote" id="msg-0">
                    <div class="msg-box">
                        <img class="user-img" id="user-0" src="//gravatar.com/avatar/00034587632094500000000000000000?d=retro" />
                        <div class="flr">
                            <div class="messages">
                                <p class="msg" id="msg-0">
                                    <%
            out.println(user + " : " + artis + " - " + title + "\n");%>
                                </p>
                            </div>
                        </div>
                    </div>
                </article>
                <%}%>
                </body>
                </html>