package pack;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int a[] = {2, 7, 4, 9, 6};
        int b[] = {2, 10, 1, 5, 133, 4};
        int c[] = {0, 3, 12, 4, 8, -2};
        System.out.print("bubble" + " ");
        prn(EzSorts.bubbleSort(a));
        System.out.print("count" + " ");
        prn(EzSorts.countSort(b));
        System.out.print("insertion" + " ");
        prn(EzSorts.insertionSort(c));
    }

    static void prn(int[] a) {
        System.out.println(Arrays.toString(a));
    }
}
