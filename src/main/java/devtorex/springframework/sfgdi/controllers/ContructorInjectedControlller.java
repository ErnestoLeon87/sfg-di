package devtorex.springframework.sfgdi.controllers;

import devtorex.springframework.sfgdi.services.ConstructorGreetingService;
import devtorex.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ContructorInjectedControlller {
    private final GreetingService greetingService;

    public ContructorInjectedControlller(ConstructorGreetingService greetingService) {
        this.greetingService = greetingService;
    }


    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
