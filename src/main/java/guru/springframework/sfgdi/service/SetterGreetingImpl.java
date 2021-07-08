package guru.springframework.sfgdi.service;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingImpl implements GreetingService {
    @Override
    public String greeting() {
        return "Hello world - setter";
    }
}
