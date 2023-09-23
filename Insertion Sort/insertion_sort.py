def insertion_sort(arr):
    for i in range(1, len(arr)):
        curVar = arr[i]
        j=i-1
        while(j>=0 and arr[j]>curVar):
            arr[j+1] = arr[j]
            j -= 1
        arr[j+1] = curVar
    return arr

print(insertion_sort([4, 3, 2, 1, 0, -1, 34]))
        