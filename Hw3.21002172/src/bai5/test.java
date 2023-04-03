package bai5;

public class test {
    public static void main(String[] args) {
        TestCount testCount = new TestCount();
        String file = "Hw3.21002172\\src\\bai5\\text";
        testCount.input(file);
        System.out.println(testCount.listWords);
        testCount.count();

        for (int i = 0; i < testCount.listWordCounts.size(); i++) {
            System.out.println(testCount.listWordCounts.get(i));
        }
    }
}
