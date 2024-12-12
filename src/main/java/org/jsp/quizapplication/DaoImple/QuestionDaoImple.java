package org.jsp.quizapplication.DaoImple;

import java.util.List;

import org.jsp.quizapplication.Dao.QuestionDao;
import org.jsp.quizapplication.entity.Question;
import org.jsp.quizapplication.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class QuestionDaoImple implements QuestionDao  {
	
	@Autowired
	private QuestionRepository repository;

	@Override
	public Question saveQuestion(Question question) {
		
		return repository.save(question);
		
		
	}

	@Override
    public List<Question> getAllQuestion() {
        return repository.findAll(); // Fetch all questions from the database
    }


}
