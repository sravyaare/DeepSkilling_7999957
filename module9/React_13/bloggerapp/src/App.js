import React from "react";
import BookDetails from "./Components/BookDetails";
import BlogDetails from "./Components/BlogDetails";
import CourseDetails from "./Components/CourseDetails";

function App() {

  return (

    <div style={{
      display: "flex",
      justifyContent: "space-around",
      alignItems: "flex-start",
      padding: "30px"
    }}>

      <BookDetails />

      <BlogDetails />

      <CourseDetails />

    </div>

  );

}

export default App;