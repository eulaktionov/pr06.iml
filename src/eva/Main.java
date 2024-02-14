package eva;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("eva.MyArray\n");

        MyArray arrayDefault = new MyArray();
        print("arrayDefault", arrayDefault);

        MyArray arrayRandom = new MyArray(true);
        print("arrayRandom", arrayRandom);

        MyArray arrayEmpty4 = new MyArray(4);
        print("arrayEmpty4", arrayEmpty4);

        MyArray arrayRandom10 = new MyArray(10, true);
        print("arrayRandom10", arrayRandom10);

        MyArray arrayCopy = new MyArray(new int[] {2,5,8,2,2,11,7});
        print("arrayCopy", arrayCopy);

        System.out.printf("%d%n", arrayCopy.get(2));
        System.out.printf("%d%n", arrayCopy.get(9));

        int result = arrayCopy.set(2, 20);
        if (result != Integer.MAX_VALUE) {
            System.out.printf("%d%n", result);
            print("arrayCopy", arrayCopy);
        }
        else {
            System.out.printf("Index error!");
        }

        result = arrayCopy.set(20, 20);
        if (result != Integer.MAX_VALUE) {
            System.out.printf("%d%n", result);
            print("arrayCopy", arrayCopy);
        }
        else {
            System.out.println("Index error!");
        }

        arrayCopy.sort(true);
        print("arrayCopy", arrayCopy);

        arrayCopy.sort(false);
        print("arrayCopy", arrayCopy);

        int[] subArray = arrayCopy.subArray(2,6);
        System.out.println(Arrays.toString(subArray));

        MyArray array1 = new MyArray(new int[] {1,2,3,4});
        MyArray array2 = new MyArray(new int[] {1,2,3,4});
        print("array1", array1);
        print("array2", array2);
        System.out.println(arrayCopy.equals(array1));
        System.out.println(array2.equals(array1));
    }

    private static void print(String title, MyArray array){
        System.out.printf("%12s:%4d %s%n", title,
                array.size(), array.toString());
        System.out.println();
    }
}

