package com.javadevta.dp;

class Singleton {
    // Step 1: Create a private static instance of the same class
    private static Singleton instance;

    // Step 2: Make the constructor private to prevent direct instantiation
    private Singleton() {
        System.out.println("Singleton instance created");
    }

    // Step 3: Provide a public static method to get the instance
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton");
    }
}

public class TrySingleton {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2); // true
        s1.showMessage();
    }
}