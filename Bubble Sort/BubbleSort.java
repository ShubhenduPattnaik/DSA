class BubbleSort {

    public static void swap(int[] arr, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int[] bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            int count = 0;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    count++;
                }
            }
            if (count == 0) {
                break;
            }
        }
        return arr;
    }

    public static void main(String args[]) {
        int[] arr = { 11, 1, 45, 33, 2, 13, 15 };
        int[] sortedArray = bubbleSort(arr);
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }

    }
}