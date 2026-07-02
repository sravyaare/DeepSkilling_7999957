// Array to store events
let events = [];

// Function to add an event
function addEvent(name, category, seats) {
    events.push({
        name: name,
        category: category,
        seats: seats
    });

    console.log(`${name} added successfully.`);
}

// Function to register a user
function registerUser(eventName) {

    const event = events.find(
        item => item.name === eventName
    );

    if (event && event.seats > 0) {

        event.seats--;

        console.log(
            `Registered for ${event.name}. Remaining Seats: ${event.seats}`
        );

        return true;
    }

    console.log(`Registration failed for ${eventName}`);
    return false;
}

// Function to filter events by category
function filterEventsByCategory(category) {

    return events.filter(
        event => event.category === category
    );
}

// Closure to track total registrations
function registrationTracker(category) {

    let totalRegistrations = 0;

    return function () {

        totalRegistrations++;

        console.log(
            `${category} Registrations: ${totalRegistrations}`
        );
    };
}

// Create registration tracker for Music category
const musicRegistrationCount =
    registrationTracker("Music");

// Higher-Order Function with Callback
function searchEvents(callback) {

    const result = events.filter(callback);

    console.log("Search Results:");
    console.log(result);

    return result;
}

// Add Events
addEvent("Music Festival", "Music", 20);
addEvent("Dance Workshop", "Dance", 15);
addEvent("Rock Concert", "Music", 10);
addEvent("Art Exhibition", "Art", 25);

// Register Users
registerUser("Music Festival");
musicRegistrationCount();

registerUser("Rock Concert");
musicRegistrationCount();

// Filter Events by Category
const musicEvents =
    filterEventsByCategory("Music");

console.log("Music Events:");
console.log(musicEvents);

// Dynamic Search using Callback
searchEvents(event =>
    event.seats > 10
);