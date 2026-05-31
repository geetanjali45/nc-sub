class Solution {
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void sortColors(int[] nums) {
        int low = -1, high = nums.length, i = 0, j = high - 1;

        while (i <= j) {
            if (nums[i] == 0) {
                low++;
                swap(nums, i, low);
                i++;
            } else if (nums[i] == 2) {
                high--;
                swap(nums, high, i);
                j--;
            } else {
                i++;
                // j--;
            }
            System.out.println(i +""+j+""+low+""+high);
        }
    }
}