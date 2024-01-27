package com.telusko.quizapp.service;

import com.telusko.quizapp.dao.QuestionDao;
import com.telusko.quizapp.dao.QuizDao;
import com.telusko.quizapp.model.Question;
import com.telusko.quizapp.model.QuestionWrapper;
import com.telusko.quizapp.model.Quiz;
import com.telusko.quizapp.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuizService {

    @Autowired
    public QuizDao quizDao;
    @Autowired
    public QuestionDao questionDao;
    public ResponseEntity<String> createQuiz(String category, int numQ, String title) {
        Quiz quiz = new Quiz();
        List<Question> questionList = questionDao.findRandomQuestionsByCategory(category, numQ);
        quiz.setTitle(title);
        quiz.setQuestions(questionList);
        quizDao.save(quiz);
        return new ResponseEntity<>("Success", HttpStatus.CREATED);
    }


    public ResponseEntity<List<QuestionWrapper>> getQuizQuestion(int id) {
        Optional<Quiz> quiz = quizDao.findById(id);
        List<Question> questionsFromDB = quiz.get().getQuestions();
        List<QuestionWrapper> questionsForUser = new ArrayList<>();
        for(Question q : questionsFromDB){
            QuestionWrapper questionWrapper = new QuestionWrapper(q.getId(), q.getQuestionTitle(),
                    q.getOption1(), q.getOption2(), q.getOption3(), q.getOption4());
            questionsForUser.add(questionWrapper);

        }
        return new ResponseEntity<>(questionsForUser, HttpStatus.OK);
    }

    public ResponseEntity<Integer> calculateScore(Integer id, List<Response> responses) {
        Quiz quiz = quizDao.findById(id).get();
        List<Question> questionList = quiz.getQuestions();
        int i = 0;
        int right = 0;
        for(Response r : responses){
            if(r.getResponse().equals(questionList.get(i).getRightAnswer()))
                right++;
            i++;
        }
        return new ResponseEntity<>(right, HttpStatus.OK);
    }
}
