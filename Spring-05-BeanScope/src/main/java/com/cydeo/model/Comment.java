package com.cydeo.model;
import lombok.Data;

@Data
public class Comment {

    private String author;
    private String text;

    //it doesnt have dependency, and we didnt add component
}
