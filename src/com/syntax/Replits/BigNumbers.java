package com.syntax.Replits;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumbers {
    public static void main(String[] args) {

        //gives error
        // long l1= 12121212121212121212121212121212l;

        BigInteger b1 = new BigInteger("12121212121212121212121212121212");
        BigInteger b2 = new BigInteger("121212121212121212121212121212125");
        BigInteger sum = b1.add(b2);
        BigInteger mul = b1.multiply(b2);
        BigInteger div = b1.divide(b2);
        System.out.println(sum);
        System.out.println(mul);
        System.out.println(div);


        BigDecimal d1 = new BigDecimal("2311123.31231231231231241423425564325");
        System.out.println(d1);
    }
}
