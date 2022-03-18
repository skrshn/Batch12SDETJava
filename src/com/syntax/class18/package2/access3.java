package com.syntax.class18.package2;

import com.syntax.class18.package1.access1;

public class access3 extends access1{
    public static void main(String[] args) {
        access3 a = new access3();
        System.out.println(a.hours);
        System.out.println(a.minutes);
        a.getHours();
    }
}
