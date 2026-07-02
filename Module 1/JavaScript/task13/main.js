const form = document.getElementById("registrationForm");
const message = document.getElementById("message");

form.addEventListener("submit", function(event){

    event.preventDefault();

    console.log("Step 1: Form Submitted");

    const name =
    document.getElementById("name").value;

    const email =
    document.getElementById("email").value;

    console.log("Step 2: Values Captured");
    console.log("Name:", name);
    console.log("Email:", email);

    const userData = {
        name: name,
        email: email
    };

    console.log("Step 3: Payload Created");
    console.log(userData);

    // Breakpoint Location
    debugger;

    fetch(
        "https://jsonplaceholder.typicode.com/posts",
        {
            method: "POST",

            headers: {
                "Content-Type": "application/json"
            },

            body: JSON.stringify(userData)
        }
    )

    .then(response => {

        console.log("Step 4: Response Received");

        return response.json();
    })

    .then(data => {

        console.log("Step 5: Data Returned");
        console.log(data);

        message.textContent =
        "Registration Successful";
    })

    .catch(error => {

        console.error(
            "Registration Failed:",
            error
        );

        message.textContent =
        "Registration Failed";
    });

});