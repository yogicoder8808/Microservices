package com.example.questionApp.service;

import com.example.questionApp.dto.QuestionDTO;

import java.util.List;

public interface QuestionService {
    List<QuestionDTO> getAllQuestions();
    QuestionDTO getQuestionById(Long id);
}
