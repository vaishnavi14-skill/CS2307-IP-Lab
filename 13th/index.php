<!DOCTYPE html>
<html>
<head>
<title>Library - Book List</title>
<style>
{
margin: 0;
padding: 0;
box-sizing: border-box;
}
body {
font-family: Arial, sans-serif;
min-height: 100vh;
background-image: linear-gradient(rgba(0,0,0,0.55), rgba(0,0,0,0.55)), url("https://images.unsplash.com/photo-1507842217343-583bb7270b66");
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
width: 80%;
max-width: 900px;
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
<h2>Library Book Details</h2>
<?php
$xml = simplexml_load_file("books.xml") or die("Error: Cannot load XML file.");
echo "<table>";
echo "<tr>";
echo "<th>Title</th>";
echo "<th>Author</th>";
echo "<th>Year</th>";
echo "<th>Price</th>";
echo "</tr>";
foreach ($xml->book as $book) {
echo "<tr>";
echo "<td>" . $book->title . "</td>";
echo "<td>" . $book->author . "</td>";
echo "<td>" . $book->year . "</td>";
echo "<td>$" . $book->price . "</td>";
echo "</tr>";
}
echo "</table>";
?>
</div>
</body>
</html>
