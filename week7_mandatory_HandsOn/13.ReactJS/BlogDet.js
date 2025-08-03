import React from "react";
 export default function BlogDet (props) {
    return (
        <ul>
            {props.blogs.map(blog => (
                <div key={blog.id}>
                    <h3>{blog.title}</h3>
                    <h4>{blog.author}</h4>
                    <p>{blog.content}</p>

                </div>
            ))}
        </ul>
    );
 }