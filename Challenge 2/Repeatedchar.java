package com.hello.core.Repeatedchar;
import java.util.Scanner;
class Repeatedchar  {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        System.out.println("Input string: " + input);
        System.out.println("Repeated characters: ");
        findRepeatedCharacters(input);
    }
    public static void findRepeatedCharacters(String input) {
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            
            for (int j = i + 1; j < input.length(); j++) {
                if (currentChar == input.charAt(j)) {
                    System.out.println(currentChar);
                    break;
                }
            }
        }
    }
}
