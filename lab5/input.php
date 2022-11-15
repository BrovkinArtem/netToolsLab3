<?php
$counter2 = isset($_COOKIE['counter2']) ? $_COOKIE['counter2']:0; //тернарный оператор, работа с bool
$counter2++; //
setcookie("counter2",$counter2); //cookie должна быть перед hmlk`ой
if ($counter2==1){echo "привет, впервые? <br> заходи чаще :)";}else echo "ты был на моём сайте: ".$counter2. " раз <br> заглядывай почаще :)";
?>