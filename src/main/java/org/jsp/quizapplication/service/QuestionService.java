package org.jsp.quizapplication.service;

import java.util.List;
import org.jsp.quizapplication.entity.Question;
import org.springframework.http.ResponseEntity;

public interface QuestionService {

	ResponseEntity<?> saveQuestion(Question question);

	ResponseEntity<?> getAllQuestions();

}
