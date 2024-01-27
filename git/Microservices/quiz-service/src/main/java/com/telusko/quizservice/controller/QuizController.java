package com.telusko.quizservice.controller;

import com.telusko.quizservice.model.QuestionWrapper;
import com.telusko.quizservice.model.QuizDto;
import com.telusko.quizservice.model.Response;
import com.telusko.quizservice.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("quiz")
public class QuizController {

    @Autowired
    public QuizService quizService;
    @PostMapping("create")
    public ResponseEntity<String> createQuiz(@RequestBody QuizDto quizDto){
        return quizService.createQuiz(quizDto.getCategoryName(), quizDto.getNumOfQuestions(), quizDto.getTitle());
    }

    @PostMapping("getQuestion/{id}")
    public ResponseEntity<List<QuestionWrapper>> getQuizQuestion(@PathVariable Integer id){
        return quizService.getQuizQuestion(id);
    }

    @PostMapping ("submit/{id}")
    public ResponseEntity<Integer> calculateScore(@PathVariable Integer id,@RequestBody List<Response> responses){
        return quizService.calculateScore(id, responses);
    }
}
