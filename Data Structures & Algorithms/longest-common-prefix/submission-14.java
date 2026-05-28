class Solution {
    public String longestCommonPrefix(String[] strs) {
        int k = 0, sz = strs.length,  count = 0;
        if (sz == 1)
            return strs[0];
        String s = strs[0];
        for (int j = 0; j < s.length(); j++) {
            for (int i = 1; i < sz; i++) {
                                    // System.out.println(strs[i]+" strs["+i+"] with length "+strs[i].length()+ " with j "+j +" "+  i+" "+"count "+count);
                if (strs[i].length() == j || strs[i].length() == 0) {

                    return count == 0 ? "" : strs[0].substring(0, count);
                } else if (strs[i].charAt(j) == s.charAt(j) && i == sz - 1)
                    count++;
                else if (strs[i].charAt(j) == s.charAt(j))
                    continue;
                else
                    return count == 0 ? "" : strs[0].substring(0, count);
            }
        }
        return count == 0 ? "" : strs[0].substring(0, count);
    }
}