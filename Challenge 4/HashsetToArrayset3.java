package com.hello.core.P4;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
public class HashsetToArrayset3 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Banana"); 
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            arrayList.add(iterator.next());
        }
        System.out.println("Elements in the ArrayList:");
        for (String element : arrayList) {
            System.out.println(element);
        }
    }
}
