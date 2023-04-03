package bai4;

import bai3.SimpleArrayList;

public class test {
    public static void main(String[] args) {
        SimpleLinkedList simpleLinkedList = new SimpleLinkedList();
        simpleLinkedList.add(35);
        simpleLinkedList.add(52);
        simpleLinkedList.add(73);
        simpleLinkedList.add(14);
        simpleLinkedList.add(123);

        simpleLinkedList.print();
        System.out.println("=============================");

        simpleLinkedList.set(1, 33);
        simpleLinkedList.print();
        System.out.println("=============================");

        simpleLinkedList.addBot(69);
        simpleLinkedList.print();
        System.out.println("=============================");

        simpleLinkedList.removeTop();
        simpleLinkedList.print();
        simpleLinkedList.removeBot();
        simpleLinkedList.print();
        System.out.println("=============================");

        simpleLinkedList.remove(35);
        simpleLinkedList.print();
    }
}
