public class SelectionSort {
    public static void main(String args[]) {
        int[] arr = { 18, 1, 43, 23, 19, 21, 11 };

        for (int i = 0; i < arr.length; i++) {
            int minimum = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minimum]) {
                    minimum = j;
                }
            }
            if (minimum != i) {
                int temp = arr[i];
                arr[i] = arr[minimum];
                arr[minimum] = temp;
            } else
                break;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
