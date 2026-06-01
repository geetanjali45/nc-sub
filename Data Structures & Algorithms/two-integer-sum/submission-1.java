class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sz = nums.length;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < sz; i++) {
            if (hashMap.containsKey(target - nums[i])) {
                return i < hashMap.get(target - nums[i]) ? new int[] {i, hashMap.get(target - nums[i])} : new int[] {hashMap.get(target - nums[i]), i};
            }
            hashMap.put(nums[i], i);
        }
        return new int[] {-1, -1};
    }
}
