package bai4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class SimpleLinkedList<T> {
    class Node {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
        }

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }

        public T getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }

        public void setData(T data) {
            this.data = data;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    private Node top = null;
    private Node bot = null;
    private int n = 0;

    public void add(T data) {
// Thêm phần tử vào đầu danh sách
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
            bot = top;
        } else {
            newNode.next = top;
            top = newNode;
        }
        n++;
    }


    public void addBot(T data) {
// Thêm phần tử vào cuối danh sách
        Node newNode = new Node(data);
        if (n == 0) {
            top = newNode;
            bot = top;
        } else {
            bot.setNext(newNode);
            bot = newNode;
        }
        n++;

    }

    public T get(int i) {
// Lấy phần tử ở vị trí thứ i
        if (i < 0 || i >= n) {
            throw new IndexOutOfBoundsException();
        }
        Node tmp = top;
        for (int j = 0; j < i; j++) {
            tmp = tmp.getNext();
        }
        return tmp.data;
    }

    public void set(int i, T data) {
// Gán giá trị ở vị trí i bằng data
        if (i < 0 || i >= n) {
            throw new IndexOutOfBoundsException();
        } else {
            Node tmp = top;
            for (int j = 0; j < i; j++) {
                tmp = tmp.getNext();
            }
            tmp.setData(data);
        }
    }

    public boolean isContain(T data) {
// Kiểm tra trong danh sách có chứa phần tử data hay không?
        Node newNode = top;
        for (int i = 0; i < n; i++) {
            if (top.getData().equals(data)) {
                return true;
            }
            newNode = newNode.getNext();
        }
        return false;
    }

    public int size() {
// Trả lại thông tin số phần tử có trong danh sách
        return n;
    }

    public boolean isEmpty() {
// Kiểm tra danh sách có rỗng hay không?
        return size() == 0;
    }

    public T removeTop() {
// Xóa phần tử ở đầu danh sách, trả lại giá trị data của phần tử đó
        if (isEmpty()) {
            throw new IndexOutOfBoundsException();
        }
        T result = bot.getData();
        if (n > 1) {
            top = top.getNext();
        } else {
            top = null;
            bot = null;
        }
        n--;
        return result;
    }

    public T removeBot() {

// Xóa phần tử ở cuối danh sách, trả lại giá trị data của phần tử đó
        if (isEmpty()) {
            throw new IndexOutOfBoundsException();
        }
        T result = bot.getData();
        Node newBot = top;
        for (int i = 0; i < n - 1; i++) {
            newBot = newBot.getNext();
        }
        newBot.next = null;
        n--;
        return result;
    }

    public void removeIdx(int i) {
        // Xóa phần tử tại i
        if (isEmpty()) {
            throw new IndexOutOfBoundsException();
        }
        if (i == 0) {
            removeTop();
        } else if (i == n - 1) {
            removeBot();
        } else {
            Node tmp = top;
            for (int j = 0; j < i; j++) {
                tmp = tmp.getNext();
            }
            tmp = tmp.getNext().getNext();
        }

    }

    public void remove(T data) {
// Xóa tất cả các phần tử có giá trị bằng data
        if (isEmpty()) {
            throw new IndexOutOfBoundsException();
        }
        boolean check = false;
        if (top.data == data) {
            removeTop();
            check = true;
        } else if (bot.data == data) {
            removeBot();
            check = true;
        } else {
            Node temp = top;
            while (temp != bot) {
                if (temp.next.data == data) {
                    temp.next = temp.next.next;
                    check = true;
                }
                temp = temp.next;
            }
            if (!check) {
                System.out.println("Linked list has no element you want to remove");
            } else {
                System.out.println("The element you want to delete has been deleted");
            }

        }
    }

    public void print() {
        for (int i = 0; i < n; i++) {
            System.out.print(this.get(i) + " ");
        }
        System.out.println();
    }
}
