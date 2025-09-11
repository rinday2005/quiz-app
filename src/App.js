import React, { useState, useEffect } from 'react';
import './App.css';
import Question from './Question';
import Result from './Result';

function App() {
  const [questions, setQuestions] = useState([]);
  const [currentQuestionIndex, setCurrentQuestionIndex] = useState(0);
  const [score, setScore] = useState(0);
  const [quizEnded, setQuizEnded] = useState(false);

  useEffect(() => {
    fetch('/questions.json')
      .then((res) => res.json())
      .then((data) => setQuestions(data));
  }, []);

  const handleAnswer = (selectedAnswer) => {
    const correctAnswer = questions[currentQuestionIndex].correctAnswer;
    if (selectedAnswer === correctAnswer) {
      setScore(score + 1);
    }

    setTimeout(() => {
      const nextQuestionIndex = currentQuestionIndex + 1;
      if (nextQuestionIndex < questions.length) {
        setCurrentQuestionIndex(nextQuestionIndex);
      } else {
        setQuizEnded(true);
      }
    }, 1000);
  };

  const restartQuiz = () => {
    setCurrentQuestionIndex(0);
    setScore(0);
    setQuizEnded(false);
  };

  return (
    <div className="App">
      <header className="App-header">
        <h1>Quiz App</h1>
      </header>
      <main>
        {quizEnded ? (
          <Result score={score} totalQuestions={questions.length} onRestart={restartQuiz} />
        ) : questions.length > 0 ? (
          <Question key={currentQuestionIndex} question={questions[currentQuestionIndex]} onAnswer={handleAnswer} />
        ) : (
          <p>Loading...</p>
        )}
      </main>
    </div>
  );
}

export default App;
