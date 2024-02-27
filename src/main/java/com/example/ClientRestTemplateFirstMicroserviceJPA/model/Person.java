package com.example.ClientRestTemplateFirstMicroserviceJPA.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Person {

    private String name;
    private String email;
    private int age;

}
