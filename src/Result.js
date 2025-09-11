import React from 'react';

const Result = ({ score, totalQuestions, onRestart }) => {
  return (
    <div>
      <h2>Your score: {score} / {totalQuestions}</h2>
      <button onClick={onRestart}>Restart Quiz</button>
    </div>
  );
};

export default Result;
