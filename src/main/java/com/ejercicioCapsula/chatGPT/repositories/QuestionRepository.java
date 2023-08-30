package com.ejercicioCapsula.chatGPT.repositories;

import com.ejercicioCapsula.chatGPT.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
    Question findByQuestion(String question);
}
