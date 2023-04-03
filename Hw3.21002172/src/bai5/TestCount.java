package bai5;

import bai3.SimpleArrayList;

import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class TestCount {
    SimpleArrayList<String> listWords = new SimpleArrayList<>();
    SimpleArrayList<WordCount> listWordCounts = new SimpleArrayList<>();

    public void input(String file) {
        try {
            File myFile = new File(file);
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()) {
                String text = sc.nextLine();
                text = charToSpace(text);
                SimpleArrayList<String> stringList = splitString(text);
                for (String str : stringList) {
                    listWords.add(str);
                }

            }
        } catch (FileNotFoundException E) {
            E.printStackTrace();
        }
    }

    public static String charToSpace(String s) {
        // Chuyển các ký tự đặc biệt thành khoảng trắng
        char[] arrChar = s.toCharArray();
        for (char i : arrChar) {
            int check = i;
            if (check < 48 || (check > 58 && check < 65) || (check > 90 && check < 97) || (check > 122 && check < 128)) {
                s = s.replace(i, ' ');
            }
        }
        return s;
    }

    public static SimpleArrayList<String> splitString(String s) {
        // Chia chuỗi thành mảng các chuỗi nhỏ
        SimpleArrayList<String> newList = new SimpleArrayList<>();
        String[] splitString = s.split(" ");
        for (String str : splitString) {
            newList.add(str);
        }
        return newList;
    }

    public WordCount check(String str) {
        for (WordCount i : listWordCounts) {
            if (i.getWord().equals(str)) {
                return i;
            }
        }
        return null;
    }

    public void count() {
        // Đếm số lượng từng c
        for (String i : listWords) {

            if (!this.listWordCounts.isContain(check(i))) {
                listWordCounts.add(new WordCount(i));
            } else {
                this.check(i).increment();
            }
        }
//        for (String str : listWords) {
//            if (check(str) == null) {
//                listWordCounts.add(new WordCount(str));
//            } else {
//                check(str).increment();
//            }
//        }
    }
}
