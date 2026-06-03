const form = document.getElementById("registrationForm");

form.addEventListener("submit", function(event){

    // Prevent page refresh
    event.preventDefault();

    // Clear previous messages
    document.getElementById("nameError").textContent = "";
    document.getElementById("emailError").textContent = "";
    document.getElementById("eventError").textContent = "";
    document.getElementById("successMessage").textContent = "";

    // Capture values using form.elements
    const name = form.elements["userName"].value.trim();
    const email = form.elements["userEmail"].value.trim();
    const selectedEvent = form.elements["eventName"].value;

    let isValid = true;

    // Name Validation
    if(name === ""){
        document.getElementById("nameError").textContent =
        "Please enter your name";
        isValid = false;
    }

    // Email Validation
    if(email === ""){
        document.getElementById("emailError").textContent =
        "Please enter your email";
        isValid = false;
    }
    else if(!email.includes("@")){
        document.getElementById("emailError").textContent =
        "Enter a valid email address";
        isValid = false;
    }

    // Event Validation
    if(selectedEvent === ""){
        document.getElementById("eventError").textContent =
        "Please select an event";
        isValid = false;
    }

    // Success Message
    if(isValid){
        document.getElementById("successMessage").textContent =
        `Registration successful for ${selectedEvent}`;

        form.reset();
    }

});