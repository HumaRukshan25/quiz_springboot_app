package org.jsp.quizapplication.repository;

import java.util.List;

import org.jsp.quizapplication.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer> {

	List<Question> findAll();


}
