package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Clue;
import com.example.demo.repositories.ClueRepository;

import java.util.List;

@Service
public class ClueService {
    @Autowired
    private ClueRepository clueRepository;

    public List<Clue> getAllClues() {
        return clueRepository.findAll();
    }

    public Clue saveClue(Clue clue) {
        return clueRepository.save(clue);
    }
}

