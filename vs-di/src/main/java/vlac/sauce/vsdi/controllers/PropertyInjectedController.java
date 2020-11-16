package vlac.sauce.vsdi.controllers;

import vlac.sauce.vsdi.services.GreetingServices;

public class PropertyInjectedController {

    public GreetingServices greetingService;

    public String getGreeting() {
        return this.greetingService.sayGreeting();
    }
    
}
