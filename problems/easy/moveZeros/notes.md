# 283. Move Zeroes

## Method: Two Pointers / Write Pointer

Use `write` to track the next position for a non-zero number.

1. Traverse `nums` from left to right.
2. When `nums[i] != 0`, put it at `nums[write]`.
3. Move `write` forward.
4. After all non-zero values are moved, fill the remaining positions with `0`.

## Example

```java
[0, 1, 0, 3, 12]
 write

non-zero order: 1, 3, 12

Result:
[1, 3, 12, 0, 0]

## Complexity

- Time Complexity $O(n)$
- Space Complexity $O(1)$
