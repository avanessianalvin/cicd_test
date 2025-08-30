package com.sian.ci_cd.model.repository;

import com.sian.ci_cd.model.entity.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonDA {
    private static final List<Person> personList = new ArrayList<>();
    public void insert(Person person){
        personList.add(person);
    }
    public List<Person> findAll(){
        return personList;
    }
}
