package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        task01();
        task02();
//        task03();
//        task04();
    }

    /**
     * 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n),
     * n! (произведение чисел от 1 до n)
     */
    public static void task01() {
        System.out.print("Введите число n -> ");
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
        }
        scanner.close();
        int sum = 0;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            sum += i;
            fact *= i;
        }
        System.out.printf("Сумма чисел от 1 до %d равна %d \n", n, sum);
        System.out.printf("Факториал числа %d равен %d \n", n, fact);
    }

    /**
     * 2) Вывести все простые числа от 1 до 1000
     */
    public static void task02(){
        for (int i = 1; i <= 1000; i++) {
            boolean isSimple = true;
            boolean lessThanSqrt = true;
            for (int j = 2; j < i && lessThanSqrt; j++) {
                if (i % j == 0) isSimple = false;
                if (j * j > i) lessThanSqrt = false;
            }
            if (isSimple) System.out.printf("%d ", i);
        }
    }

    /**
     * 3) Реализовать простой калькулятор
     */

    public static void task03(){

    }

    /**
     * 4) (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0.
     * Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69.
     * Требуется восстановить выражение до верного равенства.
     * Предложить хотя бы одно решение или сообщить, что его нет.
     */

    public static void task04(){

    }


}