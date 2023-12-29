package org.rsavenkov;

import java.util.Scanner;

/**
 * Вариант с обработкой случая, если на вход поступает строка, а не число
 * В дальнейшем, будет подразумеваться, что вводится положительное целое число для сокращения кода
 * Сase вариант рассматриваться не будет - так как также является ветвлением
 */

public class FooBar1 {
    public static void main(String[] args) {
        String consoleInt;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            consoleInt = scanner.nextLine();
            if (!isNumber(consoleInt)) {
                System.out.println("Введите целое число, пожалуйста");
            } else if (Integer.parseInt(consoleInt) <= 0) {
                System.out.println("Вводимое число должно быть положительным и больше 0");
            } else break;
        }

        for (int i = 1; i < Integer.parseInt(consoleInt); i++) {
            if (i % 5 == 0) {
                if (i % 3 == 0) {
                    System.out.println("FooBar");
                } else {
                    System.out.println("Bar");
                }
            } else if (i % 3 == 0) {
                System.out.println("Foo");
            } else {
                System.out.println(i);
            }
        }
    }

    public static boolean isNumber(String str) {
        try {
            Integer.parseInt(str);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

}