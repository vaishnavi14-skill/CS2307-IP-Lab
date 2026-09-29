<?php

if ($_SERVER["REQUEST_METHOD"] == "POST") {

    // Get form values
    $username = trim($_POST["username"]);
    $fullName = trim($_POST["fullName"]);
    $name = trim($_POST["name"]);
    $email = trim($_POST["email"]);
    $phone = trim($_POST["phone"]);
    $password = $_POST["password"];
    $ccnumber = trim($_POST["ccnumber"]);
    $gender = $_POST["gender"];
    $dob = $_POST["dob"];
    $qualification = $_POST["qualification"];
    $jobTitle = trim($_POST["jobTitle"]);
    $experience = $_POST["experience"];
    $skills = trim($_POST["skills"]);
    $resumeLink = trim($_POST["resumeLink"]);

    $errors = array();


    // Username validation
    if ($username == "") {
        $errors[] = "Username is required.";
    }


    // First Name validation
    if ($fullName == "") {
        $errors[] = "First name is required.";
    }


    // Last Name validation
    if ($name == "") {
        $errors[] = "Last name is required.";
    }


    // Email validation
    if ($email == "") {
        $errors[] = "Email is required.";
    }
    else if (!filter_var($email, FILTER_VALIDATE_EMAIL)) {
        $errors[] = "Please enter a valid email.";
    }


    // Phone validation
    if ($phone == "") {
        $errors[] = "Phone number is required.";
    }
    else if (!preg_match("/^[0-9]{10}$/", $phone)) {
        $errors[] = "Enter a valid 10 digit phone number.";
    }


    // Password validation
    if ($password == "") {
        $errors[] = "Password is required.";
    }
    else if (strlen($password) < 6) {
        $errors[] = "Password must be at least 6 characters.";
    }


    // Credit Card validation
    if ($ccnumber == "") {
        $errors[] = "Credit card number is required.";
    }
    else if (!preg_match("/^[0-9]{13,19}$/", $ccnumber)) {
        $errors[] = "Enter valid credit card number (13-19 digits).";
    }


    // Job Title validation
    if ($jobTitle == "") {
        $errors[] = "Desired job title is required.";
    }


    // Experience validation
    if ($experience == "" || $experience < 0) {
        $errors[] = "Enter valid experience.";
    }


    // LinkedIn validation
    if ($resumeLink == "") {
        $errors[] = "LinkedIn ID is required.";
    }


    // If validation fails
    if (count($errors) > 0) {

?>

<!DOCTYPE html>
<html>
<head>

<title>Registration Failed</title>

<style>

body{
    font-family:Arial,sans-serif;
    background:#f2f5fa;
    display:flex;
    justify-content:center;
    padding-top:100px;
}

.box{
    width:430px;
    background:white;
    padding:30px;
    border-radius:15px;
    box-shadow:0 10px 25px rgba(0,0,0,.2);
    text-align:center;
}

h2{
    color:red;
}

.error{
    color:red;
    margin:8px;
}

a{
    display:inline-block;
    margin-top:20px;
    padding:10px 20px;
    background:#2d6cdf;
    color:white;
    text-decoration:none;
    border-radius:6px;
}

a:hover{
    background:#1e54b7;
}

</style>

</head>

<body>

<div class="box">

<h2>Registration Failed</h2>

<?php

foreach ($errors as $error) {
    echo "<p class='error'>" . htmlspecialchars($error) . "</p>";
}

?>

<a href="registration.html">Go Back</a>

</div>

</body>
</html>

<?php

    }


    // If validation successful
    else {

?>

<!DOCTYPE html>
<html>
<head>

<title>Registration Successful</title>

<style>

body{
    font-family:Arial,sans-serif;
    background:#f2f5fa;
    display:flex;
    justify-content:center;
    padding-top:100px;
}

.box{
    width:430px;
    background:white;
    padding:35px;
    border-radius:15px;
    box-shadow:0 10px 25px rgba(0,0,0,.2);
    text-align:center;
}

h2{
    color:green;
}

p{
    color:#444;
}

a{
    display:inline-block;
    margin-top:20px;
    padding:10px 20px;
    background:#2d6cdf;
    color:white;
    text-decoration:none;
    border-radius:6px;
}

a:hover{
    background:#1e54b7;
}

</style>

</head>

<body>

<div class="box">

<h2>Registration Successful!</h2>

<p>Your registration has been completed successfully.</p>

<p>Welcome to CareerConnect Job Portal.</p>

<a href="register.html">Register Another</a>

</div>

</body>
</html>

<?php

    }

}

?>