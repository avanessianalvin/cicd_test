package com.sian.ci_cd.controller;

import com.sian.ci_cd.model.entity.Person;
import com.sian.ci_cd.model.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Method;
import java.util.List;

@RestController
@RequestMapping("/api/person")
public class PersonApi {
    @Autowired
    PersonService personService;

    @PostMapping("/save")
    public void save(@RequestBody Person person){
        System.out.println("HERE");
        personService.save(person);
    }

    @GetMapping("/getAll")
    public List<Person> getAll(){
        return personService.getAll();
    }

}
