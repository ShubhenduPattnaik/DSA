arr = [11,1,45,33,2,13,15]

def bubble_sort(arr):
    n = len(arr)
    for i in range(n):
        swapped = True
        for j in range(0, n-i-1):
            if arr[j] > arr[j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]
        if swapped == False:
            break

    return arr

print(bubble_sort(arr))