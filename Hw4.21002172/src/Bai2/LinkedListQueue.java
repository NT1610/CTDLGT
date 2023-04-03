package Bai2;

import java.util.Iterator;
import java.util.Queue;

public class LinkedListQueue<E> implements QueueInterface<E> {
    class Node {
        Node next;
        E data;

        @Override
        public String toString() {
            return data.toString();
        }
    }

    private Node top = null;
    private Node bot = null;
    private int size = -1;

    @Override
    public void enqueue(E element) {
        Node newNode = new Node();
        newNode.data = element;
        newNode.next = null;
        if (top == null) {
            top = newNode;
            bot = newNode;
        }
        bot.next = newNode;
        bot = newNode;
        size++;
    }

    @Override
    public E dequeue() {
        if (this.isEmpty()) {
            return null;
        }
        Node removedNode = top;
        top = top.next;
        if (top == null) {
            bot = null;
        }
        return removedNode.data;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public Iterator<E> iterator() {
        return new QueueIterator();
    }

    class QueueIterator implements Iterator<E> {
        private Node current = top;
        private int num = 0;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            E element = current.data;
            current = current.next;
            return element;
        }
    }

    public void print() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListQueue<String> queue = new LinkedListQueue<>();

        queue.enqueue("t");
        queue.enqueue("h");
        queue.enqueue("a");
        queue.enqueue("i");

        queue.print();

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        queue.print();




    }
}
