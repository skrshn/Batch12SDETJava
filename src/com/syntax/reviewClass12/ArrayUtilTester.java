package com.syntax.reviewClass12;

import com.syntax.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayUtilTester {
    public static void main(String[] args) {
        String[] str  = new String[50];
        str[0]="sakir";
        System.out.println(Arrays.toString(str));

        ArrayList<String> arrayList = ArrayUtil.toArrayList(str);

        arrayList.add("Michael");
        System.out.println(arrayList);
    }
}
