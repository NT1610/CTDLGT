package bai3;

import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        // Constructor
        SimpleArrayList<Double> list = new SimpleArrayList<>(3);
        System.out.println(list);
        System.out.println("============================================================");

        //Add
        list.add(2.3);
        list.add(4.92);
        list.add(39.2);
        list.add(492.0);
        System.out.println("============================================================");


        // Iterable
        for (Double item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
        System.out.println("============================================================");


        //Remove
        list.remove(192);
        list.remove(123);
        System.out.println(list);

        System.out.println("============================================================");


        //Contain
        System.out.println(list.isContain(19.2));
        System.out.println(list.isContain(1.0));
        System.out.println("============================================================");


        //Empty
        System.out.println(list.isEmpty());
        System.out.println("============================================================");


        //toString
        System.out.println(list);
        System.out.println("============================================================");


        //Iterator
        Iterator<Double> testIterator = list.iterator();

        System.out.println(testIterator.hasNext());
        System.out.println(testIterator.next());
        System.out.println(testIterator.next());
        System.out.println(testIterator.next());
        System.out.println(testIterator.next());

    }
}
