package com.hello.core.P3;
public class Anagram6 {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
    public static boolean areAnagrams(String str1, String str2) {
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();
        if (str1.length() != str2.length()) {
            return false;
        }
        int[] charCount1 = new int[26]; 
        int[] charCount2 = new int[26];
        for (char c : str1.toCharArray()) {
            charCount1[c - 'a']++;
        }
        for (char c : str2.toCharArray()) {
            charCount2[c - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (charCount1[i] != charCount2[i]) {
                return false;
            }
        }
        return true;
    }
}