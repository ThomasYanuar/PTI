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
        <title>Masdha FM - Programs</title>
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
                        <li role="presentation"><a href="Programs.jsp">Programs</a></li>
                        <li role="presentation"><a href="Kontak.jsp">Kontak Kami</a></li>
                        <li role="presentation"><a href="About.jsp">About Us</a></li>
                    </ul>
                </div>
            </div>
        </nav>
        <div id="div1" class="wew1">
            <div class="jumbotron" style="background-color:transparent">
                <img src="Images/Masdha.png" style="height: 200px;width: 300px;">
                <p>80% gan.. </p>
                <p></p>
                <div class="dropdown open">
                    <button class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-expanded="true" type="button">Pilihan hidup</button>
                    <ul class="dropdown-menu" role="menu">
                        <li role="presentation"><a href="#">menyerah </a></li>
                        <li role="presentation"><a href="#">putus asa</a></li>
                        <li role="presentation"><a href="#">bakar </a></li>
                    </ul>
                </div>
            </div>
        </div>
        <iframe src="streamfeedtwitter.jsp" width="0" height="0" hidden=""></iframe>
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
        <div id="div6" class="wew6" style="background-color: transparent;">
            <h4>Jumlah Streamer :</h4>
            <div id="count">
                <iframe src="count.jsp" sandbox="allow-scripts allow-same-origin allow-forms" style="height: 35px;width: 28px;">
                </iframe>
            </div>
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
            <iframe src="http://jogjastreamers.com/masdha-fm.html" 
                    title="MasdhaFM" style="background-image:url(Images/Masdha.png)" sandbox="allow-same-origin allow-scripts"
                    height="0" width="0" scrolling="no" hidden="">
            </iframe>
        </div>
        <div id="div4" class="wew4" style="background-color: transparent;">
            <cite><h1>Our Programs</h1></cite>
            <h4>Acara Reguler (Senin - jumat)</h4>
            <ol>
                <li>Jogging Show
                    <ul><li>Waktu : 06.00 - 08.00</ul>
                <li>Jogging Hits
                    <ul><li>Waktu : 08.00 - 09.00</ul>
                <li>Kopi Masdha (Koran Pagi Masdha)
                    <ul><li>Waktu : 09.00 - 11.00</ul>
                <li>Beringin (Berita Ringan dan Unik)
                    <ul><li>Waktu : 11.00 - 13.00</ul>
                <li>Serasi (Sejenak Rehat Siang)
                    <ul><li>Waktu : 13.00 - 15.00</ul>
                <li>Distro (Dunia Selebriti Tersohor)
                    <ul><li>Waktu : 15.00 - 17.00</ul>
                <li>international Area 
                    <ul><li>Waktu : 17.00 - 19.00</ul>
                <li>Samari (Sapa Malam Hari)
                    <ul><li>Waktu : 19.00 - 21.00</ul>
                <li>Kotak Mimpi
                    <ul><li>Waktu : 21.00 - 00.00</ul>
            </ol>
            <h4>Acara Non-Reguler I (Special Friday)</h4>
            <ol>
                <li>Wawasan (Wawancara Setiap Jumat Siang)
                    <ul><li>Waktu : 15.00 - 17.00</ul>
                <li>International Area Special Friday
                    <ul><li>Waktu : 17.00 - 19.00</ul>
                <li>Samari Special Friday
                    <ul><li>Waktu : 19.00 - 21.00</ul>
                <li>Gubuk (Gurauan Buka - Bukaan)
                    <ul><li>Waktu : 21.00 - 00.00</ul>
            </ol>
            </div>
            <div id="div5" class="wew5" style="background-color: transparent;">
                <br><br><br>
            <h4>Acara Non-Reguler II (Special Saturday)</h4>    
            <ol>
                <li>Hot Spot Area
                    <ul><li>Waktu : 08.00 - 10.00</ul>
                <li>Cinescreen
                    <ul><li>Waktu : 10.00 - 12.00</ul>
                <li>Jamur (Jalan - Jalan Murah)
                    <ul><li>Waktu : 12.00 - 14.00</ul>
                <li>Lentera Sobat Muda
                    <ul><li>Waktu : 14.00 - 16.00</ul>
                <li>Indienesia
                    <ul><li>Waktu : 16.00 - 18.00</ul>
                <li>Double Date
                    <ul><li>Waktu : 18.00 - 21.00</ul>
                <li>ThreeSome
                    <ul><li>Waktu : 12.00 - 00.00</ul>
            </ol>
            <h4>Acara Non-Reguler III (Special Sunday)</h4>
            <ol>
                <li>Sunday Morning
                    <ul><li>Waktu : 07.00 - 09.00</ul>
                <li>Asian Baguse
                    <ul><li>Waktu : 09.00 - 11.00</ul>
                <li>SST (Sunday Spare Time)
                    <ul><li>Waktu : 11.00 - 13.00</ul>
                <li>95 Top 9
                    <ul><li>Waktu : 13.00 - 14.00</ul>
                <li>MMH (Masdha Most Hits)
                    <ul><li>Waktu : 14.00 - 16.00</ul>
                <li>Musicography
                    <ul><li>Waktu : 16.00 - 18.00</ul>
                <li>Relax
                    <ul><li>Waktu : 18.00 - 21.00</ul>
                <li>Slow Rock Night
                    <ul><li>Waktu : 21.00 - 00.00</ul>
            </ol>
        </div>
        <footer id="footer" class="footer1"></footer>
        <script src="assets/js/jquery.min.js"></script>
        <script src="assets/bootstrap/js/bootstrap.min.js"></script>
    </body>

</html>