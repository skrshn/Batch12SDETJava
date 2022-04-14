package com.syntax.reviewClass12;

import java.util.ArrayList;
import java.util.Objects;

public class CollectionDemo2 {
    public static void main(String[] args) {
        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Orange");
        fruit.add("Mango");

        fruit.remove("Mango");
        System.out.println(fruit);
        ArrayList<Fruit> f = new ArrayList<>();
        f.add(new Fruit("Apple"));
        f.add(new Fruit("Orange"));
        f.add(new Fruit("Mango"));
        f.remove(new Fruit("Mango"));
        System.out.println(f.toString());
    }
}

class Fruit{
    String name;

    public Fruit(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Fruit fruit = (Fruit) o;
//        return Objects.equals(name, fruit.name);
        return name.equals(((Fruit)o).name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}