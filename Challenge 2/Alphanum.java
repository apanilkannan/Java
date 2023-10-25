package com.hello.core.Alphanum;
import java.util.Scanner;
public class Alphanum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an alphanumeric string: ");
        String input = scanner.nextLine();
        String digitsOnly = extractDigits(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + digitsOnly);
        scanner.close();
    }
    public static String extractDigits(String input) {
        StringBuilder digitsOnly = new StringBuilder();
        for (char character : input.toCharArray()) {
            if (Character.isDigit(character)) {
                digitsOnly.append(character);
            }
        }
        return digitsOnly.toString();
    }
}