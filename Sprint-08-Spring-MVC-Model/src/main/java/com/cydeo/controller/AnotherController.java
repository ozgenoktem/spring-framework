package com.cydeo.controller;

import com.cydeo.enums.Gender;
import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/another")
public class AnotherController {

    @RequestMapping("/list")   //localhost:8080/another/list
    public String showTable(Model model) {  //Method name doesnt matter

        List<Mentor>mentorList=new ArrayList<>();

        mentorList.add(new Mentor("Mike","Smith",45,Gender.MALE));
        mentorList.add(new Mentor("Tom","Hanks",25,Gender.MALE));
        mentorList.add(new Mentor("Julie","Bryan",20,Gender.FEMALE));

        model.addAttribute("mentors",mentorList);

        return "mentor/mentor-list";
    }
}

