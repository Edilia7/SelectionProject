package com.SelectionProject.SelectionProject.controller;



import com.SelectionProject.SelectionProject.model.Person;
import com.SelectionProject.SelectionProject.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @PostMapping("/person")
    public Person savePerson(@ModelAttribute @Valid Person person, Model model) {
        return personRepository.save(person);
    }

    @GetMapping("/person/{id}")
    public Person getPerson(@PathVariable(value = "id") long id){
        return personRepository.findById(id);
    }
}
