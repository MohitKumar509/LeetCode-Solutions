class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<=nums.length-k;i++){
            int sum=0;
            for(int j=i;j<i+k;j++){
                sum=sum+nums[j];
            }
            maxSum=Math.max(maxSum,sum);
        }
        return(double) maxSum/k;
        // int sum=0;

        // for(int i=0;i<k;i++){
        //     sum=sum+nums[i];
            
        // }
        // int maxSum=sum;
        // for(int i=k;i<nums.length;i++){
        //     sum=sum+nums[i];
        //     sum=sum-nums[i-k];

        //     maxSum=Math.max(maxSum,sum);
        // }
        // return(double) maxSum/k;
    }
}