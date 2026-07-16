import React from "react";
import "../Stylesheets/mystyle.css";

function CalculateScore(props) {

    const average = props.total / props.goal;

    return (

        <div className="box">

            <h2>Student Score Details</h2>

            <h3>Name : {props.name}</h3>

            <h3>School : {props.school}</h3>

            <h3>Total Marks : {props.total}</h3>

            <h3>Goal : {props.goal}</h3>

            <h2>Average Score : {average}</h2>

        </div>

    );

}

export default CalculateScore;