package me.spring.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GetterGreetingService implements GreetingService{
    @Override
    public String SayHello() {
        return "Hello from getter";
    }
}
