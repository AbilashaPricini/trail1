package com.telusko.questionservice.controller;


import com.telusko.questionservice.model.Question;
import com.telusko.questionservice.model.QuestionWrapper;
import com.telusko.questionservice.model.Response;
import com.telusko.questionservice.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    public QuestionService questionService;

    @Autowired
    Environment environment;

    @GetMapping("allQuestions")
    public ResponseEntity<List<Question>> getAllQuestions(){
        return questionService.getAllQuestions();
    }

    @GetMapping("category/{category}")
    public ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable String category){
        return questionService.getQuestionsByCategory(category);
    }

    @PostMapping("add")
    public ResponseEntity<String> addQuestion(@RequestBody Question question){
        return questionService.addQuestion(question);
    }

    @DeleteMapping("delete/{id}")
    public String deleteQuestion(@PathVariable Question id){
        return questionService.deleteQuestion(id);
    }

    @PutMapping("update")
    public String updateQuestion(@RequestBody Question question){
        return questionService.updateQuestion(question);
    }

    //get questions id for quiz which provides category and no.of questions
    @GetMapping("/generate")
    public ResponseEntity<List<Integer>>  generateQuestionsForQuiz(@RequestParam String category, @RequestParam Integer numOfQuestions){
        return questionService.generateQuestionsForQuiz(category, numOfQuestions);

    }

    //if quiz service requesting questions for particular id
    @PostMapping("getQuestions")
    public ResponseEntity<List<QuestionWrapper>> getQuestionsFromId(@RequestBody List<Integer> questionsId){
        System.out.println(environment.getProperty("local.server.port"));
        return questionService.getQuestionsFromId(questionsId);
    }

    @PostMapping("getScore")
    public ResponseEntity<Integer> getScore(@RequestBody List<Response> responses){
        return questionService.getScore(responses);
    }
    //generate questions
    //getQuestions(questionId)
    //getScore

}
