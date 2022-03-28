package com.syntax.class28;

import java.util.ArrayList;

public class ListDemo1 {
    public static void main(String[] args) {
        ArrayList arrayList= new ArrayList();
        arrayList.add("10");
        arrayList.add("asd");
        arrayList.add(15.4);
        arrayList.add(true);

        //System.out.println(arrayList);

        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i) instanceof String){
                System.out.println(((String)arrayList.get(i)).length());

            }
            else{
                System.out.println("Conversion Error");
            }
        }

    }
}
