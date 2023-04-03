package bai5;

public class Main {
    public static void main(String[] args) {
        Sort<Integer> arr = new Sort<>(10);
        for (int i = 0; i < 10; i++) {
            arr.set(i, (int) (100 * Math.random()));
        }
//        System.out.println(arr);
//        arr.bubbleSort();
//        System.out.println(arr);
//        System.out.println(arr);
//        arr.selectionSort();
//        System.out.println(arr);
        System.out.println(arr);
        arr.insertionSort();
        System.out.println(arr);
        Sort<String> array = new Sort<>(7);
        array.set(0, "1");
        array.set(1, "4");
        array.set(2, "2");
        array.set(3, "J");
        array.set(4, "K");
        array.set(5, "5");
        array.set(6, "6");
        System.out.println(array);
        array.bubbleSort();
        System.out.println(array);
    }
}
