package Bai3;

import Bai1.ArrayStack;

import java.util.Stack;

public class ExpressionStack {

    public static boolean check(String exp) {
        ArrayStack<Character> stack = new ArrayStack<>();
        char[] tokens = exp.toCharArray();
        for (char ch : tokens) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty() ) {
                    return false;
                }else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }

    public static int evaluate(String exp) {
        char[] tokens = exp.toCharArray();
        Stack<Integer> val = new Stack<>();
        Stack<Character> ops = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {

            if (i == ' ') continue;

            if (Character.isDigit(tokens[i])) {
                String s = tokens[i] + "";
                while (i < tokens.length - 1 && Character.isDigit(tokens[i + 1])) {
                    s += tokens[++i];
                }
                val.push(Integer.parseInt(s));

            } else if (tokens[i] == '(') {
                ops.push(tokens[i]);

            } else if (tokens[i] == ')') {
                while (ops.peek() != '(') {
                    val.push(calculate(ops.pop(), val.pop(), val.pop()));

                }
                ops.pop(); // Xóa dấu ngoặc trái khỏi stack

            } else if (tokens[i] == '+' ||
                    tokens[i] == '-' ||
                    tokens[i] == '*' ||
                    tokens[i] == '/') {
                while (!ops.empty() && hasPrecedence(tokens[i], ops.peek())) {
                    val.push(calculate(ops.pop(), val.pop(), val.pop()));
                }
                ops.push(tokens[i]);
            }
        }
        while (!ops.empty()) {
            val.push(calculate(ops.pop(), val.pop(), val.pop()));
        }
        return val.pop();
    }

    public static boolean hasPrecedence(
            char op1, char op2) {
        if (op2 == '(' || op2 == ')') {
            return false;
        }

        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) {
            return false;
        } else {
            return true;
        }
    }

    public static int calculate(char op, int b, int a) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    System.out.println("Cannot divide by zero");
                    return 0;
                }
                return a / b;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(check("(1 + ((2 + 3) * (4 * 5)))"));
        System.out.println(check("(10 - 8) / ( (2 + 5) * 17)"));
        System.out.println(check("(10 - 8 / ( (2 + 5) * 17)"));

        System.out.println(evaluate("(1 + ((2 + 3) * (4 * 5)))"));
        System.out.println(evaluate("((50 - ((8 - 4) * (2 + 3))) + (3 * 4))"));
    }
}




