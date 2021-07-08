package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.service.ConstructorGreetingImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setup(){
        controller = new PropertyInjectedController();
        controller.greetingService = new ConstructorGreetingImpl();
    }

    @Test
    void getGreeting(){
        System.out.println(controller.getGreeting());
    }

}