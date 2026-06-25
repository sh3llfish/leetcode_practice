validate target existence. Non-exsit -> return 0;

// Target valid

Majority element subarray.

-> Index preserved
-> Maximum length of subarray is 2 * count(target) - 1
-> Minimum length of subarray is 1. [target]

for {1, 1, 1, 1}
{1} {1} {1} {1}      4
{1, 1} {1, 1} {1, 1} 3
{1, 1, 1} {1, 1, 1}  2
{1, 1, 1, 1}         1


for {1, 2, 1, 1}
{1} {1} {1}          3
{1, 1}               1
{1,2,1} {2, 1, 1}    2
{1, 2, 1, 1}         1

{1, -1, 1, 1}


[1, 2, 2, 3] T = 2
[-1, 1, 1, -1] COVERT


for i in range(1, Count(T) * 2 - 1):
    total_array_count += coverted subarray length [i] with sum > 0

return total_array_count 

prefix sum is more efficient
`prefix[i] = sum of elements before index i`

original {1, 2, 1, 1}
mask     {1, -1, 1, 1}
prefix_Sum   {0, 1, 0, 1, 2}
subarray_Sum {}

