package com.syntax.reviewClass13;

import java.util.ArrayList;

public class LambdaExpressions {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("John1");
        names.add("Smith1");
        names.add("Jones11");
        names.add("Snow");

        long m =names.parallelStream().filter(x->x.contains("1")).count();
        System.out.println(m);

    }
}
