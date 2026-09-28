class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n=people.length;
        Arrays.sort(people);

        int left=0,right=n-1,count=0;

        while(left<=right) {
            int weight=people[left]+people[right];
            if(weight<=limit) {
                left++;
            }

            right--;
            count++;
        }
        return count;
    }
}