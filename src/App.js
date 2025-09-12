import React from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import TopicSelection from './TopicSelection';
import Quiz from './Quiz';
import './App.css';

function App() {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<TopicSelection />} />
        <Route path="/quiz/:questionFile" element={<Quiz />} />
      </Routes>
    </Router>
  );
}

export default App;