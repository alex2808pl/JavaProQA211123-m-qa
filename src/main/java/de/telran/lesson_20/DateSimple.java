package de.telran.lesson_20;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class DateSimple {
    public static void main(String[] args) {
        Date date1 = new Date();
        System.out.println("Current date1 -> "+date1);

        Date date2 = new Date(3243544346643L);
        System.out.println("User date2 -> "+date2);

        Date date33 = new Date(Long.MAX_VALUE);
        System.out.println("Max date33 -> "+date33);

        System.out.println("date1 > date2 = "+date1.after(date2));
        System.out.println("date1 < date2 = "+date1.before(date2));

        System.out.println("Count date1 mls = "+ date1.getTime());
        date1.setTime(111111111111L); //установим новое время
        System.out.println("Set count date1 mls = "+ date1);

        // Работа с локалью
        Locale locale = new Locale("ru");
        Locale.setDefault(locale);

        Date date3 = new Date();
        System.out.println("Current date (default) -> "+date3);
        String dateString = String.format(locale, "%tc\n", date3);
        System.out.println("String date ru -> "+dateString);

        //Calendar
        Calendar calendar1 = Calendar.getInstance();
        System.out.println("Current calendar = "+calendar1);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Calendar - "+simpleDateFormat.format(calendar1.getTime())); // работа с Calendar
        System.out.println("Date - "+simpleDateFormat.format(new Date())); // работа с Date
        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        System.out.println(simpleDateFormat.format(calendar1.getTime()));

        calendar1.add(Calendar.MONTH, 2); //увеличим на 2 месяца
        System.out.println(simpleDateFormat.format(calendar1.getTime()));

        calendar1.add(Calendar.DAY_OF_WEEK, -2); //уменьшим на 2 дня
        System.out.println(simpleDateFormat.format(calendar1.getTime()));

        //Конкретная дата
        Calendar calendar2 = new GregorianCalendar(1979, Calendar.FEBRUARY, 22);
        System.out.println(simpleDateFormat.format(calendar2.getTime()));

        calendar2 = new GregorianCalendar(1979, Calendar.FEBRUARY, 22, 11, 33, 44);
        System.out.println(simpleDateFormat.format(calendar2.getTime()));

        // для работы с БД Sql, не путать с основным java.util.Date;
        java.sql.Date dtSql = new java.sql.Date(3243544346643L);
        System.out.println("dtSql = "+dtSql);

    }
}
