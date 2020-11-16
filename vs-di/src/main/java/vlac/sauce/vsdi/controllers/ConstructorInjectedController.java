package vlac.sauce.vsdi.controllers;

import vlac.sauce.vsdi.services.GreetingServices;

public class ConstructorInjectedController {
    //this a best practice cause the attribute is not going to change
    private final GreetingServices greetingService;

    public ConstructorInjectedController(GreetingServices greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return this.greetingService.sayGreeting();
    }
    
}
