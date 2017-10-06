package pack;

public class QuickSort {
    public static int[] sort(int arr[]) {
        qSort(arr, 0, arr.length - 1);
        return arr;
    }

    public static int[] qSort(int arr[], int l, int r) {
        if (l >= r) return arr;
        int i = l;
        int j = r;
        int m = i - (i - j) / 2;
        while (i < j) {
            while ((i < m) && (arr[i] <= arr[m])) i++;
            while ((j > m) && (arr[j] >= arr[m])) j--;
            if (i < j) swap(arr, i, j);
            if (i == m) m = j;
            else if (j == m) m = i;
        }
        qSort(arr, l, m);
        qSort(arr, m + 1, r);
        return arr;
    }

    public static void swap(int arr[], int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
