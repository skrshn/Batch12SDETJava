package com.syntax.Replits;

import java.util.*;

public class countLettersInWordwithHashmap {
    public static void main(String[] args) {
        System.out.println(countLetters("aaabbtttpppp"));
    }

    public static String countLetters(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        char[] chars = str.toCharArray();
        String newStr = "";
        int count = 1;

        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])) {
                count = count + 1;
                map.put(chars[i], count);
            } else {
                map.put(chars[i], count);
                count = 1;
            }
        }
        Iterator<Map.Entry<Character, Integer>> it = map.entrySet().iterator();
        while (it.hasNext()) {

            Map.Entry<Character, Integer> entry = it.next();
            newStr += entry.getKey() +""+ entry.getValue();
        }
        return newStr;
    }
}
//    StringBuilder sb = new StringBuilder();
//    int count = 1;
//    char currentChar;
//
//    for (int i = 0; i < str.length() - 1; i++) {
//        currentChar = str.charAt(i);
//        if (currentChar == str.charAt(i+1)) {
//        count++;
//        } else {
//        sb.append(currentChar);
//        sb.append(String.valueOf(count));
//        count = 1;
//        }
//        }
//
//        sb.append(str.charAt(str.length()-1));
//        sb.append(String.valueOf(count));
//
//        return sb.toString();
