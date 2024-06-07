package de.telran.lesson_15;

import java.io.*;
import java.util.Scanner;

public class SimpleStandartIO {
    public static void main(String[] args) throws IOException {
        String str = "Slon";
        int valInt = 10;
        double valDouble = 21.5;

        System.out.print(str);
        System.err.print(valInt); // для вывода ошибочных ситуаций
        System.out.print(valDouble);

        System.out.println();
        System.out.println(str);
        System.out.println(valInt);
        System.out.println(valDouble);

        // "Слон по имени Slon возрастом 10 лет имеет вес 21.5 т."
        System.out.println();
        System.out.println("Слон по имени "+str+" возрастом "+valInt+" лет имеет вес "+valDouble+" т.");
        System.out.printf("Слон по имени %s возрастом %d лет имеет вес %.2f т.%n", str, valInt, valDouble);
        //старая аналогия printf
        System.out.println(String.format("Слон по имени %s возрастом %d лет имеет вес %.2f т.", str, valInt, valDouble));

        // ввод информации
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int inScan = scanner.nextInt();
        System.out.println("Вы ввели - "+inScan);

        // InputStream - ввод информации
        InputStream inputStream = System.in;
        Reader reader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(reader);
        System.out.print("Введите строку: ");
        String inStr = bufferedReader.readLine();
        System.out.println("Вы ввели строку - "+inStr);


    }
}
