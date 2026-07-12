class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> stringSet = new HashSet<>();
        int l = 0, len = s.length(), res = 0;
        for (int r = 0; r < len; r++) {
            while (stringSet.contains(s.charAt(r))) {
                stringSet.remove(s.charAt(l));
                l++;
            }
            stringSet.add(s.charAt(r));
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}
