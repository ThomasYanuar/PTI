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
        <div style="padding: 10px; color:#ccc;">
            <br>
            <style>
                p.normal {
                    font-weight: normal;
                }

                p.light {
                    font-weight: lighter;
                }

                p.thick {
                    font-weight: bold;
                }

                p.thicker {
                    font-weight: 900;
                }
            </style>
            <section class="chatbox">
                <section class="chat-window">
                    <%for (Feed feed : SongRequest.feedList) {
                        String user = feed.getUser();
                        String text = feed.getText(); %>
                    <article class="msg-container msg-remote" id="msg-0">
                        <div class="msg-box">
                            <img class="user-img" id="user-0" src="//gravatar.com/avatar/00034587632094500000000000000000?d=retro" />
                            <div class="flr">
                                <div class="messages">
                                    <p class="msg" id="msg-0">
                                        <%out.println("@"+user+":" +  text);
                                        %>
                                    </p>
                                </div>
                            </div>
                        </div>
                    </article>


                    <br>
                    <%}%>
                    </div>
                    </body>
                    </html>
