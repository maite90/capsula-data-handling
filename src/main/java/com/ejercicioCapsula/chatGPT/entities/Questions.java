package com.ejercicioCapsula.chatGPT.entities;

import java.time.LocalDateTime;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import org.hibernate.annotations.GenericGenerator;

public class Questions {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native" , strategy = "native")
    private Long id;
    private Long userId;
    private String question;
    private LocalDateTime date;
    @OneToMany(mappedBy = "question")
    private List<HistorialPreguntas> historialPreguntas;

}