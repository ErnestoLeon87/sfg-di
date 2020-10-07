package devtorex.springframework.sfgdi.controllers;

import devtorex.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContructorInjectedControlllerTest {

    ContructorInjectedControlller controller;


    @BeforeEach
    void setUp() {
        controller = new ContructorInjectedControlller(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}