package com.ejercicioCapsula.chatGPT.repositories;

import com.ejercicioCapsula.chatGPT.entities.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Long> {
    Answer findByAnswer(String answer);
}
