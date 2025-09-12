import React, { useState, useEffect } from 'react';
import { useParams } from 'react-router-dom';
import './App.css';
import Question from './Question';
import Result from './Result';

function Quiz() {
  const { questionFile } = useParams();
  const [questions, setQuestions] = useState([]);
  const [currentQuestionIndex, setCurrentQuestionIndex] = useState(0);
  const [score, setScore] = useState(0);
  const [quizEnded, setQuizEnded] = useState(false);
  const [userAnswers, setUserAnswers] = useState([]);
  const [quizTopic, setQuizTopic] = useState('');

  useEffect(() => {
    // Derive topic name from questionFile
    const topic = questionFile
      .replace('.json', '')
      .replace('questions', ' Quiz')
      .split(' ')
      .map(word => word.charAt(0).toUpperCase() + word.slice(1))
      .join(' ');
    setQuizTopic(topic);

    // Reset quiz state when questionFile changes
    setCurrentQuestionIndex(0);
    setScore(0);
    setQuizEnded(false);
    setUserAnswers([]);

    fetch(`/${questionFile}`)
      .then((res) => {
        if (!res.ok) {
          throw new Error(`HTTP error! status: ${res.status}`);
        }
        return res.json();
      })
      .then((data) => setQuestions(data))
      .catch((error) => {
        console.error("Error fetching questions:", error);
        // Optionally, display an error message to the user
      });
  }, [questionFile]);

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
    // Navigate back to topic selection or reload current quiz
    // For now, just reset state and refetch questions
    setCurrentQuestionIndex(0);
    setScore(0);
    setQuizEnded(false);
    setUserAnswers([]);
    // Re-fetch questions to ensure a clean start if the file was changed
    fetch(`/${questionFile}`)
      .then((res) => res.json())
      .then((data) => setQuestions(data));
  };

  return (
    <div className="App">
      {!quizEnded && (
        <header className="App-header">
          <h1>Welcome to {quizTopic}</h1>
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

export default Quiz;
