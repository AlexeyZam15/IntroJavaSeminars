package additional_homework01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
////        1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
////        Ввод:5
////        Треугольное число 1 + 2 + 3 + 4 + 5 = 15
////        n! 1 * 2 * 3 * 4 * 5 = 120
//        Scanner iScanner = new Scanner(System.in);
//        System.out.print("Введите число n: ");
//        int n = iScanner.nextInt();
//
//        int sum_number = getSumNumber(n);
//        System.out.println("Сумма от 1 до " + n + " = " + sum_number);
//
//        int product_number = getProductNumber(n);
//        System.out.println("Произведение от 1 до " + n + " = " + product_number);
//
////        2. Вывести все простые числа от 1 до 1000
//
//        int[] prime_numbers = getPrimeNumbers(1000);
//        System.out.println("Простые числа от 1 до 1000:");
//        printArray(prime_numbers, 20);
//
//        3. Реализовать простой калькулятор (+ - / *)
//        Ввод числа ->
//        Ввод знака ->
//        Ввод числа ->
        Scanner iScanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double number1 = iScanner.nextDouble();

        String operations = "+-/*";
        System.out.print("Введите знак операции: ");
        String operation = "" + iScanner.next().charAt(0);

        while (!operations.contains(operation)){
            System.out.println("Неверный ввод");
            System.out.print("Введите знак операции: ");
            operation = "" + iScanner.next().charAt(0);
        }
        System.out.print("Введите второе число: ");
        double number2 = iScanner.nextDouble();
        double calculation = calculator(number1, operation, number2);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.print(number1 + " " + operation + " " + number2 + " = ");
        System.out.println(df.format(calculation));


//        4.*(ДОПОЛНИТЕЛЬНАЯ) +Задано уравнение вида q + w = e, q, w, e >= 0.
//        Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69 (пользователь).
//                Требуется восстановить выражение до верного равенства.
//                Предложить хотя бы одно решение или сообщить, что его нет.
//        Ввод: 2? + ?5 = 69
//        Вывод: 24 + 45 = 69
    }

    static int getSumNumber(int number) {
        int res = 0;
        for (int i = 1; i <= number; i++) {
            res += i;
        }
        return res;
    }

    static int getProductNumber(int number) {
        int res = 1;
        for (int i = 1; i <= number; i++) {
            res *= i;
        }
        return res;
    }

    static int[] getPrimeNumbers(int number) {
        int size = 0;
        for (int i = 1; i < number; i++) {
            int count = 2;
            for (int j = 2; j < Math.sqrt(number) + 1; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 2) size++;
        }
        int[] res = new int[size];
        int index = 0;
        for (int i = 1; i < number; i++) {
            int count = 2;
            for (int j = 2; j < Math.sqrt(number) + 1; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 2) res[index++] = i;
        }
        return res;
    }

    static void printArray(int[] array, int columns) {
        for (int i = 0; i < array.length; i++) {
            if (i != 0 && i % columns == 0) System.out.println();
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static double calculator(double number1, String operation, double number2) {
        double res = 0;
        switch (operation) {
            case "+" -> res = number1 + number2;
            case "-" -> res = number1 - number2;
            case "/" -> res = number1 / number2;
            case "*" -> res = number1 * number2;
        }
        return res;
    }
}
