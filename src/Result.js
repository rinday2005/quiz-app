import React from 'react';

const Result = ({ score, totalQuestions, onRestart, userAnswers }) => {
  return (
    <div>
      <h2>Your score: {score} / {totalQuestions}</h2>
      <button onClick={onRestart}>Restart Quiz</button>

      <h3>Review your answers:</h3>
      {userAnswers.map((answer, index) => (
        <div key={index} className="question-review">
          <p><strong>Question {index + 1}:</strong> {answer.question}</p>
          <p>Your answer: <span style={{ color: answer.isCorrect ? 'green' : 'red' }}>{answer.selectedAnswer}</span></p>
          <p>Correct answer: {answer.correctAnswer}</p>
          <p>Explanation: {answer.explanation}</p>
        </div>
      ))}
    </div>
    );
};


export default Result;
