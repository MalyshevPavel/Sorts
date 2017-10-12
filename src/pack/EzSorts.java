package pack;

public class EzSorts {
    public static int[] bubbleSort(int[] arr) {
        int N = arr.length - 1;
        boolean f;
        do {
            f = false;
            for (int j = 0; j < N; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                    f = true;
                }
            }
            N--;
        } while (f);
        return arr;
    }

    public static int[] countSort(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            if (max < arr[i]) max = arr[i];
            if (min > arr[i]) min = arr[i];

        }
        // System.out.println("max = " + max);
        // System.out.println("min = " + min);
        int[] b = new int[max - min + 1];
        for (int i = 0; i < N; i++) b[arr[i] - min]++;
        int index = 0;
        for (int i = 0; i < b.length; i++) {
            for (int j = b[i]; j > 0; j--) {
                arr[index++] = i + min;
            }
        }
        return (arr);
    }

    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int tmp = arr[i];
            for (; j >= 0; j--) {
                if (tmp < arr[j]) arr[j + 1] = arr[j];
                else break;
            }
            arr[j + 1] = tmp;
        }
        return arr;
    }
}
