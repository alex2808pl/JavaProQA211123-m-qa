package de.telran.lesson_20;

import java.time.Instant;

public class SimpleInstant {
    public static void main(String[] args) {
        Instant ins1 = Instant.now();
        System.out.println("Current = "+ins1);

        String strIns = "2024-11-11T06:44:30.00Z";
        Instant ins2 = Instant.parse(strIns);
        System.out.println("User = "+ins2);
    }
}
