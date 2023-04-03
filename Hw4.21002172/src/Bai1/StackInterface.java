package Bai1;

public interface StackInterface<E> extends Iterable<E>{
    public void push(E element);
    public boolean isEmpty();
    public E top();
}
