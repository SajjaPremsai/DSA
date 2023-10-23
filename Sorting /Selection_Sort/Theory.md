# Selection Sort

The algorithm starts with a loop that iterates through each element of the array. For each iteration, it calculates the index of the last element in the remaining unsorted part of the array. Then, it calls the `maxElement` function, which identifies the index of the maximum element within the range of the array from the start index to the last index. After obtaining the index of the maximum element, the algorithm swaps it with the last element of the unsorted part, effectively placing the maximum element at its correct position in the sorted array.

`    arr is the array
	n is the length of the array
    for i from 0 to n-1
	    last = n-i-1
	    max_index = maxElement(arr,0,last)
	    // maxElement is a function that takes three parameters array , start index and last index.
	    swap(arr,max_index,last)
	[END OF FOR LOOP]
`

## Time Complexity
**Worst Case :** O(n^2)
**Best Case :** O(n^2)
**Average Case :** O(n^2)


	
	    
	    
