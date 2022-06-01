package com.example.scholardevopstest.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;

@Getter
@Setter
@Embeddable
public class CurrentPracticalPhase {
    private int practicalPhase;
    private String teamName;
    private String lob;
    private String managerName;
    private String managerInumber;
    private String techStack;
}
