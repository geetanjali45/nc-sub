class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int sz = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        Set<List<Integer>> s = new HashSet<>();
        Arrays.sort(nums);
        for (int z = 0; z <= sz - 4; z++) {
            // if (z > 0 && nums[z] == nums[z - 1])
            //     continue;
            for (int i = z + 1; i <= sz - 3; i++) {
                // if (i > 0 && nums[i] == nums[i - 1])
                //     continue;
                int j = i + 1, k = sz - 1;

                while (j < k) {
                    long sum = (long) nums[z] + nums[i] + nums[j] + nums[k];
                    if (sum == target) {
                        s.add(Arrays.asList(nums[z], nums[i], nums[j], nums[k]));
                        j++;
                        k--;
                        // while (j < k && nums[j] == nums[j - 1]) j++;
                        // while (j < k && nums[k] == nums[k + 1]) k--;
                    } else if (sum < target) {
                        j++;
                    } else {
                        k--;
                    }
                }
            }
        }
        for(var ele : s){
            res.add(ele);
        }

        return res;
    }
}