package com.ejercicioCapsula.chatGPT.entities;
import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.ArrayList;
import java.util.List;

public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native" , strategy = "native")
    private Long id;
    private String answer;
    @OneToMany(mappedBy="answer")
    private List<Question> questionList= new ArrayList<>();

    public Answer() {
    }

    public Answer(Long id, String answer, List<Question> questionList) {
        this.id = id;
        this.answer = answer;
        this.questionList = questionList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public List<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }
}
