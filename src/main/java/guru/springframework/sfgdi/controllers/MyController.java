package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.service.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String greeting(){
        System.out.println("Hello world");
        return "Hi folks";
    }

    public String getGreeting(){
        return greetingService.greeting();
    }
}
