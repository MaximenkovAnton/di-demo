package me.spring.didemo.controllers;

import me.spring.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private GreetingService greetingServiceImpl;

    public MyController(@Qualifier("greetingServiceImpl") GreetingService greetingServiceImpl) {
        this.greetingServiceImpl = greetingServiceImpl;
    }

    public String sayHello(){
        System.out.println("Hello");
        return greetingServiceImpl.SayHello();
    }
}
