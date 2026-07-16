import React from "react";
import CohortDetails from "./Components/CohortDetails";

function App() {

  return (

    <div>

      <h1>Cognizant Academy Dashboard</h1>

      <CohortDetails
        status="ongoing"
        code="INTADMDF10"
        technology=".NET FSD"
        trainer="John"
        students={28}
      />

      <CohortDetails
        status="ongoing"
        code="JAVAFSD08"
        technology="Java FSD"
        trainer="David"
        students={32}
      />

      <CohortDetails
        status="completed"
        code="PYTHON05"
        technology="Python"
        trainer="Smith"
        students={25}
      />

      <CohortDetails
        status="completed"
        code="REACT09"
        technology="React"
        trainer="James"
        students={30}
      />

    </div>

  );

}

export default App;