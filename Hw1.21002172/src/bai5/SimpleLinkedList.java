package bai5;

import java.util.NoSuchElementException;

public class SimpleLinkedList<T> {
    class Node {
        T data;
        Node next;
    }

    private Node top = null;
    private Node bot = null;
    private int n = 0;

    public void add(T data) {
        // Thêm phần tử vào đầu danh sách
        top.data = data;
    }

    public void addBot(T data) {
        // Thêm phần tử vào cuối danh sách
        bot.data = data;
    }

    public T get(int i) {
// Lấy phần tử ở vị trí thứ i
        if (i < 0 || i >= n) {
            throw new IndexOutOfBoundsException();
        }

        Node current = top;
        for (int j = 0; j < i; j++) {
            current = current.next;
        }

        return current.data;
    }

    public void set(int i, T data) {
        // Gán giá trị ở vị trí i bằng data
        if (i < 0 || i >= n) {
            throw new IndexOutOfBoundsException();
        }

        Node current = top;
        for (int j = 0; j < i; j++) {
            current = current.next;
        }

        current.data = data;
    }

    public boolean isContain(T data) {

        // Kiểm tra trong danh sách có chứa phần tử data hay không?
        Node current = top;
        for (int i = 0; i < n; i++) {
            if (current == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int size() {
        // Trả lại thông tin số phần tử có trong danh sách
        return n;
    }

    public boolean isEmpty() {
        // Kiểm tra danh sách có rỗng hay không?
        if (n == 0) {
            return true;
        }
        return false;
    }

    public T removeTop() {

        // Xóa phần tử ở đầu danh sách, trả lại giá trị data của phần tử đó
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        T data = top.data;
        top = top.next;
        n--;
        if (isEmpty()) {
            bot = null;
        }
        return data;
    }

    public T removeBot() {

        // Xóa phần tử ở cuối danh sách, trả lại giá trị data của phần tử đó
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        T data = bot.data;
        if (n == 1) {
            top = null;
            bot = null;
        } else {
            Node current = top;
            while (current.next != bot) {
                current = current.next;
            }
            current.next = null;
            bot = current;
        }
        n--;
        return data;
    }

    public void remove(T data) {
// Xóa tất cả các phần tử có giá trị bằng data
    }
}
