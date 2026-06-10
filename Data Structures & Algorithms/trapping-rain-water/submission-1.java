class Solution {
    public int trap(int[] height) {
        int sz = height.length, res = 0;
        int[] prevMax = new int[sz];
        int[] nextMax = new int[sz];
        prevMax[0] = height[0];
        nextMax[sz - 1] = height[sz - 1];
        for (int i = 1; i < sz; i++) prevMax[i] = Math.max(prevMax[i - 1], height[i]);
        for (int i = sz - 2; i >= 0; i--) nextMax[i] = Math.max(nextMax[i + 1], height[i]);
        for (int i = 0; i < sz; i++) res += Math.min(prevMax[i], nextMax[i]) - height[i];
        return res;
    }
}
