package pl.sda.spring.boot1;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public void greetings() {
        System.out.println("Greetings from Spring Boot! It's awesome!");
    }
}
