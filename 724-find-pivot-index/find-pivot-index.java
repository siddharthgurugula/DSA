class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int tot=0,ls=0,rs=0;

        for(int i=0;i<n;i++) {
            tot+=nums[i];
        }

        for(int i=0;i<n;i++) {
            rs=tot-ls-nums[i];

            if(ls==rs) {
                return i;
            }

            ls+=nums[i];
        }
        return -1;   
    }
}