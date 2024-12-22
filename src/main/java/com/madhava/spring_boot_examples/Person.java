package com.madhava.spring_boot_examples;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("uat")
public class Person {

    @PostConstruct
    public void init() {
        System.out.println("Inside Person Class");
    }
}
