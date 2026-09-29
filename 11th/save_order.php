<?php
$conn = mysqli_connect("localhost", "root", "", "shopsphere");
if (!$conn) {
die("Database connection failed: " . mysqli_connect_error());
}
$full_name = $_POST["full_name"];
$phone = $_POST["phone"];
$email = $_POST["email"];
$product = $_POST["product"];
$units = $_POST["units"];
$price = $_POST["price"];
$district = $_POST["district"];
$total = $units * $price;
$sql = "INSERT INTO orders (full_name, phone, email, product, units, price, district, total)
VALUES ('$full_name', '$phone', '$email', '$product', '$units', '$price', '$district', '$total')";
if (mysqli_query($conn, $sql)) {
header("Location: orders.php");
exit();
} else {
echo "Error: " . mysqli_error($conn);
}
mysqli_close($conn);
?>