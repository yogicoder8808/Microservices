package com.example.quizApp.client;

import com.example.quizApp.dto.QuestionDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "questionApp")
public interface QuestionClient {

    @GetMapping("/questions")
    List<QuestionDTO> getAllQuestions();

    @GetMapping("/questions/{id}")
    QuestionDTO getQuestionById(@PathVariable Long id);
}
