package com.kmit;

/** Small business-logic class that can be tested by Maven. */
public class GreetingService {
    public String getGreeting(String name) {
        if (name == null || name.trim().isEmpty()) {
            return "Hello, Student!";
        }
        return "Hello, " + name.trim() + "!";
    }
}
