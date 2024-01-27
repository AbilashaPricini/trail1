package com.telusko.quizapp.controller;

import com.telusko.quizapp.model.Question;
import com.telusko.quizapp.model.QuestionWrapper;
import com.telusko.quizapp.model.Response;
import com.telusko.quizapp.service.QuizService;
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
    public ResponseEntity<String> createQuiz(@RequestParam String category, @RequestParam int numQ,
                                             @RequestParam String title){
        return quizService.createQuiz(category, numQ, title);
    }

    @GetMapping("getQuestion/{id}")
    public ResponseEntity<List<QuestionWrapper>> getQuizQuestion(@PathVariable Integer id){
        return quizService.getQuizQuestion(id);
    }

    @GetMapping("submit/{id}")
    public ResponseEntity<Integer> calculateScore(@PathVariable Integer id,@RequestBody List<Response> responses){
        return quizService.calculateScore(id, responses);
    }
}
