package com.hello.core.P4;
import java.util.*;
public class Sorthashmap4  {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("D", 4);
        hashMap.put("B", 2);
        hashMap.put("A", 1);
        hashMap.put("C", 3);
        TreeMap<String, Integer> sortedMap = new TreeMap<>(hashMap);
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ": " + value);
        }
    }
}
