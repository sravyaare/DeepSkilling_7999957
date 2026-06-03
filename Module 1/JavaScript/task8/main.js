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
    },
    {
        name: "Music Night",
        category: "Music",
        seats: 25
    }
];

const eventContainer = document.getElementById("eventContainer");
const categoryFilter = document.getElementById("categoryFilter");
const searchBox = document.getElementById("searchBox");

// Display Events
function displayEvents(eventList) {

    eventContainer.innerHTML = "";

    eventList.forEach(event => {

        const card = document.createElement("div");
        card.className = "event-card";

        card.innerHTML = `
            <h3>${event.name}</h3>
            <p>Category: ${event.category}</p>
            <p>Available Seats: ${event.seats}</p>
        `;

        const registerBtn = document.createElement("button");
        registerBtn.textContent = "Register";

        // onclick Event
        registerBtn.onclick = function () {

            if (event.seats > 0) {
                event.seats--;
                displayEvents(eventList);
            } else {
                alert("No seats available!");
            }
        };

        card.appendChild(registerBtn);
        eventContainer.appendChild(card);
    });
}

// Initial Display
displayEvents(events);

// onchange Event
categoryFilter.onchange = function () {

    const selectedCategory = this.value;

    if (selectedCategory === "All") {
        displayEvents(events);
    } else {

        const filteredEvents = events.filter(event =>
            event.category === selectedCategory
        );

        displayEvents(filteredEvents);
    }
};

// keydown Event
searchBox.addEventListener("keydown", function () {

    setTimeout(() => {

        const searchText =
            searchBox.value.toLowerCase();

        const searchedEvents = events.filter(event =>
            event.name.toLowerCase().includes(searchText)
        );

        displayEvents(searchedEvents);

    }, 0);

});