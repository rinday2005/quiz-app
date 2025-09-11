import React, { useState } from 'react';
import Answer from './Answer';

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
      <h2>{question.question}</h2>
      <div className="answer-options">
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
    </div>
  );
};

export default Question;
