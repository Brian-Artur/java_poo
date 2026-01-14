package com.example.utils;

import java.util.Scanner;

public class Input {

    private static final Scanner scanner = new Scanner(System.in);

    private static Integer parseIntOrNull(String value) {
        try {
            return Integer.parseInt(value.trim());
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public static String ask(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }

    public static int askNumber(String question) {
        while (true) {
            String value = ask(question);
            Integer num = parseIntOrNull(value);

            if (num != null) {
                return num;
            }

            System.out.println("❌ Introduce un número válido");
        }
    }

    public static int askNumberInRange(
            String question,
            int min,
            int max) {
        while (true) {
            int num = askNumber(question);

            if (num >= min && num <= max) {
                return num;
            }

            System.out.println(
                    "❌ El número debe estar entre " + min + " y " + max);
        }
    }
}