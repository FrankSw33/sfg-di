package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    // Autowired is optional here
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        // Qualifier name is the class name with lower case first char

        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return  greetingService.sayGreeting();
    }
}
