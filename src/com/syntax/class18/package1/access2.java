package com.syntax.class18.package1;

import com.syntax.class18.package2.access3;

public class access2 {
    public static void main(String[] args) {
        access1 a = new access1();
        System.out.println(a.getHours());
        System.out.println(a.minutes);

        access3 a3 = new access3();
        System.out.println(a3.getHours());
        System.out.println(a3.minutes);

    }
}
