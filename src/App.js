import React, { useState, useEffect } from 'react';
import './App.css';
import Question from './Question';
import Result from './Result';

function App() {
  const [questions, setQuestions] = useState([]);
  const [currentQuestionIndex, setCurrentQuestionIndex] = useState(0);
  const [score, setScore] = useState(0);
  const [quizEnded, setQuizEnded] = useState(false);
  const [userAnswers, setUserAnswers] = useState([]);

  useEffect(() => {
    fetch('/questions.json')
      .then((res) => res.json())
      .then((data) => setQuestions(data));
  }, []);

  const handleAnswer = (selectedAnswer) => {
    const currentQuestion = questions[currentQuestionIndex];
    const isCorrect = selectedAnswer === currentQuestion.correctAnswer;

    if (isCorrect) {
      setScore(score + 1);
    }

    setUserAnswers([
      ...userAnswers,
      {
        question: currentQuestion.question,
        selectedAnswer: selectedAnswer,
        correctAnswer: currentQuestion.correctAnswer,
        explanation: currentQuestion.explanation,
        isCorrect: isCorrect,
      },
    ]);

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
    setUserAnswers([]);
  };

  return (
    <div className="App">
      {!quizEnded && (
        <header className="App-header">
          <h1>Welcome to My Quiz</h1>
          {questions.length > 0 && (
            <p>Total Questions: {questions.length}</p>
          )}
        </header>
      )}
      <main>
        {quizEnded ? (
          <Result score={score} totalQuestions={questions.length} onRestart={restartQuiz} userAnswers={userAnswers} />
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
