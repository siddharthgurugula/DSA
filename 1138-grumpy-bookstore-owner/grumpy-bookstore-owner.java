class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n=customers.length;

        int alreadyhappy=0;
        for(int i=0;i<n;i++) {
            if(grumpy[i]==0) {
                alreadyhappy+=customers[i];
            }
        }
        
        int i=0,sum=0,max=0;
        for(int j=0;j<n;j++) {
            if(grumpy[j]==1) {
                sum=sum+customers[j];
            }
            if(j-i+1==minutes) {
                max=Math.max(sum,max);
                if(grumpy[i]==1) {
                   sum=sum-customers[i];
                }
                i++;
            } 
        }
        return alreadyhappy+max;     
    }
}