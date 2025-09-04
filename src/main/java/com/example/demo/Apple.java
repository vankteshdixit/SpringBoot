package com.example.demo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;


public class Apple {

    void eatApple(){
        System.out.println("I am eating the apple");
    }

    @PostConstruct
//    called whenever we are creating the object of this ->eatApple
    void callThisBeforeAppleIsUsed(){
        System.out.println("Creating the apple before use");
    }

    @PreDestroy
    void callThisBeforeDestroy(){
        System.out.println("Destroy");
    }
}
