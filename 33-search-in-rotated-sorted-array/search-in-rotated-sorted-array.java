class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int rotations=0;
        for(int i=0;i<n;i++) {
            if(nums[i]<min) {
               min=nums[i];
               rotations=i;
            }
        }

        Arrays.sort(nums);

        int low=0,high=n-1;

        while(low<=high) {
            int mid=(low+high)/2;
            if(nums[mid]==target) {
                return (mid+rotations)%n;
            } else if(nums[mid]>target) {
                high=mid-1;
            } else {
                low=mid+1;
            }
        }
        return -1;
    }
}