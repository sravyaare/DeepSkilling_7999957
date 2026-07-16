import React from "react";

function BookDetails() {

  const books = [
    { id: 1, name: "Master React", price: 670 },
    { id: 2, name: "Deep Dive into Angular 11", price: 800 },
    { id: 3, name: "Mongo Essentials", price: 450 }
  ];

  return (

    <div style={{
      width: "300px",
      borderLeft: "4px solid green",
      paddingLeft: "20px"
    }}>

      <h1>Book Details</h1>

      {books.map(book => (

        <div key={book.id}>

          <h2>{book.name}</h2>

          <h3>{book.price}</h3>

        </div>

      ))}

    </div>

  );

}

export default BookDetails;