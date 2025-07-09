class Solution {
    public int firstMissingPositive(int[] nums) {
        boolean[] a = new boolean[10000];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0 && nums[i] < 10000)
                a[nums[i]] = true;
        }

        for (int j = 1; j < a.length; j++) {
            if (!a[j])
                return j;
        }

        return 1;  // edge case
    }
}
