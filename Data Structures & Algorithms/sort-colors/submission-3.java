class Solution {
    public void swap(int[] nums, int low, int j) {
        int temp = nums[low];
        nums[low] = nums[j];
        nums[j] = temp;
    }
    public void sortColors(int[] nums) {
        int mid = 0, high = nums.length-1, low = 0;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;mid++;
            } else if (nums[mid] == 2) {
                swap(nums, high, mid);
                high--;
            } else {
                mid++;
            }
            // System.out.println(low +""+j+""+mid+""+high);
        }
    }
}