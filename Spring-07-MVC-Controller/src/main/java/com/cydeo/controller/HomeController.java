package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //Annotate the class with the @Controller stereotype annotation
public class HomeController {

    //MVC is architecture
    //It is Model View Controller
    //Tymeleaf, template engine is dependency that allows you to easily get and display in the view variable data that the controller sends

    @RequestMapping("/home") //Use @RequestMapping annotation to associate the action with an HTTP request path
    //Mapping is happening through endpoint
    public String home(){

        return "home.html"; //Return the HTML document name that contains the details we want the browser to display
    }

    @RequestMapping("/welcome")
    public String welcome(){
        return "welcome.html";
    }


}
