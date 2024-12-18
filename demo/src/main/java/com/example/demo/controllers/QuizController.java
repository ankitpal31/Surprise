
package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.models.Clue;
import com.example.demo.models.Question;
import com.example.demo.models.QuestionWithClueDto;
import com.example.demo.services.ClueService;
import com.example.demo.services.QuestionService;
import com.example.demo.services.QuizService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class QuizController {

    @Autowired
    private QuestionService questionService;

    @Autowired
    private ClueService clueService;
    
    @Autowired
    private QuizService quizService;

    // Endpoint to get all questions
    @GetMapping("/questions")
    public List<Question> getAllQuestions() {
        return questionService.getAllQuestions();
    }

    // Endpoint to get all clues
    @GetMapping("/clues")
    public List<Clue> getAllClues() {
        return clueService.getAllClues();
    }

    // (Optional) Endpoint to add questions
    @PostMapping("/questions")
    public Question addQuestion(@RequestBody Question question) {
        return questionService.saveQuestion(question);
    }

    // (Optional) Endpoint to add clues
    @PostMapping("/clues")
    public Clue addClue(@RequestBody Clue clue) {
        return clueService.saveClue(clue);
    }
    
    @GetMapping("/question/{questionId}")
    public Optional<Question> getQuestionByID(@PathVariable("questionId") long id) {
        return questionService.getQuestionByID(id);
    }
    
    @GetMapping("/images/{imageName}")
    public String getImage(@PathVariable("imageName") String imageName) {
        return "/images/" + imageName;
    }
    
    @GetMapping("/question/clue/{questionId}")
    public QuestionWithClueDto getClueByQuestionId(@PathVariable("questionId") long questionId) {
    	return quizService.getQuestionWithClue(questionId);
    }
}

