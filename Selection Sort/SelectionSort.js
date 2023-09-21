function SelectionSort(arr) {
    for (let i = 0; i < arr.length; i++) {
        let minimum = i;
        for (let j = i + 1; j < arr.length; j++) {
            if (arr[j] < arr[minimum]) {
                minimum = j;
            }
        }
        if (minimum !== i) {
            [arr[minimum], arr[i]] = [arr[i], arr[minimum]];
        } else
            break;
    }
    return arr;
}

console.log(SelectionSort([18, 1, 43, 23, 19, 21, 11]));