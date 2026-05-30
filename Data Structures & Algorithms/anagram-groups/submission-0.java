class Solution {
    public List<Integer> getFreqArray(String s) {
        Integer[] freq = new Integer[26];
        Arrays.fill(freq,0);
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        return Arrays.asList(freq);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<List<Integer>, List<String>> hashMap = new HashMap<>();
        for (String str : strs) {
            if (hashMap.containsKey(getFreqArray(str))){
                hashMap.get(getFreqArray(str)).add(str);
            }
            else{
                hashMap.put(getFreqArray(str), new ArrayList<>(Arrays.asList(str)));
            }
        }
        for(var entry: hashMap.entrySet()){
            res.add(entry.getValue());
        }
        return res;
    }
}
