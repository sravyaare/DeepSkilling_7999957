const events = [
    { name: "Music Festival", date: "2026-07-15", seats: 20 },
    { name: "Art Workshop", date: "2025-01-10", seats: 15 },
    { name: "Food Fair", date: "2026-08-20", seats: 0 },
    { name: "Book Exhibition", date: "2026-09-05", seats: 30 }
];

const today = new Date();
const output = document.getElementById("output");

events.forEach(event => {
    const eventDate = new Date(event.date);

    if (eventDate > today && event.seats > 0) {
        output.innerHTML += `<p>${event.name} - ${event.date} - Seats: ${event.seats}</p>`;
    } else {
        output.innerHTML += `<p>${event.name} is hidden (Past event or No seats available)</p>`;
    }
});

function registerUser(eventName) {
    try {
        const selectedEvent = events.find(event => event.name === eventName);

        if (!selectedEvent) {
            throw new Error("Event not found.");
        }

        if (selectedEvent.seats <= 0) {
            throw new Error("No seats available.");
        }

        selectedEvent.seats--;

        output.innerHTML += `<p>Registration successful for ${selectedEvent.name}. Remaining Seats: ${selectedEvent.seats}</p>`;

    } catch (error) {
        output.innerHTML += `<p>Registration Error: ${error.message}</p>`;
    }
}

registerUser("Music Festival");
registerUser("Food Fair");
registerUser("Dance Show");