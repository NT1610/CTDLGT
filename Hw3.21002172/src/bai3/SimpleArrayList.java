package bai3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class SimpleArrayList<T> implements ListInterface<T> {
    private T[] array;
    private int n = 0;
    private int defaultSize = 100;
    private int curIdx = 0;

    public SimpleArrayList() {
        array = (T[]) new Object[defaultSize];
    }

    public SimpleArrayList(int capacity) {
        // Hàm dựng với kích thước mảng là capacity
        this.array = (T[]) new Object[capacity];
    }

    public void add(T data) {
        //Thêm phần tử vào mảng
        if (n >= array.length) {
            array = Arrays.copyOf(array, array.length + defaultSize);
        }
        array[n] = data;
        n++;
    }

    public T get(int i) {
        // Lấy phần tử ở vị trí i
        if (i >= n || i < 0) {
            return null;
        }
        return array[i];
    }

    public void set(int i, T data) {
        // Gán phần tử data ở vị trí i
        if (i >= n || i < 0) {
            return;
        }
        array[i] = data;
    }

    public void remove(int i) {
        // Xóa phần tử ở vị trí i
        if (i >= n || i < 0) {
            return;
        }
        array[i] = null;
        for (int j = i; j < n - 1; j++) {
            array[i] = array[i + 1];
        }
    }

    public boolean isContain(T data) {
        // Ktra phần tử có trong mảng không
        for (int i = 0; i < n; i++) {
            if (array[i].equals(data)) {
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for (int i = 0; i < this.n; i++) {

            if (i == n - 1) {
                sb.append(array[i]).append(" ]");

            } else {
                sb.append(array[i]).append(", ");

            }
        }

        sb.append("\nSize = ").append(this.n);

        return sb.toString();
    }

    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int curIdx = 0;

            @Override
            public boolean hasNext() {
                return curIdx < n;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException("no more stuff");
                }
                T result = array[curIdx];
                curIdx++;
                return result;
            }
        };
    }

}
