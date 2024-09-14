package com.example.quizApp.service;

import com.example.quizApp.dto.QuizQuestionDTO;

import java.util.List;
import java.util.Map;

public interface QuizService {
    List<QuizQuestionDTO> startQuiz();
    int submitQuiz(Map<Long, String> userAnswers);
}
