package com.SelectionProject.SelectionProject.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class Form {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int age;
    private String educationalLevel;
    private String trainingLevel;
    private int level;
    private int workExperience;
    private int stayCanada;
    private String familyCanada;
    private int children;
    private String married;
}
