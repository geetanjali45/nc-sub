class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0;
        while ( j < n) {
            nums1[i+j+m]=nums2[j++];
        }
        Arrays.sort(nums1);
    }
}