package com.hello.core.Countvowel;
import java.util.Scanner;
public class Countvowel  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        int vowelCount = countVowels(input);
        System.out.println("Number of vowels: " + vowelCount);
    }
    public static int countVowels(String input) {
        int count = 0;
        input = input.toLowerCase(); 
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' ||
                currentChar == 'o' || currentChar == 'u') {
                count++;
            }
        }
        return count;
    }
}
