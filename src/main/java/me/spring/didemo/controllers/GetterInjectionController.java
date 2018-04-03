package me.spring.didemo.controllers;

import me.spring.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class GetterInjectionController {
    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.SayHello();
    }

    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
