package com.example.quizApp.dto;

import lombok.Data;

@Data
public class UserAnswerDTO {
    private Long questionId;
    private String answer;
}
