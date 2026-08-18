

document.getElementById("loginForm").addEventListener("submit", function(e){

    e.preventDefault();

    // Clear old error messages
    document.getElementById("emailError").innerHTML = "";
    document.getElementById("passwordError").innerHTML = "";

    let email = document.getElementById("email").value.trim();
    let password = document.getElementById("password").value.trim();

    let valid = true;

    // Email Validation
    if(email == ""){
        document.getElementById("emailError").innerHTML = "Enter your email";
        valid = false;
    }

    // Password Validation
    if(password == ""){
        document.getElementById("passwordError").innerHTML = "Enter your password";
        valid = false;
    }

    if(!valid){
        return;
    }

    // Get registered user
    let user = JSON.parse(localStorage.getItem("careerUser"));

    if(user == null){

        alert("No account found. Please register first.");

        window.location.href = "register.html";

        return;
    }

    if(email === user.email && password === user.password){

        alert("Login Successful!");

        window.location.href = "index.html";

    }
    else{

        alert("Invalid Email or Password!");

    }

});