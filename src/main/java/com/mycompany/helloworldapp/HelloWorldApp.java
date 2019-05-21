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

class Stock {
    private String symbol;
    private String companyName;
    private double previosClosingPrice;
    private double currentPrice;

    Stock(String symbol, String companyName) {
        this.symbol = symbol;
        this.companyName = companyName;
    }

    double getChangePercent() {
        double percent = ((currentPrice - previosClosingPrice)/previosClosingPrice) * 100;
        DecimalFormat format = new DecimalFormat("#.##");
        return Double.valueOf(format.format(percent));
    }

    void setPreviosClosingPrice(double newValue) {
        previosClosingPrice = newValue;
    }

    void setCurrentPrice(double newValue) {
        currentPrice = newValue;
    }
}

public class HelloWorldApp {
    public static void main(String[] args) {
        System.out.println("AbstractMap để lưu dữ liệu dạng Key-Value");
        AbstractMap<String, Object> mapEmployee = new HashMap<String, Object>();
        if (mapEmployee.isEmpty()) {
            System.out.println("HashMap is empty");
        }
        mapEmployee.put("name", "Hoang");
        mapEmployee.put("age", 30);
        System.out.println("Detail employee: ");
        System.out.println("Name: " + mapEmployee.get("name") + " Age: " + mapEmployee.get("age"));
        System.out.println("Size: "+mapEmployee.size());
        AbstractMap<Double, Double> mapPoints = new HashMap<Double, Double>();
        mapPoints.put(1.0, 5.0);
        mapPoints.put(2.0, 1.0);
        mapPoints.put(4.0, 50.0);
        mapPoints.put(5.0, 51.0);
        mapPoints.forEach((key, value) -> {
            System.out.println("Key ="+key+".Value = "+value);
        });
        mapPoints.remove(4.0);
        mapPoints.forEach((key, value)->{
            System.out.println("Key ="+key+".Value = "+value);
        });

        System.out.println("Hashcode: "+mapPoints.hashCode());
        AbstractMap<String, Object> mapEmployee2 = new HashMap<String, Object>();
        mapEmployee2.put("name", "Hoang");
        mapEmployee2.put("age", 30);
        System.out.println(mapEmployee.equals(mapEmployee2));
    }
}

