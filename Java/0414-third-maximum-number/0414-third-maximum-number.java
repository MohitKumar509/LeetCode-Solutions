class Solution {
    public int thirdMax(int[] nums) {
        long largest=Long.MIN_VALUE;
        long secondlargest=Long.MIN_VALUE;
        long thirdlargest=Long.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>largest){
                thirdlargest=secondlargest;
                secondlargest=largest;
                largest=nums[i];
            } 
            else if (nums[i]>secondlargest && nums[i]!=largest){
                thirdlargest=secondlargest;
                secondlargest=nums[i];
            }
            else if(nums[i]>thirdlargest && nums[i]!=secondlargest && nums[i]!=largest){
                thirdlargest=nums[i];
            }
        }
        if(thirdlargest == Long.MIN_VALUE){
            return (int) largest;
        }
        return (int) thirdlargest;
    }
}