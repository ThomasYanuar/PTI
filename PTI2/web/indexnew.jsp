<%@page import="java.io.IOException"%>
<%@page import="twitter4j.UserList"%>
<%@page import="twitter4j.DirectMessage"%>
<%@page import="twitter4j.User"%>
<%@page import="twitter4j.StallWarning"%>
<%@page import="twitter4j.StatusDeletionNotice"%>
<%@page import="Feed.SongRequest"%>
<%@page import="twitter4j.UserStreamListener"%>
<%@page import="twitter4j.TwitterStreamFactory"%>
<%@page import="twitter4j.TwitterStream"%>
<%@page import="twitter4j.conf.ConfigurationBuilder"%>
<%@page import="Test.SessionCounter"%>
<%@page import="ApiConnect.Connection"%>
<%@page import="twitter4j.ResponseList"%>
<%@page import="twitter4j.Twitter"%>
<%@page import="twitter4j.Status"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Masdha FM - Home</title>
        <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="assets/css/styles.css">
        <link rel="stylesheet" href="assets/css/untitled.css">
        <link rel="stylesheet" href="assets/css/untitled-1.css">
        <link rel="stylesheet" href="assets/css/untitled-2.css">
        <link rel="stylesheet" href="assets/css/untitled-3.css">
        <link rel="stylesheet" href="assets/css/untitled-4.css">
        <link rel="stylesheet" href="assets/css/untitled-5.css">
        <link rel="stylesheet" href="assets/css/untitled-6.css">
        <link rel="stylesheet" href="assets/css/untitled-7.css">
        <link rel="stylesheet" href="assets/css/untitled-8.css">
        <link rel="stylesheet" href="assets/css/untitled-9.css">
        <link rel="stylesheet" href="assets/css/untitled-10.css">
        <link rel="stylesheet" href="assets/css/untitled-11.css">
        <link rel="stylesheet" href="assets/css/untitled-12.css">

    </head>
    <body>
        <nav class="navbar navbar-default navbar-fixed-top">
            <div class="container-fluid">
                <div class="navbar-header"><a class="navbar-brand navbar-link" href="indexnew.jsp"><strong>Masdha</strong> FM</a>
                    <button class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navcol-1"></button>
                </div>
                <div class="collapse navbar-collapse" id="navcol-1">
                    <ul class="nav navbar-nav navbar-right">
                        <div class="dropdown">
                            <button onclick="myFunction()" class="dropbtn">Dropdown</button>
                            <div id="myDropdown" class="dropdown-content">
                                <a href="#home">Home</a>
                                <a href="#about">About</a>
                                <a href="#contact">Contact</a>
                            </div>
                        </div>
                        <li role="presentation"><a href="Programs.jsp">Programs</a></li>
                        <li role="presentation"><a href="Kontak.jsp">Kontak Kami</a></li>
                        <li role="presentation"><a href="About.jsp">About Us</a></li>
                    </ul>
                </div>
            </div>
        </nav>
        <script>
            function myFunction() {document.getElementById("myDropdown").classList.toggle("show");}
            window.onclick = function (event) {
                if (!event.target.matches('.dropbtn')) {
                    var dropdowns = document.getElementsByClassName("dropdown-content");
                    var i;
                    for (i = 0; i < dropdowns.length; i++) {
                        var openDropdown = dropdowns[i];
                        if (openDropdown.classList.contains('show')) {
                            openDropdown.classList.remove('show');
                        }
                    }
                }
            }
        </script>
        <div id="div1" class="wew1">
            <div class="jumbotron" style="background-color:transparent">
                <img src="Images/Masdha.png" style="height: 200px;width: 300px;">
                <p>80% gan.. </p>
                <p></p>
                <div class="dropdown open">
                    <menu class="btn btn-default dropdown-toggle" style="background-color: transparent;"
                          data-toggle="dropdown" aria-expanded="true" type="menu">Our Crew</menu>
                    <ul class="dropdown-menu" role="menu">
                        <li role="presentation"><a href="#">Penyiar </a></li>
                        <li role="presentation"><a href="#">Teknisi</a></li>
                        <li role="presentation"><a href="#">Marketing</a></li>
                        <li role="presentation"><a href="#">Reporter</a></li>
                        <li role="presentation"><a href="#">Produksi</a></li>
                    </ul>

                </div>
            </div>
        </div>
        <iframe src="streamfeedtwitter.jsp" width="0" height="0" hidden=""></iframe>
        <div id="div2" class="wew2" style="background-color: #23527c;">
            <div class="jumbotron" style="background-color: transparent;">

                <h1>Twitter feed</h1>

            </div>
            <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
            <script type="text/javascript">
            $(document).ready(function () {
                var interval = setInterval(refresh2, 5000);
            });
            function refresh2() {
                $.get('showfeed.jsp', function (result) {
                    $('#feeed3').html(result);
                });
            }
            </script>
            <div id="feeed3" style="background-color: #419641;
                 height:440px;width:300px;">                
                <iframe id="yuhu" src="showfeed.jsp" scrolling="no" 
                        style="height:500px;width:300px; font-size: small;
                        overflow-x:hidden;overflow-y:hidden"> 
                </iframe>                   
            </div>

        </div>
        <div id="div3" class="wew3" style="background-color: bisque; ">
            <h3>Jumlah Streamer :</h3>
            <div id="count">
                <iframe src="count.jsp" sandbox="allow-scripts allow-same-origin allow-forms" style="height: 35px;width: 28px;">
                </iframe>
            </div>
            <h1>Music queue &nbsp;&nbsp;&nbsp;&nbsp;
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

                Charts Pendengar</h1>
            <iframe src="http://jogjastreamers.com/masdha-fm.html" 
                    title="MasdhaFM" style="background-image:url(Images/Masdha.png)" sandbox="allow-same-origin allow-scripts"
                    height="0" width="0" scrolling="no" hidden="">
            </iframe>
            <!--                <iframe src="http://jkt.jogjastreamers.com:8000/masda?s=660216089945691" 
                                    title="MasdhaFM" style="background-image:url(Images/Masdha.png)"
                                    height="180" width="300">
                            </iframe>-->
            <br>
            <div id="musicqueue" style="background-color: transparent; ">
                <script type="text/javascript">
                    $(document).ready(function () {
                        var interval = setInterval(refresh1, 5000);
                    });
                    function refresh1() {
                        $.get('count.jsp', function (result) {
                            $('#count').html(result);
                        });
                    }
                </script>
                <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
                <script type="text/javascript">
                    $(document).ready(function () {
                        var interval = setInterval(refresh, 5000);
                    });
                    function refresh() {
                        $.get('showqueue.jsp', function (result) {
                            $('#feeed').html(result);
                        });
                    }
                </script>

                <div id="feeed" style="background-color:transparent;
                     height:440px;width:300px;">                
                    <iframe id="yuhu" src="showqueue.jsp" scrolling="no" 
                            style="height:500px;width:300px; font-size: small;
                            overflow-x:hidden;overflow-y:hidden"> 
                    </iframe>                   
                </div>
                <script type="text/javascript">
                    $(document).ready(function () {
                        var interval = setInterval(refresh3, 5000);
                    });
                    function refresh3() {
                        $.get('showchart.jsp', function (result) {
                            $('#chartpendengar').html(result);
                        });
                    }
                </script>
                <div id="chartpendengar" style="background-color: white;
                     height: 440px;width: 300px; float: right; margin-top: -440px;">
                    <iframe id="yuhu3" src="showchart.jsp" scrolling="no" 
                            style="height:500px;width:300px; font-size: small;
                            overflow-x:hidden;overflow-y:hidden"> 
                    </iframe>
                </div>
            </div>
        </div>
        <footer id="footer" class="footer1"></footer>
        <script src="assets/js/jquery.min.js"></script>
        <script src="assets/bootstrap/js/bootstrap.min.js"></script>
    </body>

</html>