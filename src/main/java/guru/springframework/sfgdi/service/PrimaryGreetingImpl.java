package guru.springframework.sfgdi.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetingImpl implements GreetingService {
    @Override
    public String greeting() {
        return "Hello world - Primary";
    }
}
