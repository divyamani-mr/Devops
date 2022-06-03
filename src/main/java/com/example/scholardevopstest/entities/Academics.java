package com.example.scholardevopstest.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;

@Getter
@Setter
@Embeddable
public class Academics {
    private float cgpa;
    private String stream;
    private String batch;
}
