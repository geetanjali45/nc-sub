class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0, j = 0, len1 = word1.length(), len2 = word2.length();
        StringBuilder str = new StringBuilder();
        while (i < len1 && j < len2) {
            str.append(word1.charAt(i++));
            str.append(word2.charAt(j++));
        }
        if (i < len1) 
            str.append(word1.substring(i, len1));
        if (j < len2) 
            str.append(word2.substring(j, len2));
        return str.toString();
    }
}