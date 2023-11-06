import java.util.Random;

public class quicksortrandom {
    public static void main(String[] args) {
        int[] A = {23, 34, 54, 123, 34, 56, 67676, 112};
        int n = A.length;
        randomizedQuickSort(A, 0, n - 1);
        for (int i : A) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int partition(int[] arr, int p, int r) {
        int x = arr[r];
        int i = p - 1;
        for (int j = p; j < r; j++) {
            if (arr[j] <= x) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, r);
        return i + 1;
    }

    public static void quickSort(int[] arr, int p, int r) {
        if (p < r) {
            int q = partition(arr, p, r);
            quickSort(arr, p, q - 1);
            quickSort(arr, q + 1, r);
        }
    }

    public static int randomPartition(int[] arr, int p, int r) {
        int x = arr[r];
        Random rand = new Random();
        int i = rand.nextInt(r - p + 1) + p;
        System.out.println(i);
        for (int j = p; j < r; j++) {
            if (arr[j] <= x) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, r);
        return i + 1;
    }

    public static void randomizedQuickSort(int[] arr, int p, int r) {
        if (p < r) {
            int q = randomPartition(arr, p, r);
            randomizedQuickSort(arr, p, q - 1);
            randomizedQuickSort(arr, q + 1, r);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
