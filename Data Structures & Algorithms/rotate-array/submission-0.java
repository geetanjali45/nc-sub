class Solution {
    public void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        for (int j = 0; j < k; j++) {
            int x = arr[n - 1];
            for (int i = n-1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = x;
        }
    }
}