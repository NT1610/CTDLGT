import java.io.*;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;

public class EasyQueue {
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

    }

    public static void easyQueue() {
        fastio reader = new fastio();
        int t = reader.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        int choose;
        while (t-- > 0) {
            choose = reader.nextInt();
            if (choose == 1) {
                queue.add(reader.nextInt());
            }else if (choose == 2) {
                if (!queue.isEmpty()) {
                    queue.poll();
                }
            }else {
                if (!queue.isEmpty()) {
                    System.out.println(queue.peek());
                } else {
                    reader.println("Empty!");
                }
            }
        }
        reader.close();
    }

    public static void main(String[] args) throws IOException {

        easyQueue();
    }
}