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
import java.util.Collections;
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
        Stock stock = new Stock("ORCL", "Oracle Corporation");
        stock.setPreviosClosingPrice(122.00);
        stock.setCurrentPrice(144.00);
        System.out.println(stock.getChangePercent());
    }
}

