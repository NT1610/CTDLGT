package Hw3_19000308.exercise3;

import java.util.Arrays;
import java.util.Iterator;

public class SimpleArrayList<T> implements ListInterface<T> {
    private int capacity;
    private T[] array;
    private int n = 0;
    private int defaultSize = 100;

    public SimpleArrayList() {
        array = (T[]) new Object[defaultSize];
    }

    public SimpleArrayList(int capacity) {
    // Hàm dựng với kích thước mảng là capacity
        this.capacity = capacity;
        array = (T[]) new Object[capacity];
        n = 0;
    }

    public T add(T data) {
        if (n > array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[n++] = data;
        return data;
    }

    public T get(int i) {
        if (i >= n || i < 0) {
            return null;
        }
        return array[i];
    }

    public void set(int i, T data) {
        if (i >= n || i < 0) {
            return;
        }
        array[i] = data;
    }

    public void remove(T data) throws IndexOutOfBoundsException {
        if (!isEmpty()) {
            for (int i = 0; i < -1; i++)
                array[i] = array[i + 1];
            n--;
        }
    }

    public boolean isContain(T data) {
        for (int i = 0; i < n; i++) {
            if (array[i] == data) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return n;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public Iterator<T> iterator() {
        int currentIdx = 0;
        return null;
    }

    public int indexOf(T data) {
        for (int i = 0; i < n; i++) {
            if (array[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    public void print(){
        for (int i = 0; i<n;i++)
            System.out.print(array[i].toString() + " ");
        System.out.println();
    }
}