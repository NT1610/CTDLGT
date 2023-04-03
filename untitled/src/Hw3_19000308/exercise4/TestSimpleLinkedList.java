package Hw3_19000308.exercise4;

public class TestSimpleLinkedList {

    public static void main(String[] args) {

        SimpleLinkedList<String> list = new SimpleLinkedList<>();
        list.add("af");
        list.add("dhd");
        list.add("shdk");
        list.add("dhcj");
        list.add("cbndsc");
        list.isEmpty();
        list.addBot("37");
        list.get(2);
        list.size();
        list.remove(1);
    }
}