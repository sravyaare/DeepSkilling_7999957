import React from "react";

function CourseDetails() {

  const courses = [

    {
      id: 1,
      name: "Angular",
      date: "4/5/2021"
    },

    {
      id: 2,
      name: "React",
      date: "6/3/2021"
    }

  ];

  return (

    <div style={{
      width: "300px",
      borderLeft: "4px solid green",
      paddingLeft: "20px"
    }}>

      <h1>Course Details</h1>

      {courses.map(course => (

        <div key={course.id}>

          <h2>{course.name}</h2>

          <h3>{course.date}</h3>

        </div>

      ))}

    </div>

  );

}

export default CourseDetails;