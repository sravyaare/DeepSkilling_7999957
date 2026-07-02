// Using const for array reference
const events = [
    {
        name: "Music Festival",
        category: "Music",
        seats: 25
    },
    {
        name: "Art Workshop",
        category: "Art",
        seats: 15
    },
    {
        name: "Rock Concert",
        category: "Music",
        seats: 30
    }
];

// Function with default parameter
function addEvent(
    name = "New Event",
    category = "General",
    seats = 10
) {

    const newEvent = {
        name,
        category,
        seats
    };

    console.log("Added Event:");
    console.log(newEvent);
}

// Using let because value may change
let selectedCategory = "Music";

// Clone array using spread operator
const clonedEvents = [...events];

// Filter music events from cloned array
const filteredEvents = clonedEvents.filter(
    event => event.category === selectedCategory
);

console.log("Filtered Events:");
console.log(filteredEvents);

// Destructuring event details
filteredEvents.forEach(event => {

    const { name, category, seats } = event;

    console.log(
        `Event: ${name} | Category: ${category} | Seats: ${seats}`
    );

});

// Calling function with values
addEvent(
    "Food Carnival",
    "Food",
    20
);

// Calling function with default values
addEvent();