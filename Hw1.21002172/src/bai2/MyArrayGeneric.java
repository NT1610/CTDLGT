package bai2;

import java.util.Arrays;
import java.util.Comparator;

public class MyArrayGeneric<T> {
        private final T[] array;

        public MyArrayGeneric(int length) {
            this.array = (T[]) new Object[length];
        }


        public void set(int i, T e) {
            array[i] = e;
        }

        public Object[] getObj_array() {
            return array;
        }

        public boolean searchArr(T x) {
            for (int i = 0; i < array.length; i++) {
                if (x == array[i]) {
                    return true;
                }
            }
            return false;
        }

        public void sort(Comparator<T> comp) {
            for (int i = 0; i < array.length - 2; i++) {
                for (int j = array.length - 1; j > i; j--) {
                    if (comp.compare(this.array[i], this.array[j]) > 0) {
                        T tmp = array[i];
                        array[i] = array[j];
                        array[j] = tmp;
                    }
                }
            }
        }

        @Override
        public String toString() {
            return Arrays.toString(array);
        }
}

