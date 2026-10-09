class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length,tot=0,ls=0;
        int ans[]=new int[n];

        for(int i=0;i<n;i++) {
            tot+=nums[i];
        }

        for(int i=0;i<n;i++) {
            int rs=tot-ls-nums[i];
            int diff=Math.abs(ls-rs);
            ans[i]=diff;
            ls+=nums[i];
        }
        return ans;
    }
}