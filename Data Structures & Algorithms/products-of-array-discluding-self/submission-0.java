class Solution {
    public int[] productExceptSelf(int[] nums) {
        int sz = nums.length;
        int[] pro = new int[sz];
        pro[0] = 1;
        for (int i = 1; i < sz; i++) pro[i] = pro[i - 1] * nums[i - 1];
        int suf = 1;
        for (int i = sz - 1; i >= 0; i--) {
            pro[i] = pro[i] * suf;
            suf *= nums[i];
        }
        return pro;
    }
}
