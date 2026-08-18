// ============================
// CareerConnect Registration
// ============================

document.getElementById("registrationForm").addEventListener("submit", function(e){

    e.preventDefault();

    // Clear previous error messages
    document.querySelectorAll(".error").forEach(function(item){
        item.innerHTML = "";
    });

    let valid = true;

    // Get Values
    let fullname = document.getElementById("fullname").value.trim();
    let email = document.getElementById("email").value.trim();
    let phone = document.getElementById("phone").value.trim();
    let password = document.getElementById("password").value;
    let confirmPassword = document.getElementById("confirmPassword").value;
    let dob = document.getElementById("dob").value;
    let qualification = document.getElementById("qualification").value;
    let college = document.getElementById("college").value.trim();
    let skills = document.getElementById("skills").value.trim();
    let job = document.getElementById("job").value.trim();
    let experience = document.getElementById("experience").value;
    let resumeLink = document.getElementById("resumeLink").value.trim();
    let resume = document.getElementById("resume").value;
    let address = document.getElementById("address").value.trim();
    let city = document.getElementById("city").value.trim();
    let state = document.getElementById("state").value.trim();
    let pincode = document.getElementById("pincode").value.trim();

    let gender = document.querySelector('input[name="gender"]:checked');

    // Regular Expressions
    let namePattern = /^[A-Za-z ]+$/;
    let emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    let phonePattern = /^[0-9]{10}$/;
    let urlPattern = /^(https?:\/\/).+/;
    let pinPattern = /^[0-9]{6}$/;

    // Full Name
    if(fullname==""){
        document.getElementById("nameError").innerHTML="Enter your full name";
        valid=false;
    }
    else if(!namePattern.test(fullname)){
        document.getElementById("nameError").innerHTML="Only alphabets allowed";
        valid=false;
    }

    // Email
    if(email==""){
        document.getElementById("emailError").innerHTML="Enter your email";
        valid=false;
    }
    else if(!emailPattern.test(email)){
        document.getElementById("emailError").innerHTML="Invalid email";
        valid=false;
    }

    // Phone
    if(phone==""){
        document.getElementById("phoneError").innerHTML="Enter phone number";
        valid=false;
    }
    else if(!phonePattern.test(phone)){
        document.getElementById("phoneError").innerHTML="Phone must contain 10 digits";
        valid=false;
    }

    // Password
    if(password==""){
        document.getElementById("passwordError").innerHTML="Enter password";
        valid=false;
    }
    else if(password.length<6){
        document.getElementById("passwordError").innerHTML="Minimum 6 characters";
        valid=false;
    }

    // Confirm Password
    if(confirmPassword==""){
        document.getElementById("confirmError").innerHTML="Confirm password";
        valid=false;
    }
    else if(password!=confirmPassword){
        document.getElementById("confirmError").innerHTML="Passwords do not match";
        valid=false;
    }

    // Gender
    if(!gender){
        alert("Please select gender");
        valid=false;
    }

    // DOB
    if(dob==""){
        alert("Select Date of Birth");
        valid=false;
    }

    // Qualification
    if(qualification==""){
        alert("Select Qualification");
        valid=false;
    }

    // College
    if(college==""){
        alert("Enter College Name");
        valid=false;
    }

    // Skills
    if(skills==""){
        alert("Enter Skills");
        valid=false;
    }

    // Desired Job
    if(job==""){
        alert("Enter Desired Job");
        valid=false;
    }

    // Experience
    if(experience==""){
        alert("Enter Experience");
        valid=false;
    }

    // Resume Link
    if(resumeLink==""){
        alert("Enter Resume Link");
        valid=false;
    }
    else if(!urlPattern.test(resumeLink)){
        alert("Invalid Resume URL");
        valid=false;
    }

    // Resume File
    if(resume==""){
        alert("Upload Resume");
        valid=false;
    }
    else{
        let extension = /(\.pdf|\.doc|\.docx)$/i;
        if(!extension.test(resume)){
            alert("Upload only PDF/DOC/DOCX");
            valid=false;
        }
    }

    // Address
    if(address==""){
        alert("Enter Address");
        valid=false;
    }

    // City
    if(city==""){
        alert("Enter City");
        valid=false;
    }

    // State
    if(state==""){
        alert("Enter State");
        valid=false;
    }

    // Pincode
    if(!pinPattern.test(pincode)){
        alert("Enter valid 6 digit pincode");
        valid=false;
    }

    // Success
    if(valid){

        let userData = {

            fullname: fullname,
            email: email,
            phone: phone,
            password: password,
            qualification: qualification,
            college: college,
            skills: skills,
            job: job,
            experience: experience,
            city: city

        };

        localStorage.setItem("careerUser", JSON.stringify(userData));

        alert("Registration Successful!");

        document.getElementById("registrationForm").reset();

        window.location.href="login.html";

    }

});