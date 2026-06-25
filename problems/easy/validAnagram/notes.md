# 242. Valid Anagram

> **Anagram** 
> An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, using all the original letters exactly once.

## $s,t \in \Sigma^*, \quad \Sigma = \{a,\dots,z\}$
- The possible value of s and t are limited to 26 lower case English characters.
- Use a `int[26]` to track the occurrence of each character.
- Return `false` when:
    - length are not equal
    - not enough character to reconstruct s from t (negative occurrence count)

## $s,t \in \mathcal{U}^*, \quad \mathcal{U} = \{\text{all Unicode code points}\}$

### Unicode Characters

In Java, a `char` is **not always one real character**.
```java
U+0000 to U+FFFF //one Java char
U+10000 to U+10FFFF // two Java char
```
Java `char` is only **16-bit**. Some Unicode characters,
especially emoji :confused: `U+1F615` and rare character 𠮷 `U+20BB7`
are represented by **2 chars**.

Therefore, Unicode-safe code should use **code points**.

> Code Point 
A code point is the **Unicode number** for a character.

> `stringName.codePointCount(beginIndex, endIndex)`
Counts How many Unicode code points exist between `beginIndex`(inclusive) and `endIndex`(exclusive)

> `stringName.codePoints()`
Returns all Unicode code points in the string as an `IntStream`.
Usually used with `.forEach()` clause.

> `stringName.forEach(variable -> { action });`
Runs action **once** for each item in the **Stream**.

> `mapName.getOrDefault(key, defaultValue)`
Gets the value for `key`.
If the key does not exist, return `dafaultValue`.

### More General Solution

With knowledge of Unicode Characters we need:
- Compare the number of Unicode code points using `codePointCount()`
- Maintain a `HashMap` to track occurrence of each Unicode char.
    - use <Integer, Integer> for <Uni_char, count>
- Count occurrence of each unicode char in `s`.
- Subtract occurrence of each unicode char in `t`.
- Go through the `HashMap`, if any count value != 0, return false

## Time Complexity

Generally the lowercase alphabet solution and unicode-safe solution are both $O(n)
 as they only process each character / codepoint once or constant number of times.
No nested loops.


## Space Complexitr

In terms of space, lowercase alphabet solution is $O(1)$ as array size is limited to 26.

but unicode-safe solution may take worst case $O(n)$ space if every char is different.



