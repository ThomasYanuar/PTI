<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
   <script>
 function autoRefresh_div()
 {
      $("#result").load("load.html");// a function which will load data from other file after x seconds
  }
 
  setInterval('autoRefresh_div()', 5000); // refresh div after 5 secs
            </script>