package Hw3_19000308.exercise4;

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
        if (top == null && bot == null) {
            Node newTop = new Node();
            Node newBot = new Node();
            top = newTop;
            bot = newBot;
        }
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = top;
        top = newNode;

    }

    public void addBot(T data) {
        // Thêm phần tử vào cuối danh sách
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (top == null) {

        }
    }

    public T get(int i) {
        // Lấy phần tử ở vị trí thứ i
        if (i >= n || i < 0) {
            return null;
        }
        Node node = top;
        for (i = 0; i < n; i++) {
            node = node.next;
        }
        return node.data;
    }

    public void set(int i, T data) {
        // Gán giá trị ở vị trí i bằng data
        if (i >= n || i < 0) {
            return;
        }
        Node curr = top;
        for (i = 0; i < n; i++) {
            curr = curr.next;
        }
        curr.data = data;
    }

    public boolean isContain(T data) {
        // Kiểm tra trong danh sách có chứa phần tử data hay không?
        Node node = top;
        for (int i = 0; i < n; i++) {
            if ((node.data).equals(data)) {
                return true;
            }
            node = node.next;
        }
        return false;
    }

    public int size() {
        // Trả lại thông tin số phần tử có trong danh sách
        return n;
    }

    public boolean isEmpty() {
        // Kiểm tra danh sách có rỗng hay không?
        return n == 0;
    }

    public T removeTop() {
        // Xóa phần tử ở đầu danh sách, trả lại giá trị data của phần tử đó
        if (isEmpty())
            throw new NullPointerException("Is Empty");
        if (top != null) {
            Node a = top;
            top = top.next;
            n--;
            return a.data;
        }
        return null;
    }

    public T removeBot() {
        // Xóa phần tử ở cuối danh sách, trả lại giá trị data của phần tử đó
        if (isEmpty()) throw new NullPointerException("Is Empty");
        Node currNode = top;
        while (currNode.next == bot) {
            currNode = currNode.next;
            n--;
            return currNode.data;
        }
        return null;
    }

    public void remove(int data) {
        // Xóa tất cả các phần tử có giá trị bằng data
        for (int i = 0; i < n; i++) {
            Object[] array = new Object[0];
            if (array[i].equals(data)) {
                remove(i);
            }
        }

    }

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

    public boolean hasNext() {
        Node a = top;
        if (a != null)
            return true;
        return false;
    }

}

