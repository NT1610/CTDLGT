import java.io.*;
import java.util.InputMismatchException;

public class CLSLDR {
    static int[][] data = new int[1001][1001];

    public static int solve(int n, int k) {
        if (n == 1) return 1;
        else {
            data[n][k] = (solve(n - 1, k) + k - 1) % n + 1;
            return data[n][k];
        }
    }

    public static void pre() {
        for (int i = 1; i <= 1000; i++) {
            data[1][i] = 1;
            solve(1000, i);
        }
    }

    public static void main(String[] args) throws IOException {
        fastio reader = new fastio();
        pre();
        int t = reader.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = reader.nextInt();
            int j = reader.nextInt();
            int k = reader.nextInt();
            int result = (j + data[n][k] - 1) % n + 1;
            reader.println(result);
        }
        reader.close();
    }
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
}