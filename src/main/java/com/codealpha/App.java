package com.codealpha;

import org.apache.commons.lang3.StringUtils;

public class App {
    public static void main(String[] args) {
        String message = "hello devops world";
        String capitalized = StringUtils.capitalize(message);
        System.out.println("Original: " + message);
        System.out.println("Capitalized: " + capitalized);
        System.out.println("Gradle build working!");
    }
    
    public static String getGreeting() {
        return "Hello from DevOps Gradle App!";
    }
}
