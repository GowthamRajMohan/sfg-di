package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.service.ConstructorGreetingImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new ConstructorGreetingImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}