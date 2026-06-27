# 0088. Merge Sorted Array

## Example run:

nums1 = [1, 2, 3, 0, 0, 0]
m = 3

nums2 = [2, 5, 6]
n = 3

___

i = m - 1 = 2    // nums1[i] = 3
j = n - 1 = 2    // nums2[j] = 6
k = m + n - 1 = 5

___

nums1 = [1, 2, 3, 0, 0, 0]

Compare nums1[i] = 3 and nums2[j] = 6
6 is bigger, so nums1[k] = 6

nums1 = [1, 2, 3, 0, 0, 6]
i = 2, j = 1, k = 4

___ 

Compare nums1[i] = 3 and nums2[j] = 5
5 is bigger, so nums1[k] = 5

nums1 = [1, 2, 3, 0, 5, 6]
i = 2, j = 0, k = 3

___

Compare nums1[i] = 3 and nums2[j] = 2
3 is bigger, so nums1[k] = 3

nums1 = [1, 2, 3, 3, 5, 6]
i = 1, j = 0, k = 2

___

Compare nums1[i] = 2 and nums2[j] = 2
nums1[i] is not bigger, so nums1[k] = nums2[j]

nums1 = [1, 2, 2, 3, 5, 6]
i = 1, j = -1, k = 1


___

Stop as j < 0;

result : `nums1 = [1, 2, 2, 3, 5, 6]`


## Complexity

1) Time Complexity -> O(n + m)

2) Space Complexity -> O(1)
