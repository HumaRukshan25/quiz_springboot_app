package org.jsp.quizapplication.controller;

import java.util.List;

import org.jsp.quizapplication.entity.Question;
import org.jsp.quizapplication.service.QuestionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/questions")

public class QuestionController {
	@Autowired
	private QuestionService service;

    @PostMapping
    public ResponseEntity<?> saveQuestion(@RequestBody Question question) {
        return service.saveQuestion(question);
    }

    @GetMapping
    public ResponseEntity<?> getAllQuestions() {
        return service.getAllQuestions();
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<Question> getQuestionById(@PathVariable int id) {
//        return service.getQuestionById(id);
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public ResponseEntity<Void> deleteQuestion(@PathVariable int id) {
//        return service.deleteQuestion(id);
//    }
}
