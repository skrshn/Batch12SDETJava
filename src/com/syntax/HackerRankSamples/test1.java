package com.syntax.HackerRankSamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test1 {
    public static void main(String[] args) {
        List<String> ss = new ArrayList<>();
        ss.add("ok");
        ss.add("bok");
        ss.add("yuh");
        ss.add("ok cok");


        System.out.println(Collections.frequency(ss, "ok"));
    }

}
