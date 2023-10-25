package com.hello.core.Reversestring;
import java.util.Scanner;
public class Reversestring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String reversedString = reverseWords(input);
        System.out.println("Reversed: " + reversedString);
        scanner.close();
    }
    public static String reverseWords(String input) {
        String[] words = input.split("\\s+");
        StringBuilder reversedString = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]);
            if (i > 0) {
                reversedString.append(" ");
            }
        }
        return reversedString.toString();
    }
}


