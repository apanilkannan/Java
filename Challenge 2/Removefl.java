package com.hello.core.Removefl;
import java.util.Scanner;
public class Removefl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        String stringWithoutFirstAndLast = removeFirstAndLastCharacter(inputString);
        System.out.println("Original string: " + inputString);
        System.out.println("String without first and last character: " + stringWithoutFirstAndLast);
        scanner.close();
    }

    public static String removeFirstAndLastCharacter(String inputString) {
        if (inputString.length() < 2) {
            return ""; 
        }
        return inputString.substring(1, inputString.length() - 1);
    }
}