class Solution {
    public int[] searchRange(int[] nums,int target) {
        int[] ans={-1,-1};
        for(int k=0;k<2;k++) {
            int low=0;
            int high=nums.length-1;
            int pos=-1;

            while(low<=high) {
                int mid=(low+high)/2;
                if(nums[mid]==target) {
                    pos=mid;
                    if(k==0) {
                        high=mid-1;
                    } else {
                        low=mid+1;
                    }
                } else if(nums[mid]<target) {
                    low=mid+1;
                } else {
                    high=mid-1;
                }
            }
            ans[k]=pos;
        }
        return ans;
    }
}