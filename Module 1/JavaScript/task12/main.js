const form = document.getElementById("registrationForm");
const message = document.getElementById("message");

form.addEventListener("submit", function(event){

    event.preventDefault();

    const registrationData = {

        name: document.getElementById("name").value,

        email: document.getElementById("email").value,

        selectedEvent:
        document.getElementById("event").value
    };

    message.textContent = "Sending registration...";

    // Simulate delayed response
    setTimeout(() => {

        fetch(
            "https://jsonplaceholder.typicode.com/posts",
            {
                method: "POST",

                headers: {
                    "Content-Type": "application/json"
                },

                body: JSON.stringify(registrationData)
            }
        )

        .then(response => {

            if(!response.ok){
                throw new Error("Registration Failed");
            }

            return response.json();
        })

        .then(data => {

            console.log(data);

            message.textContent =
            "Registration submitted successfully!";

            form.reset();
        })

        .catch(error => {

            console.error(error);

            message.textContent =
            "Failed to submit registration.";
        });

    }, 2000);

});