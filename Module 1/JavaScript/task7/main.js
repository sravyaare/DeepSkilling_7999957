// Event Data
const events = [
    {
        name: "Music Festival",
        category: "Music",
        seats: 20
    },
    {
        name: "Art Workshop",
        category: "Art",
        seats: 15
    },
    {
        name: "Food Carnival",
        category: "Food",
        seats: 10
    }
];

// Access DOM element using querySelector()
const eventContainer = document.querySelector("#eventContainer");

// Function to display events
function displayEvents() {

    eventContainer.innerHTML = "";

    events.forEach((event) => {

        // Create card
        const card = document.createElement("div");
        card.classList.add("event-card");

        // Event details
        const title = document.createElement("h3");
        title.textContent = event.name;

        const category = document.createElement("p");
        category.textContent = `Category: ${event.category}`;

        const seats = document.createElement("p");
        seats.textContent = `Available Seats: ${event.seats}`;

        // Register button
        const registerBtn = document.createElement("button");
        registerBtn.textContent = "Register";

        registerBtn.onclick = function () {

            if (event.seats > 0) {
                event.seats--;
                displayEvents();
            } else {
                alert("No seats available!");
            }
        };

        // Cancel button
        const cancelBtn = document.createElement("button");
        cancelBtn.textContent = "Cancel";

        cancelBtn.onclick = function () {

            event.seats++;
            displayEvents();
        };

        // Append elements
        card.appendChild(title);
        card.appendChild(category);
        card.appendChild(seats);
        card.appendChild(registerBtn);
        card.appendChild(cancelBtn);

        eventContainer.appendChild(card);
    });
}

// Initial Display
displayEvents();