<?php
$conn = mysqli_connect("localhost", "root", "", "shopsphere");
if (!$conn) {
die("Database connection failed: " . mysqli_connect_error());
}
$sql = "SELECT * FROM orders ORDER BY id DESC";
$result = mysqli_query($conn, $sql);
?>
<!DOCTYPE html>
<html>
<head>
<title>ShopSphere | Orders</title>
<style>
* {
margin: 0;
padding: 0;
box-sizing: border-box;
}
body {
font-family: Arial, Helvetica, sans-serif;
background: linear-gradient(135deg, #eef2ff, #fdf2f8, #ecfeff);
min-height: 100vh;
padding: 30px;
}
.header {
background: linear-gradient(135deg, #312e81, #6d28d9, #9333ea);
color: white;
padding: 22px;
text-align: center;
border-radius: 15px;
box-shadow: 0 5px 18px rgba(0,0,0,0.18);
}
.header h1 {
font-size: 30px;
}
.container {
width: 95%;
max-width: 1200px;
margin: 25px auto;
}
.card {
background: white;
border-radius: 15px;
overflow-x: auto;
box-shadow: 0 8px 25px rgba(0,0,0,0.10);
}
table {
width: 100%;
border-collapse: collapse;
}
th {
background: linear-gradient(135deg, #4f46e5, #7c3aed);
color: white;
padding: 12px;
font-size: 14px;
}
td {
text-align: center;
padding: 11px;
font-size: 14px;
border-bottom: 1px solid #e5e7eb;
}
tr:hover {
background: #f5f3ff;
}
.total {
font-weight: bold;
color: #16a34a;
}
.btn {
display: inline-block;
margin-top: 20px;
padding: 12px 20px;
background: linear-gradient(135deg, #4f46e5, #9333ea);
color: white;
text-decoration: none;
border-radius: 8px;
font-weight: bold;
}
</style>
</head>
<body>
<div class="header">
<h1>ShopSphere</h1>
<p>All Placed Orders</p>
</div>
<div class="container">
<div class="card">
<table>
<tr>
<th>Order ID</th>
<th>Customer Name</th>
<th>Phone</th>
<th>Email</th>
<th>Product</th>
<th>Units</th>
<th>Price / Unit</th>
<th>District</th>
<th>Total</th>
<th>Order Date</th>
</tr>
<?php
if (mysqli_num_rows($result) > 0) {
while ($row = mysqli_fetch_assoc($result)) {
?>
<tr>
<td><?php echo $row["id"]; ?></td>
<td><?php echo $row["full_name"]; ?></td>
<td><?php echo $row["phone"]; ?></td>
<td><?php echo $row["email"]; ?></td>
<td><?php echo $row["product"]; ?></td>
<td><?php echo $row["units"]; ?></td>
<td>₹<?php echo $row["price"]; ?></td>
<td><?php echo $row["district"]; ?></td>
<td class="total">₹<?php echo $row["total"]; ?></td>
<td><?php echo $row["order_date"]; ?></td>
</tr>
<?php
}
} else {
echo "<tr><td colspan='10'>No orders found</td></tr>";
}
?>
</table>
</div>
<a href="index.php" class="btn">Place Another Order</a>
</div>
</body>
</html>
<?php
mysqli_close($conn);
?>