package bai5;

import java.util.Arrays;

public class Sort<T extends Comparable<T>> {
    T[] arr;

    public Sort(int length) {
        this.arr = (T[]) new Comparable[length];
    }

    public void set(int i, T e) {
        arr[i] = e;
    }

    public T[] getArray() {
        return arr;
    }

    public void bubbleSort() {
        T tmp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    public void selectionSort() {
        T min;
        int index;
        for (int i = 0; i < arr.length - 1; i++) {
            index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[index].compareTo(arr[j]) > 0) {
                    index = j;
                }
            }
            if (index != i) {
                min = arr[index];
                arr[index] = arr[i];
                arr[i] = min;
            }
        }
    }

    public void insertionSort() {
        T key;
        for (int i = 0; i < arr.length; i++) {
            key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}
