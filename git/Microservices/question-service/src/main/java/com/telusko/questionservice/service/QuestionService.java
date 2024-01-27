package com.telusko.questionservice.service;

import com.telusko.questionservice.dao.QuestionDao;
import com.telusko.questionservice.model.Question;
import com.telusko.questionservice.model.QuestionWrapper;
import com.telusko.questionservice.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private QuestionDao questionDao;

    public ResponseEntity<List<Question>> getAllQuestions() {
        try {
            return new ResponseEntity<>(questionDao.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<List<Question>> getQuestionsByCategory(String category) {
        try {
            return new ResponseEntity<>(questionDao.findByCategory(category), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<String> addQuestion(Question question) {
        try {
            questionDao.save(question);
            return new ResponseEntity<>("success", HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>("Unsuccessful", HttpStatus.BAD_REQUEST);
    }

    public String deleteQuestion(Question id) {
        questionDao.delete(id);
        return "Deleted";
    }

    public String updateQuestion(Question question) {
        questionDao.save(question);
        return "Updated";
    }

    public ResponseEntity<List<Integer>> generateQuestionsForQuiz(String category, Integer numOfQuestions) {
        List<Integer> questionList = questionDao.findRandomQuestionsByCategory(category, numOfQuestions);
        return new ResponseEntity<>(questionList, HttpStatus.OK);
    }

    public ResponseEntity<List<QuestionWrapper>> getQuestionsFromId(List<Integer> questionsId) {
        List<QuestionWrapper> wrappers = new ArrayList<>();
        List<Question> questionList = new ArrayList<>();

        for (Integer id : questionsId) {
            questionList.add(questionDao.findById(id).get());
        }

        for (Question q : questionList) {
            QuestionWrapper qw = new QuestionWrapper();
            qw.setId(q.getId());
            qw.setQuestionTitle(q.getQuestionTitle());
            qw.setOption1(q.getOption1());
            qw.setOption2(q.getOption2());
            qw.setOption3(q.getOption3());
            qw.setOption4(q.getOption4());
            wrappers.add(qw);
        }


        return new ResponseEntity<>(wrappers, HttpStatus.OK);
    }

    public ResponseEntity<Integer> getScore(List<Response> responses) {
        int right = 0;

        for (Response response : responses) {
            Question question = questionDao.findById(response.getId()).get();
            if (response.getResponse().equals(question.getRightAnswer()))
                right++;
            }
            return new ResponseEntity<>(right, HttpStatus.OK);
        }

}
