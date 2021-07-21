package com.example;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GreetingServiceUnitTest {

    GreetingService service;

    @BeforeEach
    public void setup() {
        service = new GreetingService();
    }

    @Test
    public void testGreeting(){
        GreetingMessage message = service.buildGreetingMessage("JakartaEE");
       assertTrue(message.getMessage().startsWith("Say Hello to JakartaEE"));
    }
}
