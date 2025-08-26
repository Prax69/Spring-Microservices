package com.quiz.QuestionService.service;

import com.quiz.QuestionService.entity.Question;

import java.util.List;

public interface QuestionService {
    Question addQuestion(Question question);
    List<Question> get();

    Question getById(Long id);
    List<Question> findByQuizId(Long quizId);

    List<Question> getQuestionsOfQuiz(Long quizId);
}
