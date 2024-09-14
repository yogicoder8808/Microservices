package com.example.questionApp.dto;

import lombok.Data;

@Data
public class QuestionDTO {
    private Long id;
    private String questionText;
    private String answer;
}
