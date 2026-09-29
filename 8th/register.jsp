<%@ page language="java" 
contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<title>Registration Successful</title>
<style>
body{
    font-family:Arial,sans-serif;
    background:url("https://t4.ftcdn.net/jpg/13/87/87/85/360_F_1387878547_U3djpI3zLI51eyPqJ9QIoeqrrL7NzG4U.jpg") no-repeat center center fixed;
    background-size:cover;
    margin:0;
    padding:40px;
}
.details-container{
    width:550px;
    margin:auto;
    background:rgba(255,255,255,0.95);
    padding:30px;
    border-radius:15px;
    box-shadow:0 10px 25px rgba(0,0,0,.3);
}
h2{
    text-align:center;
    color:#2d6cdf;
}
table{
    width:100%;
    border-collapse:collapse;
    margin-top:20px;
}
td{
    padding:12px;
    border-bottom:1px solid #ddd;
}
td.label{
    font-weight:bold;
    width:45%;
    color:#333;
}
.back-btn{
    display:block;
    text-align:center;
    margin-top:25px;
    padding:12px;
    background:#2d6cdf;
    color:white;
    text-decoration:none;
    border-radius:6px;
}
.back-btn:hover{
    background:#1e54b7;
}
</style>
</head>
<body>
<%
String username = request.getParameter("username");
String fullName = request.getParameter("fullName");
String name = request.getParameter("name");
String email = request.getParameter("email");
String phone = request.getParameter("phone");
String password = request.getParameter("password");
String ccnumber = request.getParameter("ccnumber");
String gender = request.getParameter("gender");
String dob = request.getParameter("dob");
String qualification = request.getParameter("qualification");
String jobTitle = request.getParameter("jobTitle");
String experience = request.getParameter("experience");
String skills = request.getParameter("skills");
String resumeLink = request.getParameter("resumeLink");
%>
<div class="details-container">
<h2>Registration Successful!</h2>
<table>
<tr>
<td class="label">User Name</td>
<td><%= username %></td>
</tr>
<tr>
<td class="label">First Name</td>
<td><%= fullName %></td>
</tr>
<tr>
<td class="label">Last Name</td>
<td><%= name %></td>
</tr>
<tr>
<td class="label">Email</td>
<td><%= email %></td>
</tr>
<tr>
<td class="label">Phone Number</td>
<td><%= phone %></td>
</tr>
<tr>
<td class="label">Password</td>
<td><%= password %></td>
</tr>
<tr>
<td class="label">Credit Card Number</td>
<td><%= ccnumber %></td>
</tr>
<tr>
<td class="label">Gender</td>
<td><%= gender %></td>
</tr>


<tr>
<td class="label">Date of Birth</td>
<td><%= dob %></td>
</tr>
<tr>
<td class="label">Qualification</td>
<td><%= qualification %></td>
</tr>
<tr>
<td class="label">Desired Job Title</td>
<td><%= jobTitle %></td>
</tr>
<tr>
<td class="label">Years of Experience</td>
<td><%= experience %></td>
</tr>
<tr>
<td class="label">Skills</td>
<td><%= skills %></td>
</tr>
<tr>
<td class="label">LinkedIn ID</td>
<td><%= resumeLink %></td>
</tr>
</table>
<a href="registration.html" class="back-btn">
Back to Registration
</a>
</div>
</body>
</html>