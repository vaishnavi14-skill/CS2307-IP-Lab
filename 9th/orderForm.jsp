    <%@ page contentType="text/html;charset=UTF-8" language="java" %>

    <!DOCTYPE html>
    <html>

    <head>

    <meta charset="UTF-8">

    <meta name="viewport"
          content="width=device-width, initial-scale=1.0">

    <title>ShopSphere | Online Shopping</title>

<style>

*{
    margin:0;
    padding:0;
    box-sizing:border-box;
}

body{
    font-family:Arial, Helvetica, sans-serif;
    background:linear-gradient(135deg,#eef2ff,#fdf2f8,#ecfeff);
    min-height:100vh;
    color:#1f2937;
}

/* HEADER */

.header{
    background:linear-gradient(135deg,#312e81,#6d28d9,#9333ea);
    color:white;
    padding:22px;
    text-align:center;
    box-shadow:0 5px 18px rgba(0,0,0,0.18);
}

.header h1{
    font-size:32px;
    letter-spacing:1px;
}

.header p{
    margin-top:5px;
    font-size:14px;
    opacity:0.9;
}


/* MAIN CONTAINER */

.container{
    width:92%;
    max-width:1150px;
    margin:auto;
    padding:25px 0;
}


/* SECTION TITLE */

.section-title{
    text-align:center;
    margin-bottom:15px;
}

.section-title h2{
    font-size:26px;
    color:#312e81;
}

.section-title p{
    margin-top:5px;
    color:#6b7280;
    font-size:14px;
}


/* PRODUCT TABLE */

.product-box{
    background:white;
    border-radius:15px;
    overflow:hidden;
    box-shadow:0 8px 25px rgba(0,0,0,0.10);
    margin-bottom:25px;
}

table{
    width:100%;
    border-collapse:collapse;
}

th{
    background:linear-gradient(135deg,#4f46e5,#7c3aed);
    color:white;
    padding:9px;
    font-size:14px;
}

td{
    text-align:center;
    padding:7px;
    font-size:14px;
    border-bottom:1px solid #e5e7eb;
}

tr:hover{
    background:#f5f3ff;
}

.product-image{
    width:52px;
    height:52px;
    object-fit:cover;
    border-radius:10px;
    box-shadow:0 3px 8px rgba(0,0,0,0.12);
}

.price{
    font-weight:bold;
    color:#16a34a;
    font-size:15px;
}


/* FORM WRAPPER */

.form-wrapper{
    display:flex;
    justify-content:center;
}


/* ORDER CARD */

.order-card{
    width:520px;
    background:rgba(255,255,255,0.92);
    backdrop-filter:blur(10px);
    padding:25px 30px;
    border-radius:20px;
    box-shadow:0 10px 30px rgba(0,0,0,0.14);
    border:1px solid rgba(255,255,255,0.6);
}

.order-card h2{
    text-align:center;
    color:#4c1d95;
    margin-bottom:18px;
    font-size:25px;
}


/* FORM - ONE FIELD BELOW ANOTHER */

.form-grid{
    display:flex;
    flex-direction:column;
    gap:11px;
}

.form-group{
    display:flex;
    flex-direction:column;
}

.form-group label{
    font-weight:bold;
    margin-bottom:4px;
    color:#374151;
    font-size:14px;
}


/* INPUT */

input,
select{
    width:100%;
    padding:10px 12px;
    border-radius:8px;
    border:1px solid #d1d5db;
    outline:none;
    font-size:14px;
    transition:0.3s;
}

input:focus,
select:focus{
    border-color:#7c3aed;
    box-shadow:0 0 0 2px rgba(124,58,237,0.12);
}


/* TOTAL */

.total-box{
    background:linear-gradient(135deg,#ede9fe,#f5f3ff);
    padding:12px;
    border-radius:10px;
    text-align:center;
    margin-top:2px;
}

.total-box label{
    font-size:15px;
    font-weight:bold;
}

#totalAmount{
    margin-top:3px;
    font-size:22px;
    font-weight:bold;
    color:#16a34a;
    border:none;
    background:transparent;
    text-align:center;
}


/* BUTTON */

.submit-btn{
    border:none;
    padding:12px;
    font-size:15px;
    font-weight:bold;
    color:white;
    border-radius:9px;
    cursor:pointer;
    background:linear-gradient(135deg,#4f46e5,#9333ea);
    transition:0.3s;
    box-shadow:0 5px 12px rgba(79,70,229,0.25);
}

.submit-btn:hover{
    transform:translateY(-2px);
    box-shadow:0 8px 18px rgba(79,70,229,0.35);
}


/* ALERT */

.alert{
    padding:10px;
    margin-bottom:12px;
    border-radius:8px;
    text-align:center;
    font-weight:bold;
    font-size:14px;
}

.error{
    background:#fee2e2;
    color:#dc2626;
}


/* FOOTER */

.footer{
    text-align:center;
    padding:18px;
    color:#6b7280;
    font-size:13px;
}


/* MOBILE */

@media(max-width:700px){

    .container{
        width:95%;
    }

    .order-card{
        width:100%;
        padding:20px;
    }

    table{
        font-size:11px;
    }

    th,
    td{
        padding:5px;
    }

    .product-image{
        width:42px;
        height:42px;
    }
}

</style>
    

</head>


<body>


<div class="header">

    <h1>🛍 ShopSphere</h1>

    <p>Smart Shopping • Better Choices • Faster Orders</p>

</div>


<div class="container">


<!-- PRODUCTS -->

<div class="section-title">

    <h2>✨ Explore Our Products</h2>

    <p>Select your favourite product and place your order below</p>

</div>


<div class="product-box">

<table>

<tr>

<th>Product Image</th>

<th>Product Name</th>

<th>Category</th>

<th>Price / Unit</th>

</tr>


<tr>

<td>
<img class="product-image"
src="https://images.unsplash.com/photo-1505740420928-5e560c06d30e?auto=format&fit=crop&w=200&q=80">
</td>

<td>Wireless Headphones</td>

<td>Electronics</td>

<td class="price">₹1499</td>

</tr>


<tr>

<td>
<img class="product-image"
src="https://images.unsplash.com/photo-1523275335684-37898b6baf30?auto=format&fit=crop&w=200&q=80">
</td>

<td>Smart Watch</td>

<td>Electronics</td>

<td class="price">₹2499</td>

</tr>


<tr>

<td>
<img class="product-image"
src="https://images.unsplash.com/photo-1527814050087-3793815479db?auto=format&fit=crop&w=200&q=80">
</td>

<td>Gaming Keyboard</td>

<td>Accessories</td>

<td class="price">₹1899</td>

</tr>


<tr>

<td>
<img class="product-image"
src="https://images.unsplash.com/photo-1527864550417-7fd91fc51a46?auto=format&fit=crop&w=200&q=80">
</td>

<td>Gaming Mouse</td>

<td>Accessories</td>

<td class="price">₹799</td>

</tr>


<tr>

<td>
<img class="product-image"
src="https://images.unsplash.com/photo-1542291026-7eec264c27ff?auto=format&fit=crop&w=200&q=80">
</td>

<td>Running Shoes</td>

<td>Fashion</td>

<td class="price">₹2999</td>

</tr>


<tr>

<td>
<img class="product-image"
src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSOC2zqHTBZcxnYy3DmYrcCQdDP1aCreKZphzwNOlgH3Q&s">
</td>

<td>Premium Backpack</td>

<td>Fashion</td>

<td class="price">₹1299</td>

</tr>


<tr>

<td>
<img class="product-image"
src="https://images.unsplash.com/photo-1596462502278-27bfdc403348?auto=format&fit=crop&w=200&q=80">
</td>

<td>Skincare Kit</td>

<td>Beauty</td>

<td class="price">₹999</td>

</tr>


<tr>

<td>
<img class="product-image"
src="https://images.unsplash.com/photo-1600185365483-26d7a4cc7519?auto=format&fit=crop&w=200&q=80">
</td>

<td>Casual Sneakers</td>

<td>Footwear</td>

<td class="price">₹2199</td>

</tr>


<tr>

<td>
<img class="product-image"
src="https://images.unsplash.com/photo-1503602642458-232111445657?auto=format&fit=crop&w=200&q=80">
</td>

<td>Study Chair</td>

<td>Furniture</td>

<td class="price">₹4599</td>

</tr>


<tr>

<td>
<img class="product-image"
src="https://images.unsplash.com/photo-1494438639946-1ebd1d20bf85?auto=format&fit=crop&w=200&q=80">
</td>

<td>Desk Lamp</td>

<td>Home Decor</td>

<td class="price">₹899</td>

</tr>

</table>

</div>



<!-- ORDER FORM -->

<div class="form-wrapper">


<div class="order-card">

<h2>📦 Place Your Order</h2>


<%
String status = request.getParameter("status");

if("failed".equals(status) || "error".equals(status)){
%>

<div class="alert error">

❌ Order Failed! Please check database connection and try again.

</div>

<%
}
%>


<form action="AddOrderServlet" method="post">


<div class="form-grid">


<!-- NAME -->

<div class="form-group">

<label>👤 Full Name</label>

<input
type="text"
name="customerName"
placeholder="Enter your name"
required>

</div>



<!-- PHONE -->

<div class="form-group">

<label>📱 Phone Number</label>

<input
type="tel"
name="phone"
pattern="[0-9]{10}"
placeholder="10 digit phone number"
required>

</div>



<!-- EMAIL -->

<div class="form-group">

<label>📧 Email Address</label>

<input
type="email"
name="email"
placeholder="Enter your email"
required>

</div>



<!-- PRODUCT -->

<div class="form-group">

<label>🛍 Select Product</label>

<select
name="productName"
id="productName"
onchange="updatePrice()"
required>

<option value="">-- Select Product --</option>

<option value="Wireless Headphones" data-price="1499">
Wireless Headphones
</option>

<option value="Smart Watch" data-price="2499">
Smart Watch
</option>

<option value="Gaming Keyboard" data-price="1899">
Gaming Keyboard
</option>

<option value="Gaming Mouse" data-price="799">
Gaming Mouse
</option>

<option value="Running Shoes" data-price="2999">
Running Shoes
</option>

<option value="Premium Backpack" data-price="1299">
Premium Backpack
</option>

<option value="Skincare Kit" data-price="999">
Skincare Kit
</option>

<option value="Casual Sneakers" data-price="2199">
Casual Sneakers
</option>

<option value="Study Chair" data-price="4599">
Study Chair
</option>

<option value="Desk Lamp" data-price="899">
Desk Lamp
</option>

</select>

</div>



<!-- QUANTITY -->

<div class="form-group">

<label>🔢 Number of Units</label>

<input
type="number"
name="quantity"
id="quantity"
min="1"
value="1"
oninput="calculateTotal()"
required>

</div>



<!-- PRICE -->

<div class="form-group">

<label>💰 Price Per Unit</label>

<input
type="number"
name="price"
id="price"
readonly
required>

</div>



<!-- DISTRICT -->

<div class="form-group">

<label>📍 Select District</label>

<select
name="district"
required>

<option value="">-- Select District --</option>

<option>Chennai</option>

<option>Madurai</option>

<option>Coimbatore</option>

<option>Trichy</option>

<option>Salem</option>

<option>Tirunelveli</option>

<option>Thoothukudi</option>

<option>Virudhunagar</option>

<option>Sivakasi</option>

<option>Vellore</option>

<option>Erode</option>

<option>Thanjavur</option>

<option>Ramanathapuram</option>

<option>Kanyakumari</option>

</select>

</div>



<!-- TOTAL -->

<div class="total-box">

<label>🧮 Total Amount</label>

<br>

<input
type="text"
id="totalAmount"
readonly
value="₹0">

</div>



<!-- SUBMIT -->

<button
type="submit"
class="submit-btn">

🚀 PLACE ORDER

</button>


</div>


</form>


</div>

</div>


</div>


<div class="footer">

© 2026 ShopSphere | Smart Online Shopping System

</div>



<script>


function updatePrice(){

    var product =
        document.getElementById("productName");

    var selectedOption =
        product.options[
            product.selectedIndex
        ];

    var price =
        selectedOption.getAttribute(
            "data-price"
        );

    document
    .getElementById("price")
    .value = price || "";

    calculateTotal();
}



function calculateTotal(){

    var price =
        parseFloat(
            document
            .getElementById("price")
            .value
        ) || 0;


    var quantity =
        parseInt(
            document
            .getElementById("quantity")
            .value
        ) || 0;


    var total =
        price * quantity;


    document
    .getElementById("totalAmount")
    .value =
        "₹" + total.toFixed(2);
}


</script>


</body>

</html>