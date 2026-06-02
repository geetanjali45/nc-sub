class Solution {
    public int firstMissingPositive(int[] nums) {
        int sz = nums.length, i = 0;
        // i to track the first element not less than 0
        Arrays.sort(nums);
        while (i < sz && nums[i] <= 0) i++;
        System.out.println(i);
        if (i == sz - 1 )
            if (nums[i] <= 0 )
                return 1;
        if(nums[sz-1] < 0) return 1;
        // if ( nums[i] > 1)
        //     return 1;
        if(i==sz) return 1;
        if(nums[i]>1) return 1;

        for (int j = Math.max(i, 1); j < sz; j++) {
            if (nums[j] == nums[j - 1] + 1 || nums[j] == nums[j - 1] || nums[j] == 1)
                continue;
            else if (nums[j] > nums[j - 1] + 1)
                return nums[j - 1] + 1;
        }
        if (nums[sz - 1] > 0)
            return nums[sz - 1] + 1;
        return -1;
    }
}