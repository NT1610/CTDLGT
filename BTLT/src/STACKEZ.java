import java.io.*;
import java.util.InputMismatchException;
import java.util.Stack;

class fastio extends PrintWriter {
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

public class STACKEZ {

    public static void easyStack() {
        fastio reader = new fastio();
        int t = reader.nextInt();
        Stack<Integer> stack = new Stack<>();
        int choose;
        while (t-- > 0) {
            StringBuilder str = new StringBuilder();
            choose = reader.nextInt();
//            switch (choose) {
//                case 1:
//                    stack.push(reader.nextInt());
//                    break;
//                case 2:
//                    if (!stack.isEmpty()) {
//                        stack.pop();
//                    }
//                    break;
//            }
            if (choose == 1) {
                stack.push(reader.nextInt());
            }else if (choose == 2) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }else {
                if (!stack.isEmpty()) {
                    reader.println(stack.peek());
                } else {
                    reader.println("Empty!");
                }
            }
        }
        reader.close();
    }

    public static void main(String[] args) {

        easyStack();
    }
}
