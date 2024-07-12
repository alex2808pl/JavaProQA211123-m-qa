package de.telran.lesson_20;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class SimpleZoneDateTime {
    public static void main(String[] args) {
        ZonedDateTime zdt1 = ZonedDateTime.now();
        System.out.println("Current = "+zdt1);

        // получить из строки
        String zdtString = "2024-07-12T13:04:58.108656500+02:00[Europe/Berlin]";
        ZonedDateTime zdt2 = ZonedDateTime.parse(zdtString);
        System.out.println("User = "+zdt2);

        ZoneId zoneIdAfrica = ZoneId.of("Africa/Cairo");
        ZonedDateTime zdt3 = ZonedDateTime.now(zoneIdAfrica);
        System.out.println("Current Africa = "+zdt3);

        ZoneId zoneIdIndia = ZoneId.of("Asia/Kolkata");
        ZonedDateTime zdt4 = ZonedDateTime.now(zoneIdIndia);
        System.out.println("Current India = "+zdt4);

        //ZoneId.getAvailableZoneIds().forEach(System.out::println);
    }
}
