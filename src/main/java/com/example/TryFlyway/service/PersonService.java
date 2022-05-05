package com.example.TryFlyway.service;

import com.example.TryFlyway.model.Person;
import com.example.TryFlyway.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public List<Person> getAllPerson(){
        List<Person> personList = personRepository.findAll();
        return personList;
    }
}
