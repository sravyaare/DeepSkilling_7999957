import React from "react";

function App() {

  const office = {
    Name: "Smart Work Office",
    Rent: 55000,
    Address: "Hitech City, Hyderabad"
  };

  const officeList = [

    {
      Name: "Smart Work Office",
      Rent: 55000,
      Address: "Hitech City, Hyderabad"
    },

    {
      Name: "Tech Park",
      Rent: 70000,
      Address: "Gachibowli, Hyderabad"
    },

    {
      Name: "Business Hub",
      Rent: 45000,
      Address: "Madhapur, Hyderabad"
    }

  ];

  return (

    <div style={{ padding: "20px" }}>

      <h1>Office Space Rental App</h1>

      <img
        src="/office.jpg"
        alt="Office"
        width="500"
      />

      <hr />

      <h2>Single Office Details</h2>

      <h3>Name : {office.Name}</h3>

      <h3
        style={{
          color: office.Rent < 60000 ? "red" : "green"
        }}
      >
        Rent : ₹{office.Rent}
      </h3>

      <h3>Address : {office.Address}</h3>

      <hr />

      <h2>Office Space List</h2>

      {

        officeList.map((item, index) => (

          <div
            key={index}
            style={{
              border: "1px solid gray",
              padding: "15px",
              marginBottom: "15px",
              width: "400px"
            }}
          >

            <h3>Name : {item.Name}</h3>

            <h3
              style={{
                color: item.Rent < 60000 ? "red" : "green"
              }}
            >
              Rent : ₹{item.Rent}
            </h3>

            <h3>Address : {item.Address}</h3>

          </div>

        ))

      }

    </div>

  );

}

export default App;