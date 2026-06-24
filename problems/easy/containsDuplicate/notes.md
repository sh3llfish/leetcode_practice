# 217. Contains Duplicate

## Initial Approach - Sorting

The first solution sorts the array first:

- sort the whole `nums` array
- after sorting, duplicate values must be next to each other
- loop through the array and check whether `nums[i] == nums[i + 1]`

If any adjacent values are the same, return `true`.

This results in a time complexity $O(n \log n)$ because sorting dominates the solution.

Space complexity can be $O(1)$ or $O(\log n)$ depending on the sorting implementation.

## Optimised Approach - HashSet

Instead of sorting the array, use a `HashSet` to remember numbers we have already seen.

Set only stores values, because we do not need the index in this question.

For each number in `nums[i]`, check **if the current value has been seen before**.

- If `true`, return `true`
- If `false`, add current value into the `HashSet`

In this case, the final time complexity is $O(n)$, as each `HashSet` lookup is average $O(1)$.

However, space complexity grow to $O(n)$ as in the worst case, we may store every number in the `HashSet`.

So the tradeoff is:

- Sorting solution uses less extra space but is slower
- HashSet solution uses more extra space but is faster

