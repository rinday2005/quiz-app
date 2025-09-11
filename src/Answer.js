import React from 'react';

const Answer = ({ option, onAnswer, isAnswered, isSelected, isCorrect }) => {
  let buttonClass = '';
  if (isAnswered) {
    if (isCorrect) {
      buttonClass = 'correct';
    } else if (isSelected) {
      buttonClass = 'incorrect';
    }
  }

  return (
    <button onClick={() => onAnswer(option)} className={buttonClass} disabled={isAnswered}>
      {option}
    </button>
  );
};

export default Answer;
