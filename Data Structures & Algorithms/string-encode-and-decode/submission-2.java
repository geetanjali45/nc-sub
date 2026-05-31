class Solution {
    public String encode(List<String> strs) {
        StringBuilder s = new StringBuilder();
        for (String str : strs) s.append(str.length()).append("#").append(str);
        return s.toString();
    }

    public List<String> decode(String str) {
        List<String> s = new ArrayList<>();
        int i = 0, sz = str.length();
        while (i < sz) {
            int delimeter = str.indexOf("#", i);
            Integer len = Integer.parseInt(str.substring(i, delimeter));
            s.add(str.substring(delimeter + 1, delimeter + len + 1));
            i = delimeter + len + 1;
            // System.out.println(len);
            // break;
        }
        return s;
    }
}
