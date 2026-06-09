class Solution {
    public int maxArea(int[] a) {
        int i = 0, j = a.length - 1, res = Integer.MIN_VALUE;
        while (i < j) {
            res = Math.max(res, (j - i) * Math.min(a[i], a[j]));
            if (a[i] < a[j])
                i++;
            else
                j--;
        }
        return res;
    }
}
