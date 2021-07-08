package com.example;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;




public class GreetingMessageTest {

    @Test
    public void testGreetingMessage() {
        GreetingMessage message = GreetingMessage.of("Say Hello to JatartaEE");
        assertEquals(message.getMessage(), "Say Hello to JatartaEE");
    }
}
