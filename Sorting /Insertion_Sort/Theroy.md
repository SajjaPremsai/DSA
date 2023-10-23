## Insertion Sort 

The algorithm begins by initializing a variable `i` to 0 and iterates over the array elements, excluding the last element since there will be no element to compare it to. Within this iteration, another loop is initiated with variable `j`, starting from `i+1` and going backwards to 1. This inner loop checks if the current element at index `j` is smaller than the element at index `j-1`. If this condition is satisfied, the two elements are swapped. Otherwise, the inner loop is terminated.

`    arr is the unsorted array gives as input
    start is the initial index
    n = length of the array
    for i  from  0  to length of arr - 1 
      for j from  i+1  to  1 
	    if arr[j] < arr[j-1] 
	     swap arr[j] and arr[j-1]
	     [END OF IF]
	    else 
		    break 
		 [END OF ELSE]
	[END OF FOR]
	[END OF FOR]	
`   
## Time Complexity 
**Best Case :** O(n)
**Worst Case:** O(n^2)
**Average Case :** O(n^2)

