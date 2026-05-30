class Solution {
    public int removeElement(int[] nums, int val) {
        int j = 0, sz = nums.length;
        for (int i = 0; i < sz && j < sz; i++) {
            if (nums[i] != val) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}