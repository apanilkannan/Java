package com.hello.core.P4;
import java.util.LinkedList;
import java.util.Scanner;
public class InsertLL1  {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements for the LinkedList (enter a negative number to stop):");
        int element;
        while (true) {
            System.out.print("Enter an element: ");
            element = scanner.nextInt();
            if (element < 0) {
                break; 
            }
            linkedList.add(element);
        }
        System.out.println("Current LinkedList: " + linkedList);
        System.out.print("Enter the element to insert: ");
        int elementToInsert = scanner.nextInt();
        System.out.print("Enter the position to insert: ");
        int positionToInsert = scanner.nextInt();
        if (positionToInsert >= 0 && positionToInsert <= linkedList.size()) {
            linkedList.add(positionToInsert-1, elementToInsert);
            System.out.println("Element inserted at position " + positionToInsert + ": " + elementToInsert);
        } else {
            System.out.println("Invalid position. Element not inserted.");
        }
        System.out.println("Updated LinkedList: " + linkedList);
        scanner.close();
    }
}

