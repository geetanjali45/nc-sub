class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int n = people.length-1, i = 0,count=0;
        while (i <= n) {
            int remain = limit - people[n--];
            count++;
            if (i<=n && people[i] <= remain)
                i++;
        }
        return count;
    }
}