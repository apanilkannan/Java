package com.hello.core.Removeword;
import java.util.Scanner;
public class Removeword  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        System.out.print("Enter the word to remove: ");
        String wordToRemove = scanner.nextLine();
        String stringWithWordRemoved = removeWord(inputString, wordToRemove);
        System.out.println("Original string: " + inputString);
        System.out.println("String with word removed: " + stringWithWordRemoved);
        scanner.close();
    }
    public static String removeWord(String inputString, String wordToRemove) {
        String stringWithWordRemoved = inputString.replace(wordToRemove, "");
        return stringWithWordRemoved;
    }
}
