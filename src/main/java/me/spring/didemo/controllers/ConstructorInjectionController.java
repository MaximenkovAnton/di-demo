package me.spring.didemo.controllers;

import me.spring.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectionController {
    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.SayHello();
    }

    public ConstructorInjectionController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
