package com.cydeo.controller;

import com.cydeo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class StudentController {

    @RequestMapping("/welcome")
    public String homePage(Model model){
        model.addAttribute("name","Class for me");
        model.addAttribute("course","Java");

        String subject="Collections";
        model.addAttribute("subject",subject);

        //create some randomn studentId(0-1000) and show it on UI

        int studentID= new Random().nextInt();
        model.addAttribute("studentID",studentID);

        List<Integer> numbers=new ArrayList<>();
        numbers.add(4);
        numbers.add(5);
        numbers.add(7);
        numbers.add(10);
        model.addAttribute("numbers",numbers);

        Student student=new Student(1,"Mike","Smith");
        model.addAttribute("student",student);

        return "/student/welcome";

    }
}
