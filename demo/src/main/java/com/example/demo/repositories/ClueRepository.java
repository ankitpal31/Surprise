
package com.example.demo.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Clue;

@Repository
public interface ClueRepository extends JpaRepository<Clue, Long> {

	Optional<Clue> findByOrderNumber(Long questionId);
	}

