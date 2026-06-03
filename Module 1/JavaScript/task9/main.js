const loading = document.getElementById("loading");
const eventsContainer = document.getElementById("events");

const apiURL = "https://jsonplaceholder.typicode.com/users";

// Function to display data
function displayEvents(data) {

    eventsContainer.innerHTML = "";

    data.slice(0, 5).forEach(event => {

        const card = document.createElement("div");

        card.className = "event-card";

        card.innerHTML = `
            <h3>${event.name}</h3>
            <p>Email: ${event.email}</p>
            <p>City: ${event.address.city}</p>
        `;

        eventsContainer.appendChild(card);
    });
}

loading.style.display = "block";

// Using Promises (.then and .catch)
fetch(apiURL)

.then(response => {

    if (!response.ok) {
        throw new Error("Unable to fetch data");
    }

    return response.json();
})

.then(data => {

    console.log("Data fetched using .then()");
    displayEvents(data);

})

.catch(error => {

    console.error(error.message);

})

.finally(() => {

    loading.style.display = "none";

});

// Using Async/Await
async function fetchEvents() {

    try {

        loading.style.display = "block";

        const response = await fetch(apiURL);

        if (!response.ok) {
            throw new Error("Unable to fetch data");
        }

        const data = await response.json();

        console.log("Data fetched using async/await");

        displayEvents(data);

    }

    catch(error) {

        console.error(error.message);

    }

    finally {

        loading.style.display = "none";

    }
}

// Call Async Function after 5 seconds
setTimeout(() => {

    fetchEvents();

}, 5000);