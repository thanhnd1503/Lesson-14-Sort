import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4, 2, 9, 6, 23, 12, 34, 0, 1};
        System.out.println("Mảng gốc: " + Arrays.toString(arr));

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
            System.out.println("Bước " + i + ": " + Arrays.toString(arr));
        }
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(arr));
    }
}
