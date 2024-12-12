package org.jsp.quizapplication.serviceImple;

import java.util.List;

import org.jsp.quizapplication.Dao.QuestionDao;
import org.jsp.quizapplication.entity.Question;
import org.jsp.quizapplication.exceptionclassess.NoQuestionFoundException;
import org.jsp.quizapplication.responsestructure.ResponseStructure;
import org.jsp.quizapplication.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class QuestionServiceImple implements QuestionService {

    @Autowired
    private QuestionDao dao;

    @Override
    public ResponseEntity<?> saveQuestion(Question question) {
        dao.saveQuestion(question);
        ResponseStructure<Question> structure = new ResponseStructure<>();
        structure.setHttpStatus(HttpStatus.OK.value());
        structure.setMessage("Questions saved successfully");
        structure.setBody(question);
        return new ResponseEntity<>(structure, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> getAllQuestions() {
        List<Question> questions = dao.getAllQuestion();
        if (questions.isEmpty()) {
            throw NoQuestionFoundException
                    .builder()
                    .message("No Question found in the database")
                    .build();
        }

//        ResponseStructure<List<Question>> structure = new ResponseStructure<>();
//        structure.setHttpStatus(HttpStatus.OK.value());
//        structure.setMessage("All questions found successfully");
//        structure.setBody(questions);
//
//        return new ResponseEntity<>(structure, HttpStatus.OK);
        ResponseStructure<List<Question>> structure = ResponseStructure
                .<List<Question>>builder()
                .httpstatus(HttpStatus.OK.value())
                .message("All questions found successfully")
                .body(questions)
                .build();

        return new ResponseEntity<>(structure, HttpStatus.OK);
    }
}
