class Solution {
    public boolean isAnagram(String s, String t) {
        String s1[] = s.split("");
        String s2[] = t.split("");
        if(s1.length == s2.length){
           Arrays.sort(s1);
           Arrays.sort(s2);

           return Arrays.equals(s1,s2);
        }
        return false;

    }
}
