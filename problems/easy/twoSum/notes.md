# 1. Two Sum

## Initial Approach - Brute Force

The first solution uses two nested loops:
- for each number in `nums[i]`
- search the rest of the array to find another number `nums[j]` such that
- `nums[i] + nums[j] = target`
Result in a time complexity $O(n^2)$ which is not optimal

## Optimised Approach - HashMap

Instead of searching the rest of the array everytime, use a `HashMap` to remember numbers we have already seen.

Map stores value to index pair - `{num_value, index}`

For each number in `nums[i]` we calculate the difference and check **if the difference value have seen before**.

- If `true`, return the index pair `{seen.get(diff), i}`
- If `false`, add current value and index pair into seen map.

In this case, the final time complexity is $O(n)$, as each `HashMap` lookup is average $O(1)$.

However, space complexity grow to $O(n)$ as in the worst case, we may store almost every number in the `HashMap`.

