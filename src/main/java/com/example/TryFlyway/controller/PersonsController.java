package com.example.TryFlyway.controller;

import com.example.TryFlyway.model.Person;
import com.example.TryFlyway.model.Users;
import com.example.TryFlyway.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonsController {

    @Autowired
    PersonService personService;

    @Autowired
    RestTemplate restTemplate;

//    @Value("${endpoint}")
//    String endpoint;
//    @GetMapping("/all")
//    public List<Person> getAll(){
////        ResponseEntity<String> usersList= restTemplate.getForEntity(endpoint, String.class);
////        System.out.println(usersList);
//        return personService.getAllPerson();
//    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }
}
