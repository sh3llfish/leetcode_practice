# 0066. Plus One

## Example

`1, 2, 3`

- $3 < 9$ -> add 1 and return `1, 2, 4`

`1, 2, 9`

- $9 = 9$ -> 9 -> 0
- $2 < 9$ -> add 1 and return `1, 3, 0`

`9, 9, 9`

- all digits == 9 -> all digits -> 0
- create a new array start with 1
- `1, 0, 0, 0`

## Complexity

- Time: $O(n) worst case - all 9
- Space: $O(n)$ worst case - all 9
