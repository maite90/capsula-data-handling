package com.ejercicioCapsula.chatGPT.controllers;

import com.ejercicioCapsula.chatGPT.repositories.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chat")
public class Controller {

    @Autowired
    AnswerRepository answerRepository;

    @GetMapping("/answers")
    public String getAnswer(){
        return answerRepository.findAll().toString();
    }


}
