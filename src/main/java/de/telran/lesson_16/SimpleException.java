package de.telran.lesson_16;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.exit;

public class SimpleException {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println(list.add("Первый"));
        System.out.println(list);
        if(list.add("Второй")) {
            System.out.println("В list успешно добавлен новый элемент");
        }

        System.out.println(choise(null));
        if (choise("Строка")>0) {
            System.out.println("Наша операция прошла успешно");
        }

        try {
            Integer res = div(-9,3);
            //....
        } catch (ArithmeticException ex) {
            System.out.println("Ошибка:"+ex.getMessage());
        } catch (NullPointerException ex) {
            System.out.println("Ошибка передачи параметров: "+ex.getMessage());
        } catch (Exception ex) { // все остальные исключительные ситуации
            System.out.println("Неизвестная ошибка: "+ex.getMessage());
            //Уведомить разработчика
            exit(0); // полная остановка программы
        }
        finally {
            System.out.println("finally блок кода выполниться в любом случае!");
        }
        // Object obj = new String("My");


    }
    private static int choise(String str) {
        if(str == null) {
            return -1;
        }
        if(str.length()==0) {
            return -2;
        }
        return str.length();
    }

    private static Integer div(Integer val1, Integer val2) {
        if(val2 == 0) {
            throw new ArithmeticException("Argument 'divisor' is 0");
        }
        if(val1==null || val2==null) {
            throw new NullPointerException("Аргументы не могут быть равны null");
        }
        return val1 / val2;
    }
}
