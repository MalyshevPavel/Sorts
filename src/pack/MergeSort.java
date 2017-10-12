package pack;

import java.util.Arrays;

public class MergeSort {
    public static int[] mergeSort(int arr[]) {
        int N = arr.length;
        if (N < 2) return arr;
        int m = N / 2;
        int[] arr1 = Arrays.copyOfRange(arr, 0, m);
        int[] arr2 = Arrays.copyOfRange(arr, m, N);
        return merge(mergeSort(arr1), mergeSort(arr2));
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int n = arr1.length + arr2.length;
        int[] arr = new int[n];
        int i = 0;
        int j = 0;
        for (int k = 0; k < n; k++) {
            if (i == arr1.length)
                arr[k] = arr2[j++];
            else if (j == arr2.length)
                arr[k] = arr1[i++];
            else {
                if (arr1[i] < arr2[j])
                    arr[k] = arr1[i++];
                else arr[k] = arr2[j++];
            }
        }
        return arr;
    }
}
