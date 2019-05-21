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
import java.text.DecimalFormat;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;



public class HelloWorldApp {
    public static void main(String[] args) {
        Person person = Person.Builder().salutation("Mr. ")
                .firstName("Nguyen")
                .middleName("Duc")
                .lastName("Hoang")
                .suffix("AA")
//                .address("Số nhà 45 ngõ Mai Hương, Bạch Mai, Hà ")
                .isFemale(false)
                .isEmployed(true)
                .isHomewOwner(false)
                .build();
        person.printDetails();
    }
}

