import React, { useState } from "react";

import GuestPage from "./Components/GuestPage";
import UserPage from "./Components/UserPage";

function App() {

    const [loggedIn, setLoggedIn] = useState(false);

    return (

        <div style={{padding:"20px"}}>

            <h1>Ticket Booking Application</h1>

            {

                loggedIn ?

                <div>

                    <button onClick={() => setLoggedIn(false)}>

                        Logout

                    </button>

                    <UserPage/>

                </div>

                :

                <div>

                    <button onClick={() => setLoggedIn(true)}>

                        Login

                    </button>

                    <GuestPage/>

                </div>

            }

        </div>

    );

}

export default App;