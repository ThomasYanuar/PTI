<%-- 
    Document   : testcount
    Created on : Jun 2, 2017, 9:53:10 PM
    Author     : Yoseph
--%>
<%@page import="Count.countver2" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<HTML>
<HEAD>
<TITLE>Session Info</TITLE>
<LINK REL=STYLESHEET
     HREF="events-styles.css"
     TYPE="text/css">
</HEAD>

<BODY>
<TABLE BORDER=5 ALIGN="CENTER">
  <TR><TH CLASS="TITLE">Session Info</TABLE>
<P>

<jsp:useBean class="Count.countver2"
          id="sessionCounter" scope="application" />
<% countver2 cv = new countver2();
    %>
<script type="text/javascript">
                $(document).ready(function () {
    var interval = setInterval(refresh, 5000);
});

function refresh() {
    $.get('testcount.jsp', function (result) {
        $('#countz').html(result);
    });    
}
                </script>
<div id="countz">
<UL>
<LI>Total number of sessions in the life of this
   Web application:
   <jsp:getProperty name="sessionCounter"
               property="totalSessionCount" />.
<LI>Number of sessions currently in memory:
  <jsp:getProperty name="sessionCounter"
              property="currentSessionCount" />.
<LI>Maximum number of sessions that have ever been in
    memory at any one time:
   <jsp:getProperty name="sessionCounter"
               property="maxSessionCount" />.
   <br>
   jumlah count: <%= cv.getTotalSessionCount()%>
</UL>
</div>
</BODY>
</HTML>
