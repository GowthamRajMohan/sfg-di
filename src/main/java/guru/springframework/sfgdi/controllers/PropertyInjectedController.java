package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("propertyGreetingImpl")
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.greeting();
    }
}
