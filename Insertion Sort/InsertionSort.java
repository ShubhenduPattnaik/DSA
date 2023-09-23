public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 1, 0, -1, 34 };
        int i = 0;
        int j = 0;
        for (i = 1; i < arr.length; i++) {
            int curVar = arr[i];
            for (j = i - 1; j >= 0 && arr[j] > curVar; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = curVar;
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
