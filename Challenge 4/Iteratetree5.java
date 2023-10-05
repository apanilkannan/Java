package com.hello.core.P4;
import java.util.*;
public class Iteratetree5  {
	public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("D", 4);
        treeMap.put("B", 2);
        treeMap.put("A", 1);
        treeMap.put("C", 3);
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ": " + value);
        }
    }
}
