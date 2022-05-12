package com.syntax.Replits;

import java.util.*;

public class Replit219 {
    static List<Integer> countPrefix(List<String> wordList, List<String> queryList) {
        List<Integer> countList = new LinkedList<>();
        int count = 0;
        for (String query : queryList) {
            for (String word : wordList) {
                if (!word.equals(query)&&word.startsWith(query)) {
                    count++;
                }

            }
            countList.add(count);
            count = 0;
        }
        return countList;

    }

    public static void main(String[] args) {
        List<String> wordList = new ArrayList<>(Arrays.asList("steve", "stevens", "danny", "steves", "dan", "john", "johny", "joe", "alex", "alexander"));
        List<String> query = new ArrayList<>(Arrays.asList("steve", "alex", "joe", "john", "dan"));

        System.out.println(countPrefix(wordList, query));
    }
}
