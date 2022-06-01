package com.example.scholardevopstest.dtos;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter
public class ScholarRequest {
    private String inumber;
    private String name;
    private float cgpa;
    private String stream;
    private String batch;
    private int practicalPhase;
    private String teamName;
    private String lob;
    private String managerName;
    private String managerInumber;
    private String techStack;
    private String vtName;
    private String vtInumber;
    private String vtproject;
}
