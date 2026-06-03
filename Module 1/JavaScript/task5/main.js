// Event Class
class Event {

    constructor(eventName, category, eventDate, availableSeats) {
        this.eventName = eventName;
        this.category = category;
        this.eventDate = eventDate;
        this.availableSeats = availableSeats;
    }
}

// Adding method to prototype
Event.prototype.checkAvailability = function () {

    if (this.availableSeats > 0) {
        return `${this.eventName} has ${this.availableSeats} seats available.`;
    } else {
        return `${this.eventName} is fully booked.`;
    }
};

// Creating Event Objects
const event1 = new Event(
    "Community Music Night",
    "Music",
    "20-06-2026",
    40
);

const event2 = new Event(
    "Art & Craft Workshop",
    "Workshop",
    "25-06-2026",
    0
);

// Check Availability
console.log(event1.checkAvailability());
console.log(event2.checkAvailability());

// Display Object Keys and Values
console.log("Event 1 Details:");

Object.entries(event1).forEach(([key, value]) => {
    console.log(`${key}: ${value}`);
});

console.log("Event 2 Details:");

Object.entries(event2).forEach(([key, value]) => {
    console.log(`${key}: ${value}`);
});