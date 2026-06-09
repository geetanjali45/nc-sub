class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int res = 0, i = 0, j = people.length - 1;
        Arrays.sort(people);
        while (i <= j) {
            int remain = limit - people[j--];
            res++;
            if (i <= j && remain >= people[i])
                i++;
        }
        return res;
    }
}