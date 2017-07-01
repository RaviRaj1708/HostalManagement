<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>


<style>
div.container {
    width: 100%;
    border: 1px solid gray;
}

header, footer {
    padding: 1em;
    color: white;
    background-color: black;
    clear: left;
    text-align: center;
}

nav {
    float: left;
    max-width: 160px;
    margin: 0;
    padding: 1em;
}

nav ul {
    list-style-type: none;
    padding: 0;
}
   
nav ul a {
    text-decoration: none;
}

article {
    margin-left: 170px;
    border-left: 1px solid gray;
    padding: 1em;
    overflow: hidden;
}

.vertical-menu {
    width: 160px;
}

.vertical-menu a {
    background-color: #eee;
    color: black;
    display: block;
    padding: 12px;
    text-decoration: none;
}

.vertical-menu a:hover {
    background-color: #ccc;
}

.vertical-menu a.active {
    background-color: #4CAF50;
    color: white;
}
.ver{
padding-bottom: 25px;

}






</style>


</head>
<body>
<body>

<div class="container">

<header>
   <h1>Hostals Details</h1>
</header>
  
<nav>
  <div class="vertical-menu">
  <a href="#" class="active">Home</a>
 <div class="ver"> <a href="#">All Hostal</a></div>
 <div class="ver"> <a href="#">Girls Hostal</a></div>
  <div class="ver"><a href="#">Boy Hostal</a></div>
</div>

</nav>

<article>
  <marquee>
  <img src="image/img1.jpeg" alt="Smiley face" width="400" height="400"/>
  <img src="image/img3.jpeg" alt="Smiley face" width="400" height="400"/>
  <img src="image/img4.jpeg" alt="Smiley face" width="400" height="400"/>
  </marquee>
</article>


</div>


</body>
</html>