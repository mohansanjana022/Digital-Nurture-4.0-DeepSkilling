import React from 'react';
import './App.css';
import BookDet from './BookDet';
import BlogDet from './BlogDet';
import CourseDet from './CourseDet';
import { books, blogs, courses } from './data';

function App() {
  return (
    <div>
      <div>
        <div className="st2">
          <h1>Book Details</h1>
          <BookDet books={books} />
        </div>

        <div className="v1">
          <h1>Blog Details</h1>
          <BlogDet blogs={blogs} />
        </div>

        <div className="mystyle1">
          <h1>Course Details</h1>
          <CourseDet courses={courses} />
        </div>
      </div>
    </div>
  );
}

export default App;
