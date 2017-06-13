<%-- 
    Document   : index
    Created on : Jun 13, 2017, 3:44:48 PM
    Author     : Yoseph
--%>
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
        <title>Masdha FM</title>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <!--[if lte IE 8]><script src="assets/js/ie/html5shiv.js"></script><![endif]-->
        <link rel="stylesheet" href="assets/css/main.css" />
        <!--[if lte IE 8]><link rel="stylesheet" href="assets/css/ie8.css" /><![endif]-->
        <!--[if lte IE 9]><link rel="stylesheet" href="assets/css/ie9.css" /><![endif]-->
    </head>
    <body>

        <!-- Header -->
        <header id="header">
            <h1>Masdha FM</h1>
            <nav>
                <ul>
                    <li></li>
                    <li><a href="#one">Program</a></li>
                    <li><a href="Daftar.jsp">Kontak kami</a></li>
                    <li><a href="Login.jsp">Tentang kami</a></li>	
                </ul>
            </nav>
        </header>
        <iframe src="streamfeedtwitter.jsp" width="0" height="0" hidden=""></iframe>
        <!-- Intro -->
        <section id="intro" class="main style1 dark fullscreen">
            <div class="content">
                <header>
                    <br><br>
                    <br><br>
                    <img src="Images/mazdha.png" style="height:85px;width:300px;">
                </header>
                <p>Pendengar Saat Ini</p>
                <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
                <center>
                    <script type="text/javascript">
                $(document).ready(function () {
                    var interval = setInterval(refresh1, 1000);
                });
                function refresh1() {
                    $.get('count.jsp', function (result) {
                        $('#count').html(result);
                    });
                }
            </script>
            <div id="count" style="font-size: xx-large;">
                <iframe src="count.jsp" scrolling="no" sandbox="allow-scripts allow-same-origin allow-forms" style="height: 200px;width: 200px;
                        font-size: xx-large;">
                </iframe>
            </div></center>
                <footer>
                    <br><br><br><br><br><br>
                    <a href="#one" class="button style2 down">More</a>
                </footer>
            </div>
        </section>
        <!-- One -->
        <section id="one" class="main style2 right dark fullscreen">
            <div class="content box style2">
                <header>
                    <h2>Radio Masdha</h2>
                </header>
                <p>Masdha FM merupakan salah satu stasiun radio yang ada di Jogja. Stasiun radio ini terletak di Kampus III Universitas Sanata Dharma, Paingan, Maguwoharjo, Depok, Sleman, Jogja. Stasiun radio ini telah dibentuk sejak tanggal 15 Oktober 1990 oleh beberapa dosen Universitas Sanata Dharma Jogja. Pada tanggal 5 April 2000, Radio Masdha resmi mengudara sebagai radio komersial dengan nama badan hukum PT. Radio Swara Mahasiswa Sanata Dharma. Stasiun radio ini ditujukan bagi pendengar kaum muda khususnya mahasiswa.
</p>
            </div>
            <a href="#two" class="button style2 down anchored">Next</a>
        </section>
        <!-- Two -->
        <section id="two" class="main style2 left dark fullscreen">
            <div class="content box style2">
                <header>
                    <h2>Tangga Lagu Pendengar</h2>
                </header>
                
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
                height: 250px;width: 300px;">
                     <iframe id="yuhu3" src="showchart.jsp" scrolling="no" 
                        style="height:250px;width:300px; font-size: small;
                        overflow-x:hidden;overflow-y:hidden">
                </iframe>
            </div>
            </div>
            <a href="#work" class="button style2 down anchored">Next</a>
        </section>  
        <!-- Work -->
        <section id="work" class="main style3 primary">
            <div class="content" style="height: 50px;">
                <header>
                    <h2>Infomarsi</h2>
                   
                </header>
               
            </div>
        </section>
        <section id="isi">
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
            <br><br><br>
            <h1 style="font-size:65px;margin-left: 22%;">TIMELINE</h1>
            <h1 style="float: right;font-size:65px; margin-top: -1.8%;margin-right: 18%;">REQUEST</h1>
            <br>
            <div id="feeed3" style="background-color: transparent;
                 height:440px;width:300px; margin-left: 25%; ">                
                <iframe id="yuhu" src="showfeed.jsp"
                        scrolling="yes" style="height:500px;width:300px; font-size: small;
                        overflow-x:hidden;overflow-y:scroll;"> 
                </iframe>                   
            </div>
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
                 height:440px;width:300px; margin-left:54%; margin-top: -32.4%;">                
                <iframe id="yuhu" src="showqueue.jsp" scrolling="no" 
                        style="height:500px;width:300px; font-size: small;
                        overflow-x:hidden;overflow-y:hidden"> 
                </iframe>                   
            </div>
            
            
        </section>
        <br><br>
        <!-- Footer -->
        <footer id="footer">
            <!-- Icons -->
            <!--					<ul class="actions">
                                                            <li><a href="#" class="icon fa-twitter"><span class="label">Twitter</span></a></li>
                                                            <li><a href="#" class="icon fa-facebook"><span class="label">Facebook</span></a></li>
                                                            <li><a href="#" class="icon fa-instagram"><span class="label">Instagram</span></a></li>
                                                            <li><a href="#" class="icon fa-linkedin"><span class="label">LinkedIn</span></a></li>
                                                            <li><a href="#" class="icon fa-dribbble"><span class="label">Dribbble</span></a></li>
                                                            <li><a href="#" class="icon fa-pinterest"><span class="label">Pinterest</span></a></li>
                                                    </ul>-->
            <!-- Menu -->
            <ul class="menu">
                <li>&copy; TeamPTI</li>
            </ul>
        </footer>
        <!-- Scripts -->
        <script src="assets/js/jquery.min.js"></script>
        <script src="assets/js/jquery.poptrox.min.js"></script>
        <script src="assets/js/jquery.scrolly.min.js"></script>
        <script src="assets/js/jquery.scrollex.min.js"></script>
        <script src="assets/js/skel.min.js"></script>
        <script src="assets/js/util.js"></script>
        <!--[if lte IE 8]><script src="assets/js/ie/respond.min.js"></script><![endif]-->
        <script src="assets/js/main.js"></script>
    </body>
</html>