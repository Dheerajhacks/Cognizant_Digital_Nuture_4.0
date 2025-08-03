import React from 'react';
import BookDetails from './Components/BookDetails';
import BlogDetails from './Components/BlogDetails';
import CourseDetails from './Components/CourseDetails';
import './App.css';

function App() {
  return (
    <div className="container">
      <CourseDetails />
       <BookDetails  />
      <BlogDetails />
    </div>
  );
}

export default App;