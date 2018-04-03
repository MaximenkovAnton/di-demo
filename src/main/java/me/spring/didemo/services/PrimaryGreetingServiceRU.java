package me.spring.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("ru")
public class PrimaryGreetingServiceRU implements GreetingService {

    @Override
    public String SayHello() {
        return "Привет";
    }
}
