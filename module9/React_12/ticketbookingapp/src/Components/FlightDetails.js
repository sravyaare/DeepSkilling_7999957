import React from "react";

function FlightDetails() {

    return (

        <table border="1" cellPadding="10">

            <thead>

                <tr>

                    <th>Flight</th>
                    <th>From</th>
                    <th>To</th>
                    <th>Fare</th>

                </tr>

            </thead>

            <tbody>

                <tr>

                    <td>AI202</td>
                    <td>Hyderabad</td>
                    <td>Delhi</td>
                    <td>₹6500</td>

                </tr>

                <tr>

                    <td>6E501</td>
                    <td>Chennai</td>
                    <td>Mumbai</td>
                    <td>₹5400</td>

                </tr>

            </tbody>

        </table>

    );

}

export default FlightDetails;