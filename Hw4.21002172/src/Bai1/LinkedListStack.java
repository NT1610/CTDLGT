package Bai1;

import java.util.Iterator;

public class LinkedListStack<E> implements StackInterface<E> {
    class Node {
        E element;
        Node next;

        public Node(E element) {
            this.element = element;
        }

        public String toString() {
            return element.toString();
        }

    }

    Node stack = null;
    private int size = 0;

    @Override
    public void push(E element) {
// Thêm một phần tử vào stack
        Node node = new Node(element);
        node.next = stack;
        stack = node;
        size++;
    }


    public E pop() {
// Lấy một phần tử khỏi stack
        if (isEmpty()) {
            return null;
        }
        E temp = stack.element;
        stack = stack.next;
        size--;
        return temp;
    }

    @Override
    public boolean isEmpty() {
// Kiểm tra stack rỗng
        return (size == 0);
    }

    @Override
    public E top() {
// Lấy giá trị phần tử đầu tiên của stack
        if (isEmpty()) {
            return null;
        }
        return stack.element;
    }

    @Override
    public Iterator<E> iterator() {
        return new StackIterator();
    }

    class StackIterator implements Iterator<E> {
        private Node currentNode = stack;

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public E next() {
            E data = currentNode.element;
            currentNode = currentNode.next;
            return data;
        }
    }

    public static void main(String[] args) {
        LinkedListStack<String> stack = new LinkedListStack<>();
        stack.push("t");
        stack.push("h");
        stack.push("a");
        stack.push("i");
        System.out.println("Phần tử trên cùng của stack: " + stack.top());
        System.out.println("Số lượng phần tử trong stack: " + stack.size);

        System.out.println("Các phần tử trong stack:");
        Iterator<String> iterator = stack.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("Xóa phần tử:");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println("Số lượng phần tử trong stack sau khi xóa: " + stack.size);
    }
}

