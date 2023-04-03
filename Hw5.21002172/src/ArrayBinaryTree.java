public class ArrayBinaryTree<E> implements BinaryTreeInterface {
    private E[] array;
    private int n = 0;
    private int defaultsize = 100;

    public ArrayBinaryTree() {
        array = (E[]) new Object[defaultsize];
    }

    //update methods
    public void setRoot(E element) {
// Set element to root of an empty tree
        array[1] = element;
    }

    public void setLeft(int p, E element) {
// Set left child of p
        int t = (p * 2) + 1;
        if (array[p] == null) {
            System.out.printf("Can't set child at %d, no parent found\n", t);
        } else {
            array[t] = element;
        }
    }

    public void setRight(int p, E element) {
// Set right child of p
        int t = (n * 2) + 2;
        if (array[n] == null) {
            System.out.printf("Can't set child at %d, no parent found\n", t);
        } else {
            array[t] = element;
        }
    }

    @Override
    public Object root() {
        return array[0];
    }

    @Override
    public int size() {
        return n;
    }

    @Override
    public boolean isEmpty() {
        return n == 0;
    }

    @Override
    public int numChildren(Object p) {
        int count = 0;
        if (this == null) {
            
        }
        return 0;
    }

    @Override
    public Object parent(Object p) {
        return null;
    }

    @Override
    public Object left(Object p) {
        return null;
    }

    @Override
    public Object right(Object p) {
        return null;
    }

    @Override
    public Object sibling(Object p) {
        return null;
    }
}
