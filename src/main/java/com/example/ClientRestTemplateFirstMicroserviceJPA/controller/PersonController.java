package com.example.ClientRestTemplateFirstMicroserviceJPA.controller;

import com.example.ClientRestTemplateFirstMicroserviceJPA.model.Person;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
public class PersonController {

    private final RestTemplate restTemplate;
    String url = "http://localhost:8080";

    public PersonController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping(value = "/people/{name}/{email}/{age}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Person> addPerson(@PathVariable(name = "name")String name,
                                  @PathVariable(name = "email")String email,
                                  @PathVariable(name = "age") int age){
        Person person = new Person(name, email, age);
        restTemplate.postForLocation(url + "/contacts", person);
        Person[] people = restTemplate.getForObject(url + "/contacts", Person[].class);
        return Arrays.asList(people);
    }
}
