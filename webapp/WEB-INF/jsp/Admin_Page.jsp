<!DOCTYPE html>
<html>
<head>
<title> SYNK AGROTECH </title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Karma">
<style>
body,h1,h2,h3,h4,h5,h6 {font-family: "Karma", sans-serif}
.w3-bar-block .w3-bar-item {padding:20px}
</style>
</head>
<body>
<fieldset>
<!-- Sidebar (hidden by default) -->
<nav class="w3-sidebar w3-bar-block w3-card w3-top w3-xlarge w3-animate-left" style="display:none;z-index:2;width:20%;" id="mySidebar">
  <a href="Home_Page.html" onclick="w3_close()"class="w3-bar-item w3-button"> Home  </a>
  <a href="Registration.html" onclick="w3_close()" class="w3-bar-item w3-button">Registration</a>
  <a href="Admin_Login.html" onclick="w3_close()" class="w3-bar-item w3-button">Login</a>
  <a href="Products.html" onclick="w3_close()" class="w3-bar-item w3-button">Products</a>
  <a href="javascript:void(0)" onclick="w3_close()"
  class="w3-bar-item w3-button">Close </a>
</nav>

<!-- Top menu -->
<div class="w3-top">
  <div class="w3-white w3-xlarge" style="max-width:1400px; margin:auto">
    <div class="w3-button w3-padding-16 w3-left" onclick="w3_open()"> <img src="/Triple.jpg" alt="Triple" style="width:60px;"> </div>
    <div class="w3-button w3-padding-16 w3-right" onclick="w3_open()"> <a href="Cart.html"> <img src="/Cart.jpg" alt="Cart" style="width:60px;"> </a> </div>
    <h1> <marquee width = "70%"> <div class="w3-center w3-padding-16" style="color:green;font-family:Fantasy;"> SYNK AGROTECH </div></marquee></h1>
    
  </div>
</div>
  <fieldset >
<!-- !PAGE CONTENT! -->
<div class="w3-main w3-content w3-padding" style="max-width:1200px;margin-top:100px">
<h1 style="text-align:center;">  Admin Page </h1>
<h3><a href=" "> Add Suppliers </a></h3>
<h3><a href=" "> Remove Suppliers </a></h3>
<h3><a href=" "> Show Products </a></h3>
<h3><a href=" "> Maintain Products Price </a></h3>
<h3><a href=" "> Show Payment Transactions </a></h3>
  </div>
  </fieldset>
  
  <h3><div class="w3-button w3-padding-16 w3-right" onclick="history.back()"> Back </div> </a> </h3> 
  
  <!-- Footer -->
  <footer class="w3-row-padding w3-padding-32">
    <div class="w3-third">
      <h3>CONTACT US</h3>
      <p>Aundh,Pune</p>
      <p>synkagrotech7@gmail.com<p>
      <p><a href="https://en.wikipedia.org/wiki/All_rights_reserved" target="_blank">©2022 SYNK AGROTECH.All Rights Reserved.</a></p>
    </div> 
  
    <div class="w3-third">
      <h3>BLOG POSTS</h3>
      <ul class="w3-ul w3-hoverable">
        <li class="w3-padding-16">
          <img src="/Raddish.jpg" class="w3-left w3-margin-right" style="width:100px">
          <span class="w3-large">Raddish</span><br>
          <span>Radishes are rich in antioxidants and minerals like calcium and potassium.
           Together, these nutrients help lower high blood pressure and reduce your risks for heart disease.
           </span>
        </li>
        <li class="w3-padding-16">
          <img src="/Pineapple.jpg" class="w3-left w3-margin-right" style="width:70px">
          <span class="w3-large">Pineapple</span><br>
          <span>Pineapple Is a Fruit That’s Rich in Vitamin C.
          The Manganese in Pineapple Promotes Healthy Bones.It has Cancer-Fighting Properties.</span>
        </li> 
      </ul>
    </div>

    <div class="w3-third w3-serif">
      <h3>POPULAR TAGS</h3>
      <p>
        <span class="w3-tag w3-black w3-margin-bottom"><a href="Vegetables.html"> Tomatoes </a></span> <span class="w3-tag w3-black w3-margin-bottom"><a href="Vegetables.html"> Cabbage </a></span> <span class="w3-tag w3-black w3-margin-bottom"><a href="Fertilizers.html"> Carrots Fertilizer</a></span>
        <span class="w3-tag w3-black w3-margin-bottom"><a href="Fruits.html"> Watermellon </a></span> <span class="w3-tag w3-black w3-margin-bottom"><a href="Vegetables.html"> Brinjal </a></span> <span class="w3-tag w3-black w3-margin-bottom"><a href="Fruits.html"> Mangoes </a></span>
        <span class="w3-tag w3-black w3-margin-bottom"><a href="Vegetables.html"> Carrots </a></span> <span class="w3-tag w3-black w3-margin-bottom"><a href="Fertilizers.html"> Tomato Fertilizer </a></span> <span class="w3-tag w3-black w3-margin-bottom"><a href="Fruits.html"> Chikoo </a></span>
        <span class="w3-tag w3-black w3-margin-bottom"><a href="Fertilizers.html"> Cabbage Fertilizer </a></span> <span class="w3-tag w3-black w3-margin-bottom"><a href="Fruits.html"> Apples </a></span> <span class="w3-tag w3-black w3-margin-bottom"><a href="Fertilizers.html"> Brinjal Fertilizer</a></span>
        <span class="w3-tag w3-black w3-margin-bottom"><a href="Fruits.html"> Grapes </a></span> <span class="w3-tag w3-black w3-margin-bottom"><a href="Fruits.html">Oranges </a></span> <span class="w3-tag w3-black w3-margin-bottom"><a href="Fertilizers.html"> Urea </a></span>
      </p>
    </div>
  </footer>


<!-- End page content -->
</div>

<script>
// Script to open and close sidebar
function w3_open() {
  document.getElementById("mySidebar").style.display = "block";
}
 
function w3_close() {
  document.getElementById("mySidebar").style.display = "none";
}
</script>
</fieldset>
</body>
</html>

