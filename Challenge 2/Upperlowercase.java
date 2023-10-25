package com.hello.core.Upperlowercase;
import java.util.Scanner;
public class Upperlowercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String uppercase = convertToUppercase(input);
        String lowercase = convertToLowercase(input);
        System.out.println("Original: " + input);
        System.out.println("Uppercase: " + uppercase);
        System.out.println("Lowercase: " + lowercase);
        scanner.close();
    }
    public static String convertToUppercase(String input) {
        StringBuilder result = new StringBuilder();
        for (char character : input.toCharArray()) {
            if (character >= 'a' && character <= 'z') {
                result.append((char) (character - 32));
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }
    public static String convertToLowercase(String input) {
        StringBuilder result = new StringBuilder();
        for (char character : input.toCharArray()) {
            if (character >= 'A' && character <= 'Z') {
                result.append((char) (character + 32));
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }
}