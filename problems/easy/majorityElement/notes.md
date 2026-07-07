#0169. Majority Element

## Boyer-Moore Voting Algorithm

> core idea is **pair canncellation**.

Suppose the majority element is `M`. Since `M` appears more than `n/2` times.
It appears more often than other numbers combined.

So whenever we match:
- one `M`
- one `non-M`
can cancel both, `M` must still be the final survivor

## Example

`nums = [2, 2, 1, 1, 1, 2, 2]`

| Num | Candidate | Count |
| --- | --------- | ----- |
| 2 | 2 | 1 |
| 2 | 2 | 2 |
| 1 | 2 | 1 |
| 1 | 2 | 0 |
| 1 | 1 | 1 |
| 2 | 1 | 0 |
| 2 | 2 | 1 |

Final candidate : `2`

in the other word:
`count = unmatched occurrences of the current candidate`

The algorithm does not require the candidate to always be the majority during traversal. 
It only guarantees that the final survivor is the majority when a majority element definitely exists.

## Complexity

- Time $O(n)$ - traverse once
- Space $O(1)$ - constant space
