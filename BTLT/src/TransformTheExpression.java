import java.io.*;
import java.util.*;

public class TransformTheExpression {
    static class fastio extends PrintWriter {
        private InputStream stream;
        private byte[] buf = new byte[1 << 16];
        private int curChar;
        private int numChars;

        // standard input
        public fastio() {
            this(System.in, System.out);
        }

        public fastio(InputStream i, OutputStream o) {
            super(o);
            stream = i;
        }

        // file input
        public fastio(String i, String o) throws IOException {
            super(new FileWriter(o));
            stream = new FileInputStream(i);
        }

        // throws InputMismatchException() if previously detected end of file
        private int nextByte() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars == -1) {
                    return -1;  // end of file
                }
            }
            return buf[curChar++];
        }

        // to read in entire lines, replace c <= ' '
        // with a function that checks whether c is a line break
        public String next() {
            int c;
            do {
                c = nextByte();
            } while (c <= ' ');

            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = nextByte();
            } while (c > ' ');
            return res.toString();
        }

        public int nextInt() {  // nextLong() would be implemented similarly
            int c;
            do {
                c = nextByte();
            } while (c <= ' ');

            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = nextByte();
            }

            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res = 10 * res + c - '0';
                c = nextByte();
            } while (c > ' ');
            return res * sgn;
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }
    public static void main(String[] args) {
        fastio reader = new fastio();
        int tc = reader.nextInt();
        while (tc-- > 0) {
            String str = reader.next();
            Stack<Character> stack = new Stack<>();
            int len = str.length();
            for (int i = 0; i < len; i++) {
                if (str.charAt(i) == '(') {
                    stack.push(str.charAt(i));
                } else if (str.charAt(i) == ')') {
                    char ch = stack.pop();
                    stack.pop();
                    reader.print(ch);
                } else if (Character.isLetter(str.charAt(i))) {
                    reader.print(str.charAt(i));
                } else {
                    stack.push(str.charAt(i));
                }
            }
            reader.println();
        }
        reader.close();
    }
}
