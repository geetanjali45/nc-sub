class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i = 0, j = str.length() - 1;
        System.out.println(str);
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public boolean validPalindrome(String str) {
        if (isPalindrome(str))
            return true;

        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                break;
            i++;
            j--;
        }
        return isPalindrome(new StringBuilder(str).deleteCharAt(i).toString())
            || isPalindrome(new StringBuilder(str).deleteCharAt(j).toString());
    }
}