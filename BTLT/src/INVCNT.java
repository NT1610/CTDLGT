import java.util.*;
import java.io.*;

class INVCNT {
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
    static long mergeSort(int[] arr, int left, int right) {
        long inversions = 0;
        if (left < right) {
            int mid = (left + right) / 2;
            inversions += mergeSort(arr, left, mid);
            inversions += mergeSort(arr, mid+1, right);
            inversions += merge(arr, left, mid, right);
        }
        return inversions;
    }

    static long merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        long inversions = 0;
        int i = left, j = mid+1, k = 0;
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                inversions += (mid - i + 1);
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }
        for (i = left, k = 0; i <= right; i++, k++) {
            arr[i] = temp[k];
        }
        return inversions;
    }

    public static void main(String[] args) throws IOException {
        fastio reader = new fastio();
        int t = reader.nextInt();
        while (t-- > 0) {
            int n = reader.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = reader.nextInt();
            }
            reader.println(mergeSort(arr, 0, n-1));
        }

        reader.close();
    }
}