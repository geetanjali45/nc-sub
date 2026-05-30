class Solution {
    public int majorityElement(int[] nums) {
        int sz = nums.length;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }
        for (var entry : hashMap.entrySet()) {
            if (entry.getValue() > (sz / 2))
                return entry.getKey();
        }
        return -1;
    }
}
