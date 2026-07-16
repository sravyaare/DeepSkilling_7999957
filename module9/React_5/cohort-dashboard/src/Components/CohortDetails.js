import React from "react";
import styles from "./CohortDetails.module.css";

function CohortDetails(props) {

    const headingStyle = {
        color: props.status === "ongoing" ? "green" : "blue"
    };

    return (

        <div className={styles.box}>

            <h3 style={headingStyle}>
                {props.status.toUpperCase()}
            </h3>

            <dl>

                <dt>Code</dt>
                <dd>{props.code}</dd>

                <dt>Technology</dt>
                <dd>{props.technology}</dd>

                <dt>Trainer</dt>
                <dd>{props.trainer}</dd>

                <dt>Students</dt>
                <dd>{props.students}</dd>

            </dl>

        </div>

    );

}

export default CohortDetails;