package com.example.it;

import static org.testng.Assert.assertTrue;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.example.GreetingMessage;
import com.example.GreetingService;
import jakarta.inject.Inject;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.testng.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.testng.annotations.Test;





public class GreetingServiceTest extends Arquillian {
    private final static Logger LOGGER = Logger.getLogger(GreetingServiceTest.class.getName());

    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(GreetingMessage.class)
                .addClass(GreetingService.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @Inject
    GreetingService service;

    @Test
    public void should_create_greeting() {
        LOGGER.log(Level.INFO, " Running test:: GreetingServiceTest#should_create_greeting ... ");
        GreetingMessage message = service.buildGreetingMessage("Jakarta EE");
        assertTrue(message.getMessage().startsWith("Say Hello to Jakarta EE at "),
                "message should start with \"Say Hello to Jakarta EE at \"");
    }
}
