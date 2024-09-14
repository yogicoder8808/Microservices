package com.example.quizApp.service;

import com.example.quizApp.client.QuestionClient;
import com.example.quizApp.dto.QuestionDTO;
import com.example.quizApp.dto.QuizQuestionDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class QuizServiceImpl implements QuizService {

    @Autowired
    private QuestionClient questionClient;

    @Override
    public List<QuizQuestionDTO> startQuiz() { 
        List<QuestionDTO> questions = questionClient.getAllQuestions();
        return questions.stream().map(this::convertToQuizQuestionDTO).collect(Collectors.toList());
    }
    
    private QuizQuestionDTO convertToQuizQuestionDTO(QuestionDTO question) {
        QuizQuestionDTO quizQuestionDTO = new QuizQuestionDTO();
        quizQuestionDTO.setId(question.getId());
        quizQuestionDTO.setQuestionText(question.getQuestionText());
        return quizQuestionDTO;
    }

    @Override
    public int submitQuiz(Map<Long, String> userAnswers) {
        List<QuestionDTO> questions = questionClient.getAllQuestions();
        int score = 0;

        for (QuestionDTO question : questions) {
            String userAnswer = userAnswers.get(question.getId());
            if (question.getAnswer().equalsIgnoreCase(userAnswer)) {
                score++;
            }
        }
        return score;
    }
}