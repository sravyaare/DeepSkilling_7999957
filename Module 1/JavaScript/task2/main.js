// Event details using appropriate data types
const eventName = "Community Music Festival";
const eventDate = "15 June 2026";
let availableSeats = 50;

// Display event information using template literals
console.log(`Event Name: ${eventName}`);
console.log(`Event Date: ${eventDate}`);
console.log(`Available Seats: ${availableSeats}`);

// User registers for the event
availableSeats--;

// Updated seat count
console.log(`Seats Remaining After Registration: ${availableSeats}`);