package com.example;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class GreetingServiceUnitTest {

    GreetingService service;

    @BeforeTest
    public void setup() {
        service = new GreetingService();
    }

    @Test
    public void testGreeting(){
        GreetingMessage message = service.buildGreetingMessage("JakartaEE");
       assertTrue(message.getMessage().startsWith("Say Hello to JakartaEE"));
    }
}
