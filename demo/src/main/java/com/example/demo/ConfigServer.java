package com.example.demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigServer {

    @Value("${credit.application.message}")
    private String message;

    @PostConstruct
    public void displayConfig() {
        System.out.println("#####################   \n" + "");

        System.out.println("#####################   \n" + message);
    }
}