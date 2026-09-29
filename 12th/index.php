<!DOCTYPE html>
<html>
<head>
<title>Tamil Movies - Movie List</title>
<style>
* {
margin: 0;
padding: 0;
box-sizing: border-box;
}
body {
font-family: Arial, sans-serif;
min-height: 100vh;
background-image: url("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRh5DRqvQ6bVxnYG9j2V8RIc20pMgDYKiQgZoGmXkJ60Q&s=10");
background-size: cover;
background-position: center;
background-repeat: no-repeat;
display: flex;
justify-content: center;
align-items: center;
}
.container {
text-align: center;
background: rgba(255,255,255,0.95);
padding: 30px;
border-radius: 15px;
width: 90%;
max-width: 1000px;
}
h2 {
margin-bottom: 25px;
color: #333;
font-size: 30px;
}
table {
margin: auto;
border-collapse: collapse;
width: 100%;
}
th {
background-color: #333;
color: white;
padding: 12px;
}
td {
padding: 10px;
text-align: center;
border: 1px solid #999;
}
tr:nth-child(even) {
background-color: #f2f2f2;
}
tr:nth-child(odd) {
background-color: white;
}
</style>
</head>
<body>

<div class="container">

<h2>Tamil Movie Details</h2>

<?php

$xml = simplexml_load_file("movies.xml") or die("Error: Cannot load XML file.");

echo "<table>";

echo "<tr>";
echo "<th>Movie Name</th>";
echo "<th>Actor</th>";
echo "<th>Director</th>";
echo "<th>Year</th>";
echo "<th>Rating</th>";
echo "</tr>";

foreach ($xml->movie as $movie) {

echo "<tr>";

echo "<td>" . $movie->title . "</td>";

echo "<td>" . $movie->actor . "</td>";

echo "<td>" . $movie->director . "</td>";

echo "<td>" . $movie->year . "</td>";

echo "<td>" . $movie->rating . "</td>";

echo "</tr>";

}

echo "</table>";

?>

</div>

</body>
</html>