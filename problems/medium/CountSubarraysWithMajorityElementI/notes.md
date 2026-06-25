# 3737. Count Majority Subarrays

> **Majority Subarray**  
> A subarray is valid if `target` appears more times than all non-target elements combined.

## Core Idea

Convert `nums` into scores:

```java
nums[i] == target  ->  1
nums[i] != target  -> -1
```

Then:

```text
valid majority subarray <=> subarray sum > 0
```

Because:

```text
#target > #non-target
```

## Prefix / Accumulated Advantage

`prefix` means:

```text
target count - non-target count so far
```

Example:

```text
nums      = [1, 2, 1, 1]
target    = 1
converted = [1, -1, 1, 1]
prefix    = [0, 1, 0, 1, 2]
```

The first `0` means before the array starts.

For any subarray:

```text
subarray sum = prefix[right] - prefix[left]
```

So valid condition is:

```text
prefix[right] > prefix[left]
```

Therefore:

```text
count pairs where left < right and prefix[left] < prefix[right]
```

## Brute Force Prefix Solution

- Build `prefix` array of size `n + 1`.
- Check every pair `(left, right)`.
- If `prefix[right] > prefix[left]`, count it.

```text
Time:  O(n^2)
Space: O(n)
```

## Fenwick Tree Solution

Repeated question:

```text
For current prefix, how many previous prefix values are smaller?
```

Fenwick Tree stores:

```text
how many times each prefix value has appeared
```

Because prefix can be negative, use offset:

```java
int offset = n + 1;
int index = prefix + offset;
```

Important operations:

> `bit.add(index, 1)`  
Records that this prefix value appeared once.

> `bit.sum(index)`  
Returns how many recorded prefix values have index `<= index`.

So:

```java
answer += bit.sum(prefix + offset - 1);
```

means:

```text
count previous prefix values strictly smaller than current prefix
```

Then:

```java
bit.add(prefix + offset, 1);
```

records current prefix.

## Fenwick Syntax

```java
index += index & -index;
```

Move to next Fenwick position.

```java
index -= index & -index;
```

Move backward while calculating prefix frequency sum.

```java
index & -index
```

Gets the lowest set bit.

## Complexity

Brute force:

```text
Time:  O(n^2)
Space: O(n)
```

Fenwick Tree:

```text
Time:  O(n log n)
Space: O(n)
```

