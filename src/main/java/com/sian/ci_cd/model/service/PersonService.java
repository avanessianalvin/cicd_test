package com.sian.ci_cd.model.service;

import com.sian.ci_cd.model.entity.Person;
import com.sian.ci_cd.model.repository.PersonDA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonDA personDA;

    public void save(Person person){
        personDA.insert(person);
    }

    public List<Person> getAll(){
        return personDA.findAll();
    }
}
