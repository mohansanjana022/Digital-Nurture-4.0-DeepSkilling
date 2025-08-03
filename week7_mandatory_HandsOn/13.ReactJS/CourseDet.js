import React from 'react';

export default function CourseDet(props) {
  return (
    <ul>
      {props.courses.map(course => (
        <div key={course.id}>
          <h3>{course.cname}</h3>
          <h4>{course.date}</h4>
        </div>
      ))}
    </ul>
  );
}
