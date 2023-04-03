package Bai4;

import Bai1.ArrayStack;
import Bai2.ArrayQueue;

public class Palindrome {
    public static boolean checkPalindrome(String s) {
        char[] ch = s.toCharArray();
        ArrayStack<Character> stack = new ArrayStack<>();
        ArrayQueue<Character> queue = new ArrayQueue<>();
        for (int i = 0; i < ch.length; i++) {
            if (i == (ch.length / 2) && ch.length % 2 == 1) {
                continue;
            }
            if (i <= ch.length / 2 - 1) {
                stack.push(ch[i]);
            } else {
                queue.enqueue(ch[i]);
            }
        }
        for (int i = 0; i < s.length() / 2; i++) {
            if (queue.dequeue() != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkPalindrome("hhhj"));
        System.out.println(checkPalindrome("1881"));
        System.out.println(checkPalindrome("334455"));
        System.out.println(checkPalindrome("220433"));
        System.out.println(checkPalindrome("12021"));
        System.out.println(checkPalindrome("@##@"));
        System.out.println(checkPalindrome(""));
        System.out.println(checkPalindrome("-^@@^-"));
        System.out.println(checkPalindrome("####"));
    }
}
