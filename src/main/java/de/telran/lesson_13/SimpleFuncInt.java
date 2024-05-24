package de.telran.lesson_13;

import java.util.Arrays;
import java.util.function.ToIntBiFunction;

public class SimpleFuncInt {
    public static void main(String[] args) {
        System.out.println(sum(5,10));
        System.out.println(multi(5,10));

        System.out.println(sum(11,77));
        System.out.println(multi(11,77));

        // Именованный класс
        int sum = operation(5,10, new Sum());
        System.out.println("operation Class = "+sum);

        // Анонимный класс
        int mult = operation(5, 10, new Calculate() {
            @Override
            public int operator(int x, int y) { return x * y;}
        });
        System.out.println("operation анонимный Class = "+mult);

        // Lambda
        //int operator(int x, int y) { return a - b; };
        Calculate calc = ((a, b) -> { // многострочная lambda
            int res = a - b;
            return res;
        });
        int div = operation(5,10, calc);
        System.out.println("operation lambda = "+div);

        // Упрощение Lambda (однострочная lambda)
        System.out.println("operation lambda a/b = "+operation(20,10, (a,b) -> a/b));

        // Три аргумента
        System.out.println("operation lambda a+b-c = "+operation(20,10, 5, (a,b,c) -> a+b-c));

        //Множество аргументов
        CalculateMulti calcMulti = (a -> { // многострочная lambda
            int res = 0;
            for (int i = 0; i < a.length; i++) {
                res += a[i];
            }
            return res;
        });
        // Много аргументов
        System.out.println("operation lambda a[] = "+operation(calcMulti, 1,5,4,8,3,9,10));


        //Другое поведение!!!
        Calculate calcOther = ((a, b) -> { // многострочная lambda
            System.out.println("a = "+a);
            System.out.println("b = "+b);
            return 0;
        });
        calcOther.operator(10, 20);

        calcOther = ((a, b) -> { // многострочная lambda
            System.out.printf("Человек берет %d в руку и бросает в %d%n", a,b);
            return 0;
        });
        calcOther.operator(10, 20);


        Calculate calc2 = (a,b) -> a/b;
        System.out.println("Calculate = "+calc2.operator(20, 10));

        //Стандартная библиотека
        ToIntBiFunction<Integer,Integer> biFunction = (a,b) -> a/b;
        System.out.println("ToIntBiFunction = "+biFunction.applyAsInt(20, 10));

        biFunction = ((a, b) -> { // многострочная lambda
            System.out.println("a = "+a);
            System.out.println("b = "+b);
            return 0;
        });
        biFunction.applyAsInt(20,10);

        // Упрощение Lambda (однострочная lambda)
        System.out.println("operation lambda a/b = "+operation((a,b) -> a/b, 20,10));

        //Ссылки на методы
        System.out.println("operation lambda a+b = "+operation(20,10, (a,b) -> a+b));

        System.out.println("operation lambda a/b = "+operation(20,10, SimpleFuncInt::sum));


    }

    private static int sum(int a, int b) {
        return a+b;
    }

    private static int multi(int a, int b) {
        return a*b;
    }

    private static int div(int a, int b) {
        return a-b;
    }

    // private int operation(int a, int b, [код, который он должен выполнять]);
    // operation(5,10,a+b);

    private static int operation (int a, int b, Calculate calc) {
        return calc.operator(a,b);
    }

    private static int operation (int a, int b, int c, CalculateThree calc) {
        return calc.operator(a,b,c);
    }

    private static int operation (CalculateMulti calc, int ... a) {
        return calc.operator(a);
    }

    // ToIntBiFunction == Calculate

    private static int operation (ToIntBiFunction<Integer,Integer> biFunction, int a, int b) {
        return biFunction.applyAsInt(a,b);
    }
}

@FunctionalInterface
interface Calculate {
    int operator(int x, int y);// !!!абстрактный метод только 1
    default int operator(int x, int y, int z) {
        return x+y+z;
    };
    static void print() {
        System.out.println("Я интерфейс Calculate");
    }
}

@FunctionalInterface
interface CalculateThree {
    int operator(int x, int y, int z);
}

@FunctionalInterface
interface CalculateMulti {
    int operator(int ... x);
}

// именованный класс
class Sum implements Calculate {
    @Override
    public int operator(int x, int y) {
        return x+y;
    }

    // переопределяем поведение
    public int operator(int x, int y, int z) {
        return x-y-z;
    }
}




