package com.example.questionApp.controller;

import com.example.questionApp.dto.QuestionDTO;
import com.example.questionApp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/questions")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping
    public List<QuestionDTO> getAllQuestions() {
        return questionService.getAllQuestions();
    }

    @GetMapping("/{id}")
    public QuestionDTO getQuestion(@PathVariable Long id) {
        return questionService.getQuestionById(id);
    }
}
