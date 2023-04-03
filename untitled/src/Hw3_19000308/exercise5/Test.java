package Hw3_19000308.exercise5;

public class Test {

    public static void main(String[] args) {

        SimpleLinkedList<WordCount> wordC = new SimpleLinkedList<WordCount>();
        //Scanner scanner = new Scanner(System.in);

        String text = "Tạo đối tượng là WordCount gồm 2 thuộc tính là word và count. Đối tượng\n" +
                "WordCount nạp chồng phương thức equals(Object o) để có thể sử dụng phương\n" +
                "thức isContain đã xây dựng ở các cấu trúc dữ liệu trên, hoặc có thể sử dụng phương\n" +
                "thức indexOf của các đối tượng cài đặt giao diện List.";
                //scanner.nextLine();
        String[] t = text.split(" ");

        for (int i = 0; i < t.length; i++) {
            WordCount w = new WordCount(t[i]);
            int id = wordC.indexOf(w);
            if (id == -1) {
                wordC.add(w);
            } else {
                wordC.get(id).upCount();
            }
        }


        for (int i = 0; i < wordC.size() - 1; i++)
            for (int j = i + 1; j < wordC.size(); j++) {
                if (wordC.get(i).getCount() < wordC.get(j).getCount()) {
                    WordCount wi = wordC.get(i).clone();
                    WordCount wj = wordC.get(j).clone();
                    wordC.set(i, wj);
                    wordC.set(j, wi);
                }
            }

        for (WordCount w : wordC) {
            System.out.println(w);
        }

    }

}
