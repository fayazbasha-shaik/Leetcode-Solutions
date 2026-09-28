/*
 * Platform: LeetCode
 * Problem: 0
 * URL: https://leetcode.com/submissions/detail/2145446330/
 * Language: Java
 * Difficulty: Unknown
 * Topics: Uncategorized
 * Runtime: 4 ms
 * Memory: 47.88 MB
 * Synced: 2026-09-24T14:11:04.573Z
 */

1class Solution {
2    public boolean validPalindrome(String s) {
3        int left=0;
4        int right=s.length()-1;
5        while(left<right){
6            if(s.charAt(left)!=s.charAt(right)){
7                return isPalindrome(s,left+1,right) || isPalindrome(s,left,right-1);
8            }
9            left++;
10            right--;
11        }
12        return true;
13        
14    }
15    public static boolean isPalindrome(String s, int left, int right){
16            while(left<right){
17                if(s.charAt(left)!=s.charAt(right)){
18                    return false;
19                }
20                left++;
21                right--;
22            }
23            return true;
24    }
25
26    
27}
