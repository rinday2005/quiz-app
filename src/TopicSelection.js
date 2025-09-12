import React from 'react';
import { useNavigate } from 'react-router-dom';
import './App.css'; // Assuming App.css has general styling for buttons

function TopicSelection() {
  const navigate = useNavigate();

  const topics = [
    { name: 'Python Quiz', file: 'pythonquestion.json' },
    { name: 'HTML Quiz', file: 'htmlquestion.json' },
    { name: 'CSS Quiz', file: 'cssquestion.json' },
    { name: 'General Knowledge Quiz', file: 'generalknowledge.json' },
    { name: 'Arabic Quiz', file: 'arabicquestion.json' },
  ];

  const handleTopicSelect = (file) => {
    navigate(`/quiz/${file}`);
  };

  return (
    <div className="App">
      <header className="App-header">
        <h1>Select a Quiz Topic</h1>
      </header>
      <main>
        <div className="topic-selection-container">
          {topics.map((topic) => (
            <button
              key={topic.file}
              onClick={() => handleTopicSelect(topic.file)}
              className="topic-button"
            >
              {topic.name}
            </button>
          ))}
        </div>
      </main>
    </div>
  );
}

export default TopicSelection;
