class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;

        int left=0;
        int sum=0;
        double avg=Double.NEGATIVE_INFINITY;
        for(int right=0;right<n;right++) {
            sum=sum+nums[right];
            if(right-left+1==k) {
                double curr_avg=(double)sum/k;
                avg=Math.max(curr_avg,avg);
                sum=sum-nums[left];
                left++;
            }
        }
        return avg;
    }
}