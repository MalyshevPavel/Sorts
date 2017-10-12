package pack;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int a[] = {9, 8, 7, 6, 0};
        int b[] = {2, 10, 1, 5, 133, 4};
        int c[] = {0, 3, 12, 4, 8, -2};
        int d[] = {3, 2, 7, 1, 6, 8, 5};
        int e[] = {1, 9, 5, 0, 7, 2, 4, 8, 10};
        int f[] = {2, 1, 0, 6, -1, 9, 8, 7};
        System.out.print("bubble" + " ");
        prn(EzSorts.bubbleSort(a));
        System.out.print("count" + " ");
        prn(EzSorts.countSort(b));
        System.out.print("insertion" + " ");
        prn(EzSorts.insertionSort(c));
        System.out.print("heap" + " ");
        prn(HeapSort.sort(d));
        System.out.print("quick" + " ");
        prn(QuickSort.sort(e));
        System.out.print("merge" + " ");
        prn(MergeSort.mergeSort(f));
    }

    static void prn(int[] a) {
        System.out.println(Arrays.toString(a));
    }
}
