class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(0, 1);
        int cursum = 0, res = 0;
        for (int i = 0; i < nums.length; i++) {
            cursum += nums[i];
            int x = cursum - k;
            if (hashMap.containsKey(x))
                res += hashMap.get(x);
            hashMap.put(cursum, hashMap.getOrDefault(cursum,0) + 1);
        }
        return res;
    }
}