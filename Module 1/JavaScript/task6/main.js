// Array to store community events
let events = [];

// Adding events using push()
events.push({
    title: "Music Fiesta",
    category: "Music"
});

events.push({
    title: "Baking Basics",
    category: "Workshop"
});

events.push({
    title: "Guitar Night",
    category: "Music"
});

events.push({
    title: "Painting Session",
    category: "Art"
});

// Display all events
console.log("All Events:");
console.log(events);

// Filter only Music events
const musicEvents = events.filter(event => {
    return event.category === "Music";
});

console.log("Music Events:");
console.log(musicEvents);

// Format event names using map()
const eventCards = events.map(event => {
    return `${event.category} on ${event.title}`;
});

console.log("Formatted Event Cards:");
console.log(eventCards);