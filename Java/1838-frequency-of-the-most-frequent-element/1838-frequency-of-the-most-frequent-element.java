class Solution {
    public int maxFrequency(int[] nums, int k) {
        int max = 0;

        Arrays.sort(nums);
        long sum=0;
        int i=0;
        int j=0;
        while(j<nums.length){
            sum=sum+nums[j];

            while((long)nums[j]*(j-i+1)-sum>k){
                sum=sum-nums[i];
                i=i+1;
            }
            max=Math.max(max,j-i+1);
            j=j+1;
        }
        return max;

        // for (int right = 0; right < nums.length; right++) {
        //     int sum = 0;
        //     for (int left = right; left < nums.length; left++) {
        //         sum += nums[left];

        //         int total = nums[left] * (left - right + 1);
        //         int x = total - sum;
        //         if (x > k) {
        //             break;
        //         }
        //         max = Math.max(max, left - right + 1);
        //     }
        // }
        // return max;
    }
}