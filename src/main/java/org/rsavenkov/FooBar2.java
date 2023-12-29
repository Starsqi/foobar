package org.rsavenkov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class FooBar2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int consoleInt = Integer.parseInt(reader.readLine());
        reader.close();
        Object[] numbers = new Object[consoleInt];
        Arrays.fill(numbers,
                new Object() {
                    private int count = 0;

                    @Override
                    public String toString() {
                        ++count;
                        if (count % 5 == 0) {
                            if (count % 3 == 0) {
                                return "FooBar";
                            } else {
                                return "Bar";
                            }
                        } else if (count % 3 == 0) {
                            return "Foo";
                        } else {
                            return Integer.toString(count);
                        }
                    }
                }
        );
        System.out.println(Arrays.toString(numbers));
    }
}