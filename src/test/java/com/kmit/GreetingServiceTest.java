package com.kmit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GreetingServiceTest {
    @Test
    public void returnsGreetingForName() {
        assertEquals("Hello, Jenkins!", new GreetingService().getGreeting("Jenkins"));
    }

    @Test
    public void returnsDefaultGreetingForBlankName() {
        assertEquals("Hello, Student!", new GreetingService().getGreeting("  "));
    }
}
