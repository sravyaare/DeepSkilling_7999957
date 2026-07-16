import React from "react";

function BlogDetails() {

  const blogs = [

    {
      id: 1,
      title: "React Learning",
      author: "Stephen Biz",
      content: "Welcome to learning React!"
    },

    {
      id: 2,
      title: "Installation",
      author: "Schwzdenier",
      content: "You can install React from npm."
    }

  ];

  return (

    <div style={{
      width: "300px",
      borderLeft: "4px solid green",
      paddingLeft: "20px"
    }}>

      <h1>Blog Details</h1>

      {blogs.map(blog => (

        <div key={blog.id}>

          <h2>{blog.title}</h2>

          <h4>{blog.author}</h4>

          <p>{blog.content}</p>

        </div>

      ))}

    </div>

  );

}

export default BlogDetails;