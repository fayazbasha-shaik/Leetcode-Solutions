class Solution {
    public List<Integer> findLonely(int[] nums) {

        List<Integer> ans = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            boolean unique = true;
            boolean adjacent = false;

            if (i > 0 && nums[i] == nums[i - 1])
                unique = false;

            if (i < nums.length - 1 && nums[i] == nums[i + 1])
                unique = false;

            if (i > 0 && nums[i] - 1 == nums[i - 1])
                adjacent = true;

            if (i < nums.length - 1 && nums[i] + 1 == nums[i + 1])
                adjacent = true;

            if (unique && !adjacent)
                ans.add(nums[i]);
        }

        return ans;
    }
}