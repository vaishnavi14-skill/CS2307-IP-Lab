<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ page import="java.util.List" %>

<%@ page import="com.shopping.model.Order" %>

<%@ page import="com.shopping.dao.OrderDAO" %>


<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<meta name="viewport"
      content="width=device-width, initial-scale=1.0">

<title>ShopSphere | Orders</title>


<style>

*{

    margin:0;

    padding:0;

    box-sizing:border-box;
}


body{

    font-family:
    Arial, Helvetica, sans-serif;

    background:
    linear-gradient(
        135deg,
        #eef2ff,
        #fdf4ff,
        #ecfeff
    );

    min-height:100vh;
}


/* HEADER */

.header{

    background:
    linear-gradient(
        135deg,
        #312e81,
        #7c3aed,
        #9333ea
    );

    padding:35px;

    text-align:center;

    color:white;

    box-shadow:
    0 5px 20px
    rgba(0,0,0,0.2);
}


.header h1{

    font-size:36px;
}


.header p{

    margin-top:8px;

    opacity:0.9;
}


/* CONTAINER */

.container{

    width:95%;

    max-width:1400px;

    margin:auto;

    padding:45px 0;
}


/* SUCCESS */

.success-box{

    background:
    linear-gradient(
        135deg,
        #dcfce7,
        #f0fdf4
    );

    color:#15803d;

    padding:18px;

    border-radius:15px;

    text-align:center;

    font-size:17px;

    font-weight:bold;

    margin-bottom:30px;

    box-shadow:
    0 5px 15px
    rgba(34,197,94,0.15);
}


/* TITLE */

.top-section{

    display:flex;

    justify-content:space-between;

    align-items:center;

    margin-bottom:25px;
}


.top-section h2{

    color:#312e81;

    font-size:30px;
}


/* BUTTON */

.order-btn{

    text-decoration:none;

    background:
    linear-gradient(
        135deg,
        #4f46e5,
        #9333ea
    );

    color:white;

    padding:13px 20px;

    border-radius:10px;

    font-weight:bold;

    transition:0.3s;
}


.order-btn:hover{

    transform:
    translateY(-3px);

    box-shadow:
    0 8px 20px
    rgba(79,70,229,0.3);
}


/* TABLE CARD */

.table-card{

    background:white;

    border-radius:20px;

    overflow:auto;

    box-shadow:
    0 15px 40px
    rgba(0,0,0,0.12);
}


table{

    width:100%;

    border-collapse:collapse;

    min-width:1100px;
}


th{

    background:
    linear-gradient(
        135deg,
        #4f46e5,
        #7c3aed
    );

    color:white;

    padding:17px;

    text-align:center;

    font-size:15px;

    white-space:nowrap;
}


td{

    padding:15px;

    text-align:center;

    border-bottom:
    1px solid #e5e7eb;

    color:#374151;
}


tr:hover{

    background:#f5f3ff;

    transition:0.2s;
}


.amount{

    color:#16a34a;

    font-weight:bold;
}


.product{

    font-weight:bold;

    color:#4f46e5;
}


.badge{

    display:inline-block;

    padding:6px 12px;

    background:#ede9fe;

    color:#6d28d9;

    border-radius:20px;

    font-weight:bold;
}


/* FOOTER */

.footer{

    text-align:center;

    padding:25px;

    color:#6b7280;
}


@media(max-width:700px){

    .top-section{

        flex-direction:column;

        gap:20px;
    }

}

</style>

</head>


<body>


<div class="header">

<h1>📦 ShopSphere Orders</h1>

<p>Your Smart Shopping History</p>

</div>



<div class="container">


<%
String status = request.getParameter("status");

if("success".equals(status)){
%>

<div class="success-box">

🎉 Order Successfully Placed!
Your order has been saved in MySQL Database.

</div>

<%
}
%>



<div class="top-section">

<h2>📋 All Customer Orders</h2>


<a
href="orderForm.jsp"
class="order-btn">

➕ Place New Order

</a>

</div>



<div class="table-card">


<table>


<tr>

<th>Order ID</th>

<th>Customer</th>

<th>Phone</th>

<th>Email</th>

<th>Product</th>

<th>Units</th>

<th>Price / Unit</th>

<th>Total Amount</th>

<th>District</th>

<th>Order Date</th>

</tr>


<%

OrderDAO dao = new OrderDAO();

List<Order> orders =
        dao.getAllOrders();


for(Order o : orders){

%>


<tr>


<td>

<span class="badge">

#<%= o.getOrderId() %>

</span>

</td>


<td>

<%= o.getCustomerName() %>

</td>


<td>

<%= o.getPhone() %>

</td>


<td>

<%= o.getEmail() %>

</td>


<td class="product">

<%= o.getProductName() %>

</td>


<td>

<%= o.getQuantity() %>

</td>


<td class="amount">

₹ <%= o.getPrice() %>

</td>


<td class="amount">

₹ <%= o.getTotalAmount() %>

</td>


<td>

📍 <%= o.getDistrict() %>

</td>


<td>

<%= o.getOrderDate() %>

</td>


</tr>


<%

}

%>


</table>


</div>


</div>


<div class="footer">

© 2026 ShopSphere | JSP • Servlet • JDBC • MySQL

</div>


</body>

</html>