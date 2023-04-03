package Hw3_19000308.exercise3;

public class TestArrayList {
    public static void main(String[] args) {

        SimpleArrayList<Integer> arrayIn = new SimpleArrayList<>();
        System.out.println("Size: "+arrayIn.size());
        System.out.println("Array is empty: " + arrayIn.isEmpty());
        arrayIn.add(35);
        arrayIn.add(34);
        arrayIn.add(0);
        System.out.println("after add array is: ");
        arrayIn.print();
        arrayIn.isContain(7);
        arrayIn.get(2);
        System.out.println("after get array is: ");
        arrayIn.print();//after get print array
        arrayIn.set(2,5);
        System.out.println("after set i in index 2 is 5, array is: ");
        arrayIn.print(); //after set print array
        arrayIn.remove(0);
        System.out.println("after remove array is: ");
        arrayIn.print(); //after remove print array
        arrayIn.add(4);
        arrayIn.add(5);
        System.out.println("after add array is: ");
        arrayIn.print();
        System.out.println("Size: "+arrayIn.size());
        System.out.println("Array is empty: " + arrayIn.isEmpty());
        arrayIn.indexOf(4);
        arrayIn.print();

    }
}
