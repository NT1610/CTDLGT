import java.io.*;
import java.util.*;

public class STPAR {
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
    static final int mx = 1003;
    static int[] arr = new int[mx];

    public static void main(String[] args) {
        fastio reader = new fastio();
        while (true) {
            int n = reader.nextInt();
            if (n == 0) {
                break;
            }

            for (int i = 1; i <= n; i++) {
                arr[i] = reader.nextInt();
            }

            int now = 1;
            Stack<Integer> st = new Stack<>();
            Stack<Integer> tem = new Stack<>();
            boolean check = true;

            for (int i = n; i >= 1; i--) {
                st.push(arr[i]);
            }

            while ((!st.empty() || !tem.empty()) && check) {
                if (!st.empty() && st.peek() == now) {
                    now++;
                    st.pop();
                } else if (!tem.empty() && tem.peek() == now) {
                    now++;
                    tem.pop();
                } else {
                    if (!st.empty()) {
                        tem.push(st.peek());
                        st.pop();
                    } else {
                        check = false;
                    }
                }

            }
            if (check) {
                reader.println("yes");
            } else {
                reader.println("no");
            }

        }

        reader.close();
    }
}