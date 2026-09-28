/*
 * Platform: LeetCode
 * Problem: 0
 * URL: https://leetcode.com/submissions/detail/2147927997/
 * Language: Java
 * Difficulty: Unknown
 * Topics: Uncategorized
 * Runtime: 0 ms
 * Memory: 47.23 MB
 * Synced: 2026-09-24T14:10:13.433Z
 */

1class Solution {
2    public int missingNumber(int[] nums) {
3        int xor = nums.length;
4
5        for (int i = 0; i < nums.length; i++) {
6            xor ^= i;
7            xor ^= nums[i];
8        }
9
10        return xor;
11    }
12}
