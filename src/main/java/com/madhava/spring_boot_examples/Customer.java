package com.madhava.spring_boot_examples;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class Customer {

    @PostConstruct
    public void init() {
        System.out.println("Inside Customer Class");
    }
}
