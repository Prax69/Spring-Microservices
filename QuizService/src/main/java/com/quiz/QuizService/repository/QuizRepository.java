package com.quiz.QuizService.repository;

import com.quiz.QuizService.entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz, Long> {

}
