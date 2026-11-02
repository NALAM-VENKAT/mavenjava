package com.kmit;

/** Entry point for the Maven Java CI/CD demonstration project. */
public class App {
    public static void main(String[] args) {
        System.out.println(new GreetingService().getGreeting("Maven Java"));
    }
}
