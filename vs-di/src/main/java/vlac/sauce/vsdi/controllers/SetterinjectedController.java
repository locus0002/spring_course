package vlac.sauce.vsdi.controllers;

import vlac.sauce.vsdi.services.GreetingServices;

public class SetterinjectedController {

    private GreetingServices greetingService;

    public String getGreeting() {
        return this.greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingServices greetingService) {
        this.greetingService = greetingService;
    }

    
}
