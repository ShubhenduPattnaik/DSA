function BubbleSort(arr) {
    for (let i = arr.length; i > 0; i--) {
        let swapped = false;
        for (let j = 0; j < i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                [arr[j], arr[j + 1]] = [arr[j + 1], arr[j]];
                swapped = true;
            }
        }
        if (swapped == false) {
            break;
        }
    }
    return arr;
}

console.log(BubbleSort([18, 1, 43, 23, 19, 21, 11]));