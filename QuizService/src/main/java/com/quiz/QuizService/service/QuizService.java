package com.quiz.QuizService.service;

import com.quiz.QuizService.entity.Quiz;

import java.util.List;

public interface QuizService {
    Quiz add(Quiz quiz);

    List<Quiz> get();

    Quiz get(Long id);
}
