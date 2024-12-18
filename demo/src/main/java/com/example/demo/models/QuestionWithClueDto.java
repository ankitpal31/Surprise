package com.example.demo.models;

public class QuestionWithClueDto {

    private Question question;
    private Clue clue;
    private String correctAnswer;

    public QuestionWithClueDto(Question question, Clue clue, String correctAnswer) {
        this.question = question;
        this.clue = clue;
        this.correctAnswer = correctAnswer;
    }

    public Question getQuestion() {
        return question;
    }

    public Clue getClue() {
        return clue;
    }

	public String getCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public void setClue(Clue clue) {
		this.clue = clue;
	}
    
    
}

