package com.syntax.Replits;

import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Replit222 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 4, 5, 7, 8, 9, 0, 66));
        System.out.println(findMaxSum(list));
    }

    public static int findMaxSum(List<Integer> list) {
        Collections.sort(list);
        return list.get(list.size() - 1) + list.get(list.size() - 2);
    }
}
