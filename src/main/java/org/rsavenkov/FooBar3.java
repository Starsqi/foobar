package org.rsavenkov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;;
import java.util.stream.IntStream;

public class FooBar3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int consoleInt = Integer.parseInt(reader.readLine());
        Object[] numbers = IntStream.rangeClosed(1, consoleInt)
                .mapToObj(i -> {
                    if (i % 3 == 0 && i % 5 == 0) {
                        return "FooBar";
                    } else if (i % 3 == 0) {
                        return "Foo";
                    } else if (i % 5 == 0) {
                        return "Bar";
                    } else {
                        return Integer.toString(i);
                    }
                })
                .toArray();

        System.out.println(Arrays.toString(numbers));
    }
}