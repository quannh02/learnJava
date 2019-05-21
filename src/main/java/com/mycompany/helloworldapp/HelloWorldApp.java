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
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class HelloWorldApp {
    public static void main(String[] args) {
        List<Person> persons = Person.generateListOfPersons();
        SearchManager searchManager = SearchManager.getInstance();
//        Predicate predicate = searchManager.getPredicate("predicateAgeOver30");
        Predicate predicate = searchManager.getPredicate("predicateAgeBetween30And40");
        System.out.println("List after filtered");
        persons.stream().filter(predicate).forEach(person -> {
            ((Person) person).showDetails();
        });

        System.out.println("Clone Result to another List");
        List<Person> filteredList = (List<Person>)persons.stream().filter(predicate).collect(Collectors.toList());
        filteredList.forEach(person -> person.showDetails());
    }
}

