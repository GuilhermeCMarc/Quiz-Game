package com.guilherme.backend.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String heading;

    @OneToMany(mappedBy = "question", cascade = CascadeType.DETACH, orphanRemoval = true)
    private List<Alternative> alternatives;

    @Column(nullable = false)
    private Integer answerIndex;
}
