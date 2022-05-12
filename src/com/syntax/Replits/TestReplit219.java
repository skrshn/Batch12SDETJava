package com.syntax.Replits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TestReplit219 {
    static List<Integer> countPrefix(List<String> wordList, List<String> queryList) {
        List<Integer> countList = new LinkedList<>();
        int count = 0;
        for (String query : queryList
        ) {
            for (String word : wordList
            ) {
                if (!word.equals(query) && word.startsWith(query)) {
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
        List<String> queryList = new ArrayList<>(Arrays.asList("steve", "alex", "joe", "john", "dan"));

        System.out.println(countPrefix(wordList, queryList));
    }
}
