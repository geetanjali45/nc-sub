class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int sz = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < sz; i++) {
            if (map.containsKey(nums[i])) {
                if (Math.abs(map.get(nums[i]) - i) <= k)
                    return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}