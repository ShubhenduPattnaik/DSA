def selection_sort(arr):
    for i in range(len(arr)):
        minimum = i
        for j in range(i+1, len(arr)):
            if arr[j] < arr[minimum]:
                minimum = j
        if minimum != i:
            arr[minimum], arr[i] = arr[i], arr[minimum]
        else: break
    return arr
            
print(selection_sort([18, 1, 43, 23, 19, 21, 11]))