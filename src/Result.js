import React from "react";

const Result = ({ score, totalQuestions, onRestart, userAnswers }) => {
  return (
    <div>
      <div className="result-header">
        <h1>Quiz Result</h1>
        <h2>
          Your score: {score} / {totalQuestions} ({(score / totalQuestions * 100).toFixed(2)}%)
        </h2>
        <button onClick={onRestart} className="restart-quiz-button">
          Restart Quiz
        </button>
      </div>

      <hr />
      <div className="review-header">
      <h3>Review your answers:</h3>
      {userAnswers.map((answer, index) => (
        <div key={index} className="question-review">
          <p>
            <strong>Question {index + 1}:</strong> {answer.question}
          </p>
          <p>
            Your answer:{" "}
            <span style={{ color: answer.isCorrect ? "green" : "red" }}>
              {answer.selectedAnswer}
            </span>
          </p>
          <p>Correct answer: {answer.correctAnswer}</p>
          <p>Explanation: {answer.explanation}</p>
        </div>
      ))}
      </div>
    </div>
  );
};

export default Result;
