class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int i=0,z=0,maxLen=Integer.MIN_VALUE;

        for(int j=0;j<n;j++) {
            if(nums[j]==0) {
                z++;
            }
            while(z>k) {
                if(nums[i]==0) {
                  z--;
                }
                i++;
            }
            maxLen=Math.max(maxLen,j-i+1);
        }
        return maxLen;
    }
}