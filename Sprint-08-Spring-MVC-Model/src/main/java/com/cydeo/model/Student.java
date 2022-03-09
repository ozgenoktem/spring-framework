package com.cydeo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private int id;
    private String firstName;
    private String lastName;

    //POJOs doesnnt get annotations
    //If it has deependeency we need to add Component annotation

}
