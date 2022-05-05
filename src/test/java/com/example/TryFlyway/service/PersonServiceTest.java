package com.example.TryFlyway.service;

import com.example.TryFlyway.model.Person;
import com.example.TryFlyway.repository.PersonRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
class PersonServiceTest {


    @InjectMocks
    PersonService personService;
    @Mock
    PersonRepository personRepository;

    static List<Person> personList;
    @BeforeAll
    public static void setUp(){
        personList=new ArrayList<>();
        personList.add(new Person(1,"mockName", "mockAddress", "mockCity"));
    }

    @Test
    void getAllPersonTest() {
        Mockito.when(personRepository.findAll()).thenReturn(personList);
        Assertions.assertEquals(personList, personService.getAllPerson());
//        Assertions.assertEquals(null, personService.getAllPerson());
    }
}