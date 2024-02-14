package eva;

import java.util.*;
import java.lang.*;

public class MyArray {
    private int[] array;

    public MyArray() {
        this(8);
    }

    public MyArray(boolean f) {
        this(8, f);
    }

    public MyArray(int size) {
        array = new int[size];
    }

    public MyArray(int size, boolean f) {
        this(size);
        if (f) {
            fill(10);
        }

    }

    public MyArray(int[] array)
    {
        this.array = Arrays.copyOf(array,array.length);
    }

    public void fill(int k) {
        java.util.Random random =
                new java.util.Random(System.currentTimeMillis());
        for (int i = 0; i <array.length; i++) {
            array[i] = random.nextInt(k + 1);
        }
    }

    public String toString() {
        return Arrays.toString(Arrays.copyOf(array, array.length));
    }

    public int size() {
        return array.length;
    };


    public int get(int index) {
        if (isWrongIndex(index)) {
            return Integer.MAX_VALUE;
        }
        return array[index];
    }

    public boolean isWrongIndex(int index)
    {
        return index < 0 || index >= array.length;
    }

    public int set(int index, int newValue) {
        if (isWrongIndex(index)) {
            return Integer.MAX_VALUE;
        }
        int temp = array[index];
        array[index] = newValue;
        return temp;
    }

    public void sort(boolean f){
        Arrays.sort(array);
        if (!f) {
           reverse();
        }
    }

    private void reverse() {
        for(int i = 0; i < array.length/2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    int[] subArray(int indexFrom, int indexTo) {
        if (isWrongIndex(indexFrom) ||
            isWrongIndex(indexTo)) {
            return null;
        }
        return Arrays.copyOfRange(array, indexFrom, indexTo);
    }

    boolean equals(MyArray other) {
        return Arrays.equals(array, other.array);
    }
}


/*
class DescComparator implements Comparator<Integer> {
    public int compare(Integer prev, Integer next)
    {
        return next - prev;
    }
}
*/


