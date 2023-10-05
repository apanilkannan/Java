package com.hello.core.P4;
import java.util.ArrayList;
public class Arraylist2  {
	public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        if (arrayList.isEmpty()) {
            System.out.println("The ArrayList is empty.");
        } else {
            System.out.println("The ArrayList is not empty.");
        }
    }
}
