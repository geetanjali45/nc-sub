class Solution {
    public int[] getConcatenation(int[] nums) {
        int sz = nums.length, i = 0;
        int[] ans = new int[sz*2];
        for(int n : nums){
            ans[i] = ans[i+sz] = nums[i];
            i++;
        }
        return ans;
    }
}