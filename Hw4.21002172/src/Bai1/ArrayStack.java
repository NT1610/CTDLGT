package Bai1;


import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayStack<E> implements StackInterface<E> {
    public int capacity = 1; // Độ dài mặc định mảng
    private E[] array; // Mảng lưu trữ
    private int t = -1; // chỉ số của phần tử trên cùng

    //Hàm dựng với dung lượng mặc định
    public ArrayStack() {
        array = (E[]) new Object[capacity];
    }

    // Hàm dựng với dung lượng cho trước
    public ArrayStack(int capacity) {
        this.array = (E[]) new Object[capacity];
    }

    //Độ lớn stack
    public int size() {
        return t + 1;
    }

    //Kiểm tra stack trống
    @Override
    public boolean isEmpty() {
        return (t == -1);
    }

    public boolean isFull() {
        return (t == capacity - 1);
    }

    // Đẩy một mục lên trên stack
    @Override
    public void push(E element) {
        if (!isFull()) {
            t++;
            array[t] = element;
        } else {
            E[] tmp = (E[]) new Object[capacity];
            for (int i = 0; i < t + 1; i++)
                tmp[i] = array[i];
            capacity = capacity * 2;
            array = (E[]) new Object[capacity];
            for (int i = 0; i < t + 1; i++)
                array[i] = tmp[i];
            t++;
            array[t] = element;
        }
    }

    // Trả về phần tử trên cùng stack
    @Override
    public E top() {
        if (isEmpty()) {
            return null;
        }
        return array[t];
    }

    // Xóa phần tử đầu
    public E pop() {
        if (isEmpty()) {
            return null;
        }

        E data = array[t];

        t--;

        return data;
    }

    // Tạo trình vòng lặp có cùng phần tử như stack
    @Override
    public Iterator iterator() {
        return new Iterator<E>() {
            private int curIdx = -1;

            @Override
            public boolean hasNext() {
                return curIdx < t;
            }

            @Override
            public E next() {
                if (!hasNext()) {
                    throw new NoSuchElementException("no more stuff");
                }
                E result = array[++curIdx];
                return result;
            }
        };
    }

    public static void main(String[] args) {
        ArrayStack<String> stack = new ArrayStack<>();
        stack.push("t");
        stack.push("h");
        stack.push("a");
        stack.push("i");

        System.out.println("Phần tử trên cùng của stack: " + stack.top());
        System.out.println("Số lượng phần tử trong stack: " + stack.size());

        System.out.println("Các phần tử trong stack:");
        Iterator<String> iterator = stack.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("Xóa phần tử:");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println("Số lượng phần tử trong stack sau khi xóa: " + stack.size());
    }
}

