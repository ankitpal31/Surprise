package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Clue;
import com.example.demo.models.Question;
import com.example.demo.models.QuestionWithClueDto;
import com.example.demo.repositories.ClueRepository;
import com.example.demo.repositories.QuestionRepository;

@Service
public class QuizService {

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private ClueRepository clueRepository;

    // Method to fetch a question along with its clue
    public QuestionWithClueDto getQuestionWithClue(Long questionId) {
        Question question = questionRepository.findById(questionId).orElseThrow();
        Clue clue = clueRepository.findByOrderNumber(questionId).orElseThrow();
        String correctAnswer = "";
        if(question.getOptionA().equalsIgnoreCase(question.getCorrectOption())) {
        	correctAnswer = "A";
        } else if(question.getOptionD().equalsIgnoreCase(question.getCorrectOption())) {
        	correctAnswer = "D";
        } else if(question.getOptionB().equalsIgnoreCase(question.getCorrectOption())) {
        	correctAnswer = "B";
        } else if(question.getOptionC().equalsIgnoreCase(question.getCorrectOption())) {
        	correctAnswer = "C";
        } 
        return new QuestionWithClueDto(question, clue,correctAnswer);
    }
}
