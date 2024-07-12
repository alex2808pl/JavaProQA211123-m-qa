package de.telran.lesson_20;

import java.time.LocalDate;
import java.time.Month;

public class SimpleLocalDate {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.now();
        System.out.println("Current = "+ld1);

        LocalDate ld2 = LocalDate.of(2024, Month.MARCH, 30);
        System.out.println("User = "+ld2);

        System.out.println("Day = " + ld1.getDayOfMonth());
        System.out.println("Month = " + ld1.getMonth() +" - "+ld1.getMonthValue());
        System.out.println("Year = " + ld1.getYear());

        System.out.println("+ 1 Year = " + ld1.plusYears(1));
        System.out.println(" - 3 Month = " + ld1.minusMonths(3));



    }
}
