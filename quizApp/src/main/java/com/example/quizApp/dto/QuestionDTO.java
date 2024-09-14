package com.example.quizApp.dto;

import lombok.Data;

@Data
public class QuestionDTO {
    private Long id;
    private String questionText;
    private String answer; 
}
