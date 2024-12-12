package org.jsp.quizapplication.Dao;

import java.util.List;

import org.jsp.quizapplication.entity.Question;

public interface QuestionDao {

	Question saveQuestion(Question question);

	List<Question> getAllQuestion();
	
}
