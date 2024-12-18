
package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Clue;
import com.example.demo.models.Question;
import com.example.demo.repositories.QuestionRepository;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {
    @Autowired
    private QuestionRepository questionRepository;

    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    public Question saveQuestion(Question question) {
        return questionRepository.save(question);
    }

	public Optional<Question> getQuestionByID(long id) {
		// TODO Auto-generated method stub
		return questionRepository.findById(id);
	}
}

