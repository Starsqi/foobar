package org.rsavenkov;

import java.util.Scanner;
import java.util.stream.IntStream;

public class FooBar4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число больше 0: ");
        int n = scanner.nextInt();

        StringBuilder result = new StringBuilder();
        IntStream.rangeClosed(1, n)
                .forEach(i -> result.append((i % 3 == 0 ? "Foo" : "") + (i % 5 == 0 ? "Bar" : "") + (i % 3 != 0 && i % 5 != 0 ? i : "")).append("\n"));

        System.out.print(result);
    }
}