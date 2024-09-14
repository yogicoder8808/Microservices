package com.example.quizApp.controller;

import com.example.quizApp.dto.QuizQuestionDTO;
import com.example.quizApp.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    private QuizService quizService;

    @GetMapping("/start")
    public List<QuizQuestionDTO> startQuiz() {
        return quizService.startQuiz();
    }

    @PostMapping("/submit")
    public int submitQuiz(@RequestBody Map<Long, String> userAnswers) {
        return quizService.submitQuiz(userAnswers);
    }
}