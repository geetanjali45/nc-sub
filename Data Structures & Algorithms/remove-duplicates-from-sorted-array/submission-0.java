class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1, sz = nums.length;
        for (int i = 1; i < sz && j < sz; i++) {
            if (nums[i - 1] != nums[i]) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}