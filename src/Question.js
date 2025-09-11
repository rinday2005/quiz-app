import React, { useState } from "react";
import Answer from "./Answer";

const Question = ({ question, onAnswer }) => {
  const [selectedAnswer, setSelectedAnswer] = useState(null);
  const [isAnswered, setIsAnswered] = useState(false);

  const handleAnswerClick = (option) => {
    if (isAnswered) return;

    setSelectedAnswer(option);
    setIsAnswered(true);
    onAnswer(option);
  };

  return (
    <div>
      <div className="answer-options">
        <h2>{question.question}</h2>
        {question.options.map((option, index) => (
          <Answer
            key={index}
            option={option}
            onAnswer={handleAnswerClick}
            isAnswered={isAnswered}
            isSelected={selectedAnswer === option}
            isCorrect={question.correctAnswer === option}
          />
        ))}
      </div>
      {/* You can put this back later */}
      {isAnswered && (
        <div className="explanation">
          <h3>Explanation:</h3>
          <p>{question.explanation}</p>
        </div>
      )}
    </div>
  );
};

export default Question;
