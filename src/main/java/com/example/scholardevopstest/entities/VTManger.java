package com.example.scholardevopstest.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;

@Getter
@Setter
@Embeddable
public class VTManger {
    private String vtName;
    private String vtInumber;
}
