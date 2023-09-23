function InsertionSort(arr) {
    for (var i = 1; i < arr.length; i++) {
        let currVar = arr[i];
        for (var j = i - 1; j >= 0 && arr[j] > currVar; j--) {
            arr[j + 1] = arr[j];
        }
        arr[j + 1] = currVar;
        console.log(arr);
    }
}

console.log(InsertionSort([4, 3, 2, 1, 0, -1, 34]));