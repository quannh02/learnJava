package com.mycompany.helloworldapp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author quan
 */
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class HelloWorldApp {
    public static void main(String[] args) {
        Function<Person, String> showNameAndEmail = person -> {
            return "Name: "+person.getName()+" Email: "+person.getEmail();
        };
        Function<Person, String> showNameAndAge = person -> {
            return "Name: "+person.getName()+" Age: "+person.getAge();
        };
        Person personA = new Person("Nguyen Duc Hoang",
                "hoang@gmail.com",40,
                "Mai Huong, Hanoi, Vietnam");
        personA.showDetails(showNameAndEmail);
        personA.showDetails(showNameAndAge);
        personA.showDetails(showNameAndAge);
    }
}

