package vlac.sauce.vsdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import vlac.sauce.vsdi.services.GreetingServicesImpl;

class SetterinjectedControllerTest {
    SetterinjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterinjectedController();
        controller.setGreetingService(new GreetingServicesImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
    
}
