package de.telran.lesson_20;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class DateSimple {
    public static void main(String[] args) {
        Date date1 = new Date();
        System.out.println("Current date -> "+date1);

        Date date2 = new Date(3243544346643L);
        System.out.println("User date -> "+date2);

        System.out.println("date1 > date2 = "+date1.after(date2));
        System.out.println("date1 < date2 = "+date1.before(date2));

        System.out.println("Count mls = "+ date1.getTime());

        // Работа с локалью
        Locale locale = new Locale("ru");
        Locale.setDefault(locale);

        Date date3 = new Date();
        System.out.println("Current date ru -> "+date3);
        String dateString = String.format(locale, "%tc\n", date3);
        System.out.println("String date ru -> "+dateString);

        //Calendar
        Calendar calendar1 = Calendar.getInstance();
        System.out.println("Current calendar = "+calendar1);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(simpleDateFormat.format(calendar1.getTime()));
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

    }
}
