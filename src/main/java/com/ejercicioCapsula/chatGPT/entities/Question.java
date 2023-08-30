package com.ejercicioCapsula.chatGPT.entities;

import java.time.LocalDateTime;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native" , strategy = "native")
    private Long id;
    private Long userId;
    private String question;
    private LocalDateTime date;
    @ManyToOne
    private Answer answer;

    public Question() {
    }

    public Question(Long id, Long userId, String question, LocalDateTime date, Answer answer) {
        this.id = id;
        this.userId = userId;
        this.question = question;
        this.date = date;
        this.answer = answer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }
}