package com.SelectionProject.SelectionProject.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;

@RestController
public class FormController {

    @PostMapping("/form")
    public int agePoints(@PathVariable(name = "age") int age, Model model) {
        int points = 0;
        if(age >= 18 && age <= 35){
            points = 16;
        }else if(age == 36){
            points = 14;
        }else if(age == 37){
            points = 12;
        }else if(age == 38){
            points = 10;
        }else if(age == 39){
            points = 8;
        }else if(age == 40){
            points = 6;
        }else if(age == 41){
            points = 4;
        }else if(age == 42){
            points = 2;
        }else{
            points = 0;
        }
        return points;
    }
}
