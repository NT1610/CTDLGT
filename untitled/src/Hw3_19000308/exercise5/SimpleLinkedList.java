package Hw3_19000308.exercise5;

import java.util.Iterator;

public class SimpleLinkedList<T> implements ListInterface<T> {
    class Node {
        T data;
        Node next;
    }
    private Node top = null;
    private Node bot = null;
    private int n = 0;

    @Override
    public void add(T data) {

        Node a = new Node();
        a.data = data;
        if (top == null && bot == null) {
            top = a;
            bot = a;
            n++;
        }
        else {
            bot.next = a;
            bot = bot.next;
            n++;
        }

    }
    @Override
    public T get(int i) {

        Node a = top;
        if (i < 0 || i >= n) {
            return null;
        }

        for (int j = 0; j < i; j++) {
            a = a.next;
        }
        return a.data;

    }
    @Override
    public void set(int i, T data) {
        Node a = top;
        for (int j = 0; j < i; j++) {
            a = a.next;
        }
        a.data = data;

    }
    @Override
    public void remove(int i) {
        Node a = top;
        if (i < 0 || i >= n) {
            return;
        }
        for (int j = 0; j < i - 1; j++) {
            a = a.next;
        }
        a.next = a.next.next;
        n--;

    }
    @Override
    public boolean isContain(T data) {
        Node a = top;
        int i = 0;
        while (i < n) {
            if (a.data.equals(data)) {
                return true;
            }
            a = a.next;
            i++;
        }

        return false;
    }
    @Override
    public int indexOf(T data) {
        Node a = top;
        int i = 0;
        while (i < n) {
            if (a.data.equals(data))
                return i;
            a = a.next;
            i++;
        }

        return -1;
    }
    @Override
    public int size() {
        return n;
    }
    @Override
    public boolean isEmpty() {
        return n == 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }

    class LinkedListIterator implements Iterator<T>{

        @Override
        public boolean hasNext() {
            Node a = top;
            if (a != null)
                return true;

            return false;
        }

        @Override
        public T next() {

            Node a = top;
            top = top.next;
            return a.data;
        }

    }

}
