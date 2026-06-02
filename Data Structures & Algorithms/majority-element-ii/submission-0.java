class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        int sz = nums.length;
        for (int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
        for (var entry : map.entrySet()) {
            if (entry.getValue() > sz / 3)
                result.add(entry.getKey());
        }
        return result;
    }
}