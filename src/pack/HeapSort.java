package pack;

public class HeapSort {
    public static int heapSize;

    public static int[] sort(int arr[]) {
        buildHeap(arr);
        while (heapSize > 1) {
            swap(arr, 0, heapSize - 1);
            heapSize--;
            heapify(arr, 0);
        }
        return arr;
    }

    public static void buildHeap(int arr[]) {
        heapSize = arr.length;
        for (int i = heapSize / 2; i >= 0; i--) {
            heapify(arr, i);
        }
    }

    public static void heapify(int arr[], int i) {
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        int max = i;

        if (l < heapSize && arr[i] < arr[l]) {
            max = l;
        }

        if (r < heapSize && arr[max] < arr[r]) {
            max = r;
        }

        if (i != max) {
            swap(arr, i, max);
            heapify(arr, max);
        }
    }

    public static void swap(int arr[], int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
